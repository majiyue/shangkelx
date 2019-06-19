package concurrency.Lock;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BasicReadWirtelLock {

    private static Map<String, String> map = new HashMap<>();

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readlock = lock.readLock();
    private final Lock writelock = lock.writeLock();

    private Integer counter = 0;


    public void put(String key, String value) {

        System.out.println(Thread.currentThread().getName() + " acquiring put write Lock");


        try {
            writelock.lock();
            System.out.println(Thread.currentThread().getName() + " put Locked");
            map.put(key, value);
            System.out.println("couter"+counter++);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            writelock.unlock();
        }
    }

    public String get(String key) {
        try {
            readlock.lock();
            return map.get(key);
        } finally {
            readlock.unlock();
        }
    }

    public String remove(String key) {
        try {
            writelock.lock();
            return map.remove(key);
        } finally {
            writelock.unlock();
        }
    }


    public boolean containsKey(String key) {
        try {
            readlock.lock();
            return map.containsKey(key);
        } finally {
            readlock.unlock();
        }
    }


    boolean isReadLock() {
        return readlock.tryLock();
    }


    private static class Reader implements Runnable {
        BasicReadWirtelLock object;

        public Reader(BasicReadWirtelLock lockedmap) {
            this.object = lockedmap;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "reading");
                object.get("key" + i);
                System.out.println("read"+i);
            }
        }
    }

    private static class writer implements Runnable {

        BasicReadWirtelLock object;

        private final int LOOP = 10;

        public writer(BasicReadWirtelLock object) {
            this.object = object;
        }

        @Override
        public void run() {
            for (int i = 0; i < LOOP; i++) {
                try {
                    object.put("key" + i, "value" + i);
                    System.out.println(Thread.currentThread().getName() + "writing");

                    System.out.println("write"+i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    public static void main(String[] args) {
        final int THREAD_COUNT = 4;
        final ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        BasicReadWirtelLock lock = new BasicReadWirtelLock();
        executor.execute(new Thread(new writer(lock), "writer1"));

        executor.execute(new Thread(new Reader(lock), "reader1"));

        executor.execute(new Thread(new Reader(lock), "reader2"));

        executor.execute(new Thread(new Reader(lock), "reader3"));

        executor.execute(new Thread(new writer(lock), "writer2"));
        executor.shutdown();

    }


}




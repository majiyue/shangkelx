package concurrency.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class BasicReentranLock implements Runnable{
    public static ReentrantLock lock = new ReentrantLock();
    public static int i=0;



    @Override
    public void run() {
        for (int j = 0; j <10000000 ; j++) {
            lock.lock();

            try {

                i++;
            }finally {
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        BasicReentranLock rlock = new BasicReentranLock();

        Thread l1 = new Thread(rlock);
        Thread l2 = new Thread(rlock);

        l1.start();
        l2.start();

        l1.join();
        l2.join();
        System.out.println(i);

    }
}

package concurrency.multthread;

public class BasicMethedSync implements Runnable {

    static BasicMethedSync instance = new BasicMethedSync();
    static int i = 0;


//    private synchronized void increase() {
//        i++;
//    }

    private static synchronized void increase() {
        i++;
    }


    @Override
    public void run() {

        for (int j = 0; j < 1000000000; j++) {
            increase();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BasicMethedSync());
        Thread t2 = new Thread(new BasicMethedSync());
        Thread t3 = new Thread(new BasicMethedSync());
        Thread t4 = new Thread(new BasicMethedSync());

        long prev = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();


        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long cur = System.currentTimeMillis();


        System.out.println("Final result" + i);
        System.out.println("Timer used" + (cur - prev));
    }
}


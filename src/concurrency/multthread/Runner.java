package concurrency.multthread;

public class Runner {
    public static void main(String[] args) {

        //Runnable
        Thread t1  =new Thread(new BasicRunnable(),"t1");
        Thread t2 = new Thread(new BasicRunnable(),"t2");

        System.out.println("App start"+ Thread.currentThread().getName());
        System.out.println("Starting Runnable thread!");
        t1.start();
        t2.start();
        System.out.println("Runnable thread has Started");


        //Thread
        Thread t3 = new BasicThread("t3");
        Thread t4 = new BasicThread("t4");
        t3.start();
        t4.start();
        System.out.println("ALL thread has started");

    }
}

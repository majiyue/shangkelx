package kexialianxi;

import java.util.concurrent.locks.ReentrantLock;

class Window implements Runnable {
    private static int ticket = 100;

    private ReentrantLock re = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {

                re.lock();


                if ( ticket > 0 ) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                    System.out.println(Thread.currentThread().getName() + "窗口，售票：" + ticket);
                    ticket--;

                } else {
                    break;
                }
            }finally {

                re.unlock();
            }
        }
    }
}

public class WindowTestLock {

    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("一号");
        t2.setName("二号");
        t3.setName("三号");

        t1.start();
        t2.start();
        t3.start();

    }


}








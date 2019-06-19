package kexialianxi;


import java.nio.channels.Pipe;

class Number implements Runnable{

    private int number = 1;
    @Override
    public void run() {

        while (true){
            synchronized (this) {
                notify();            //线程一先进来后执行到wait（）后阻塞并释放锁，此时，线程二进入执行notify（）唤醒线程一。

                if ( number <= 100 ) {


//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    System.out.println(Thread.currentThread().getName() + "-->" + number);
                    number++;


                    try {
                        wait();   //会释放锁。
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number n1 = new Number();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n1);


        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }



}

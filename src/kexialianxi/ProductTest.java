package kexialianxi;
/*
多线程问题

有共享数据

使用同步机制，三种方法。

涉及线程通信（wait），（notify）
 */

class Clerk {

    private int productCount = 0;


    public synchronized void produceProduct() {

        if ( productCount < 20 ) {
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productCount + "个产品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public synchronized void consumeProduct() {

        if ( productCount > 0 ) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productCount + "个产品");
            productCount--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


class Producer extends Thread {            //生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {

        System.out.println(getName() + ": 开始生产产品。。。。。");

        while (true) {
            try {
                sleep(13);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }

    }
}


class Consumer extends Thread {      //消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }


    @Override
    public void run() {
        System.out.println(getName() + ": 开始消费产品。。。。。");

        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}


public class ProductTest {
    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);
        producer.setName("生产者1");

        Consumer consumer = new Consumer(clerk);
        consumer.setName("消费者1");


        Consumer consumer2 = new Consumer(clerk);
        consumer2.setName("消费者2");

        producer.start();
        consumer.start();
        consumer2.start();
    }

}

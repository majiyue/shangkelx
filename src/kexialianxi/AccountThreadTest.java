package kexialianxi;


import java.util.concurrent.locks.ReentrantLock;

class Account {

    private double balance;

    private static ReentrantLock re = new ReentrantLock();

    public Account(double balance) {
        this.balance = balance;
    }

    public  void  deposit(double amt) {
        try {

            re.lock();
        if ( amt > 0 ) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance + amt;
            System.out.println(Thread.currentThread().getName()+" : 存钱成功，存了： " + amt + ",  余额为：" + balance);
        }
        }finally {
            re.unlock();
        }

    }
}


class Customer extends Thread {

    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }

    }


}


public class AccountThreadTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);


        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}

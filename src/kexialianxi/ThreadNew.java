package kexialianxi;

/*

使用Callable方式创建线程：
1、重写call方法，
2、可以有返回值
3、可以抛出异常
 */


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;

class NumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ( i % 2 == 0 ) {
                System.out.println(i);
                sum += i;
            }

        }
        return sum;
    }

}


public class ThreadNew {
    public static void main(String[] args) {
        NumThread nt = new NumThread();

        FutureTask futureTask = new FutureTask(nt);

        new Thread(futureTask).start();
        try {        //get返回值即为重写call 方法后的返回值。
            Object sum = futureTask.get();
            System.out.println("总和为： "+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}

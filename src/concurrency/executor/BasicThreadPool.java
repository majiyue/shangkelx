package concurrency.executor;

import java.util.concurrent.*;

public class BasicThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = creatThreadPool();
        MonitThread monitThread = new MonitThread(executor, 3);
        startWorking(executor, monitThread);

        stopWorking(executor, monitThread);
    }

    private static ThreadPoolExecutor creatThreadPool() {
        RejectedExecutor rejectedExecutor = new RejectedExecutor();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        return new ThreadPoolExecutor(
                2, 4, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), threadFactory, rejectedExecutor
        );
    }

    private static void startWorking(ThreadPoolExecutor executor, MonitThread monitThread) {
        Thread monit = new Thread(monitThread);
        monit.start();

        for (int i = 0; i < 10; i++) {
            executor.execute(new WorkThread("cmd "+i));
        }
    }

    private static void stopWorking(ThreadPoolExecutor executor, MonitThread monitThread) throws InterruptedException {
        Thread.sleep(30000);

        executor.shutdown();
        Thread.sleep(5000);
        monitThread.shutdown();
    }


}

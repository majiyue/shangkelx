package concurrency.executor;


import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledTask implements Runnable {
    private int taskid;

    public ScheduledTask(int taskid) {
        this.taskid = taskid;
    }

    @Override
    public void run() {
        System.out.println("Task #"+this.taskid+
                "run at "+ LocalDateTime.now());
    }

}


public class BasicScheduledExecutor{
    public static void main(String[] args) {
        ScheduledExecutorService executor  = Executors.newScheduledThreadPool(3);

        ScheduledTask task1 = new ScheduledTask(1);
        ScheduledTask task2 = new ScheduledTask(2);

        executor.schedule(task1, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(task2, 0, 10, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();

    }
}
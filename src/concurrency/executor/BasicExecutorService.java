package concurrency.executor;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BasicTask implements Runnable {

    private int taskid;
    private int loopCounter;

    public BasicTask(int taskid, int loopCounter) {
        this.taskid = taskid;
        this.loopCounter = loopCounter;
    }


    @Override
    public void run() {

        for (int i = 0; i < loopCounter; i++) {
            try {

                System.out.println("Task#" + this.taskid + "Iteration #" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println("Task#" + this.taskid + "is stopped");
                e.printStackTrace();

            }
        }
    }
}

public class BasicExecutorService {

    public static void main(String[] args) {
        final int THREAD_COUNT = 3;
        final int LOOP_COUNT = 3;
        final int TASK_COUNT = 5;


        ExecutorService exec = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < TASK_COUNT; i++) {
            BasicTask task = new BasicTask(i+1, LOOP_COUNT);
            exec.submit(task);
        }
        exec.shutdown();

    }

}

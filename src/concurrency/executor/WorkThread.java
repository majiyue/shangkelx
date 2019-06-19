package concurrency.executor;

public class WorkThread implements Runnable {

    private String command;

    public WorkThread(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start Command:" + command);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "End");

    }




    @Override
    public String toString() {
        return "WorkThread{" +
                "command='" + command + '\'' +
                '}';
    }
}

package gof.structure.proxy;

public class DemoProxy {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("damo", "2018");
        try {
            executor.run("ls -ltr");
            executor.run("rm -f lala.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

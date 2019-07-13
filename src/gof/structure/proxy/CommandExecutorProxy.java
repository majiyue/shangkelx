package gof.structure.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if ( "damo".equalsIgnoreCase(user) && "2019".equalsIgnoreCase(password) ) {
            isAdmin = true;
        }
        executor = new CommandExcutorImpl();
    }

    @Override
    public void run(String cmd) throws Exception {
        if ( isAdmin ) {
            executor.run(cmd);

        } else {
            if ( cmd.trim().startsWith("rm") ) {
                throw new Exception("rm command is not allowed for non-admin users");

            }else {
                executor.run(cmd);
            }
        }
    }
}

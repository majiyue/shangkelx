package gof.behaviour.command;

public class Programmer implements Command {
    @Override
    public void execute() {
        System.out.println("sell the bugs and fix them");

    }
}

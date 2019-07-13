package gof.behaviour.state;

public class On implements State {
    @Override
    public void doAction() {
        System.out.println("TV turn on");

    }
}

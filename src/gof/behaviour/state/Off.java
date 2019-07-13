package gof.behaviour.state;

public class Off implements State {
    @Override
    public void doAction() {
        System.out.println("TV turn off");
    }
}

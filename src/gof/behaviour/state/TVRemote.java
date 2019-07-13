package gof.behaviour.state;

public class TVRemote {
    public static void main(String[] args) {
        TV tv = new TV();
        State on = new On();
        State off = new Off();

        tv.setState(on);
        tv.doAction();


        tv.setState(off);
        tv.doAction();
    }
}
package gof.structure.bridge;

public class StackHanol extends Stack {
    private int totalRejected = 0;

    public StackHanol() {
        super("array");

    }

    public StackHanol(String type) {
        super(type);

    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void push(int in) {
        if ( !isEmpty() && in > top() ) {
            totalRejected++;

        } else {
            super.push(in);
        }
    }


}

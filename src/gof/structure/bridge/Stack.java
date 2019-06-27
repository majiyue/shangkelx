package gof.structure.bridge;

import kexialianxi.ThreadPool;

public class Stack {
    private StackImpl impl;

    Stack(String type) {
        if ( "array".equals(type) ) {
            impl = new StackArray();
        } else if ( "list".equalsIgnoreCase(type) ) {
            impl = new StackLink();
        }else {
            System.out.println("unknown parameter");

        }
    }

    public Stack() {
//        impl = new StackArray();
        this("array");

    }

    public void push(int in) {
        impl.push(in);

    }

    public int pop() {
        return impl.pop();
    }

    public int top() {
        return impl.top();
    }

    public boolean isEmpty() {
        return impl.isEmpty();
    }

    public boolean isFull() {
        return impl.isFull();
    }

}

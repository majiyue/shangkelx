package gof.structure.bridge;

import com.sun.jdi.IntegerValue;

public class Node {
    public int Value;


    public Node prev, next;

    public Node(int value) {
        Value = value;
    }
}


package gof.structure.bridge;

import java.util.Random;

public class DemoBridge {
    public static void main(String[] args) {
        Stack[] stacks = {
                new Stack("array"),
                new Stack("list"),
                new StackHanol()};
        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 2; j++) {
                stacks[j].push(i);
            }
        }
        Random rm = new Random();
        for (int i = 1; i < 100; i++) {
            stacks[2].push(rm.nextInt(100));
        }
        for (int i = 0; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop() + " ");
            }
            System.out.println();
        }
        System.out.println("Total rejected is " + ((StackHanol) stacks[2]).reportRejected());
    }
}
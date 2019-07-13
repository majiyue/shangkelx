package gof.behaviour.command;

import java.util.ArrayList;
import java.util.List;

public class DemoCommand {



    public static void main(String[] args) {

        List queue = productCommands();
        consumeCommands(queue);


    }

    private static void consumeCommands(List queue) {
        for(Object command:queue){
            ((Command)command).execute();

        }

    }

    private static List productCommands() {
        List<Command> list = new ArrayList<>();

        list.add(new Designer());
        list.add(new Politician());
        list.add(new Programmer());

        return list;

    }
}

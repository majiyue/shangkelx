package java8.fi;

import java.util.function.Consumer;

public class BasicConsumer {
    public static void main(String[] args) {
        Consumer <String> c1 = (x)-> System.out.println(x.toLowerCase());
        Consumer <String> c2 = (x)-> System.out.println(x.toUpperCase());



        c1.andThen(c2).accept("MicroSoft");

//        c1.accept("MicroSoft");
//        c2.accept("MicroSoft");

    }
}

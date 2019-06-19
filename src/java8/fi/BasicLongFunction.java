package java8.fi;

import java.util.function.LongFunction;

public class BasicLongFunction {
    public static void main(String[] args) {
        LongFunction<String> i =Long::toString;

        System.out.println(i.apply(Long.MAX_VALUE));
        System.out.println(i.apply(Long.MIN_VALUE));

    }
}

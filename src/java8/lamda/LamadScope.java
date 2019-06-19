package java8.lamda;

import java.util.function.Function;

public class LamadScope {
    private LamadScope() {
//        Function<String, String> f1 = x -> {
//            System.out.println(this);
//            return x;
//        };

        Function<String,String> f1 =new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println(this);
                return s;
            }
        };

        System.out.println(f1.apply("MJY"));

    }

    @Override
    public String toString() {
        return "I an Lamda Scope";
    }

    public static void main(String[] args) {
        new LamadScope();
    }
}

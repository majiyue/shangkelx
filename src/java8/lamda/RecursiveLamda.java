package java8.lamda;

import java.util.function.IntFunction;

public class RecursiveLamda {
    public static void main(String[] args) {
        IntFunction<Long> facCalc = n -> factorial(n);
        System.out.println(facCalc.apply(13));




    }

    private static long factorial(int n) {
        if ( n == 1 )
            return 1;
        else {
            return n * factorial(n - 1);
        }
    }
}

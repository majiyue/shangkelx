package java8.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OperateStream {
    public static void main(String[] args) {
        //(1,11,2,12,3,13...)
        Stream.of(1, 2, 3, 4, 5)
                .map(n -> n * n)
                .flatMap(n -> Stream.of(n, n + 10))
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}

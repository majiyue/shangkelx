package java8.steam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;

public class CreatBuilder {

    static int i = 0;

    private static int next() {
        i++;
        return i;
    }


    public static void main(String[] args) {
        Stream<String> stream = Stream.<String>builder()
                .add("Web")
                .add("Java")
                .add("Android")
                .add("Cloud")
                .add("C++")
                .add("C#")
                .build();
        stream.forEach(System.out::println);

        String str = "4 5 33 55 66 22 45 abc,12,4,1,23,3";

        str.chars()
                .filter(n -> !Character.isDigit(n) || !Character.isWhitespace(n))
                .forEach(n -> System.out.print(n));

        Stream<String> classes = Arrays.stream(new String[]{"java", "damo", "mjy"});
        classes.forEach(System.out::println);


        Set<String> names = new HashSet<>();
        names.add("java");
        names.add("mjy");
        names.add("damo");


        Stream<String> sequentialStream = names.stream();
        sequentialStream.forEach(System.out::println);

        Stream<String> parallelStream = names.parallelStream();
        parallelStream.forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);


        Stream.generate(CreatBuilder::next)
                .limit(100)
                .forEach(System.out::println);

        Stream.generate(new Random()::nextFloat)
                .limit(10)
                .forEach(System.out::println);



        String[] selfArray = {"I am mjy", "aaaaaa"};
        Stream<String> self = Stream.of(selfArray);
        self.forEach(System.out::println);


        Stream.iterate(1, n -> n + 1)
                .peek(n -> System.out.println("Unfiltered number" + n))
                .filter(n -> n % 2 != 0)
                .peek(n -> System.out.println("Filtered number" + n))
                .skip(10)
                .limit(5)
                .forEach(System.out::println);

    }



}

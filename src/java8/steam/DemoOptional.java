package java8.steam;

import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("man");

        System.out.println(gender);
        System.out.println(gender.get());
        System.out.println(Optional.empty());
        System.out.println(Optional.empty().orElse("default"));

        System.out.println(Optional.ofNullable(null));

    }
}

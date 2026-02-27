package Java8Features;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> name = Optional.ofNullable(null);

        System.out.println(name.orElse("Default Value"));
    }
}
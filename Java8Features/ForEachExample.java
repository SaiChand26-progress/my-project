package Java8Features;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sai", "Ravi", "Kiran");

        names.forEach(name -> System.out.println(name));
    }
}
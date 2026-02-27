package Java8Features;

@FunctionalInterface
interface Calculator {
    int multiply(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Calculator calc = (a, b) -> a * b;

        System.out.println("Result: " + calc.multiply(5, 4));
    }
}
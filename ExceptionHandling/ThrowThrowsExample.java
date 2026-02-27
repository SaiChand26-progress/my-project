package ExceptionHandling;

public class ThrowThrowsExample {

    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) throws Exception {
        checkAge(15);
    }
}
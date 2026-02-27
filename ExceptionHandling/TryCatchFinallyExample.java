package ExceptionHandling;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally always executes");
        }
    }
}
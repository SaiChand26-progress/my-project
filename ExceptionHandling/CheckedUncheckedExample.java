package ExceptionHandling;

import java.io.*;

public class CheckedUncheckedExample {

    public static void main(String[] args) {

        // Checked Exception
        try {
            FileReader file = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception");
        }

        // Unchecked Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception");
        }
    }
}
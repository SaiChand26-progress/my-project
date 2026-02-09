package JavaTask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter billing amount: ");
        double amount = sc.nextDouble();

        int storedAmount = (int) amount; // explicit casting

        System.out.println("Original Amount: " + amount);
        System.out.println("Stored Integer Amount: " + storedAmount);

        if(amount != storedAmount){
            System.out.println("Precision loss detected!");
        }

        // implicit casting
        int num = 10;
        double implicit = num;

        System.out.println("Implicit casting example: " + implicit);

        sc.close();
    }

}

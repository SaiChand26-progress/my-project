package JavaTask;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Valid ID? (true/false): ");
        boolean validId = sc.nextBoolean();

        System.out.print("Active Subscription? (true/false): ");
        boolean subscription = sc.nextBoolean();

        if(age >= 18 && validId && subscription){
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }
        sc.close();
    }

}

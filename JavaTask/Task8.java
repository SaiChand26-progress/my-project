package JavaTask;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Start\n2.Stop\n3.Restart\n4.Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Service Started");
                    break;
                case 2:
                    System.out.println("Service Stopped");
                    break;
                case 3:
                    System.out.println("Service Restarted");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while(choice != 4);

        sc.close();
    }
}

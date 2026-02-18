package Strings16;

import java.util.Scanner;

public class Task6 {
     public static void main(String[] args) {

        String generatedOTP = "123456";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter OTP: ");
        String userOTP = sc.nextLine();

        if (generatedOTP.equals(userOTP)) {
            System.out.println("OTP Verified Successfully");
        } else {
            System.out.println("Invalid OTP");
        }

        sc.close();
    }
}

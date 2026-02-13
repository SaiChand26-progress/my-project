package Threads;

class Email extends Thread {

    public void run() {
        System.out.println("Sending email in background...");
    }
}

public class Task10 {

    public static void main(String[] args) {

        System.out.println("Order placed successfully!");

        Email email = new Email();
        email.start();

        System.out.println("Order confirmation shown immediately.");
    }
}

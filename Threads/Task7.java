package Threads;

class Payment extends Thread {

    public void run() {
        try {

            int delay = (int)(Math.random() * 3000) + 1000;

            Thread.sleep(delay);

            System.out.println(getName() + " Payment completed.");

        } catch (Exception e) {}
    }
}

public class Task7 {

    public static void main(String[] args) {

        new Payment().start();
        new Payment().start();
        new Payment().start();
    }
}

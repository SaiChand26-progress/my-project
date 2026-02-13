package Threads;

class Ticket {

    int available = 10;

    synchronized void book(int seats) {

        if (available >= seats) {

            System.out.println(Thread.currentThread().getName()
                    + " booked " + seats);

            available -= seats;

            System.out.println("Remaining tickets: " + available);

        } else {
            System.out.println("Not enough tickets!");
        }
    }
}

public class Task6 {

    public static void main(String[] args) {

        Ticket t = new Ticket();

        Runnable user = () -> t.book(3);

        for (int i = 1; i <= 5; i++) {
            new Thread(user, "User-" + i).start();
        }
    }
}

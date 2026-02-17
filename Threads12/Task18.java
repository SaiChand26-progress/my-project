package Threads12;

import java.util.concurrent.*;

class Account {

    private int balance = 10000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {

            balance -= amount;

            System.out.println(Thread.currentThread().getName()
                    + " withdrew " + amount +
                    " Remaining: " + balance);
        }
    }
}

public class Task18 {

    public static void main(String[] args) {

        Account acc = new Account();

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            service.execute(() -> acc.withdraw(2000));
        }

        service.shutdown();
    }
}
package Threads;

class Account {

    int balance = 5000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " withdrawing " + amount);

            balance -= amount;

            System.out.println("Remaining balance: " + balance);

        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Task4 {

    public static void main(String[] args) {

        Account acc = new Account();

        Runnable customer = () -> acc.withdraw(2000);

        new Thread(customer, "Customer-1").start();
        new Thread(customer, "Customer-2").start();
        new Thread(customer, "Customer-3").start();
    }
}

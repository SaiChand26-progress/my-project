package Threads;

class Inventory {

    int stock = 100;

    void updateStock(int qty) {

        System.out.println("Logging update...");

        synchronized (this) {
            stock -= qty;
            System.out.println("Stock updated: " + stock);
        }
    }
}

public class Task5 {

    public static void main(String[] args) {

        Inventory inv = new Inventory();

        Runnable task = () -> inv.updateStock(10);

        new Thread(task).start();
        new Thread(task).start();
    }
}

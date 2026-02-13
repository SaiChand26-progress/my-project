package Threads;

class Order implements Runnable {

    private String name;

    Order(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " Validation done.");
        System.out.println(name + " Payment processed.");
        System.out.println(name + " Order completed.");
    }
}

public class Task2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Order("Order-" + i));
            t.start();
        }
    }
}

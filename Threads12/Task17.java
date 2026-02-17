package Threads12;

public class Task17 {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        Runnable task = () -> {

            synchronized (lock1) {

                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName()
                            + " completed safely");
                }
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
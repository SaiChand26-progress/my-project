package Threads12;

import java.util.concurrent.*;

class ApiTask implements Runnable {

    private int id;

    ApiTask(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " processing request " + id);
    }
}

public class Task11 {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            service.submit(new ApiTask(i));
        }

        service.shutdown();
    }
}

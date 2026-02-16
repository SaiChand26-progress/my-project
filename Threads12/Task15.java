package Threads12;

import java.util.concurrent.*;

public class Task15 {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        ExecutorService service = Executors.newFixedThreadPool(2);

        // Producer
        service.execute(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.put("Order-" + i);
                    System.out.println("Produced: Order-" + i);
                }
            } catch (Exception e) {}
        });

        // Consumer
        service.execute(() -> {
            try {
                while (true) {
                    String order = queue.take();
                    System.out.println("Consumed: " + order);
                }
            } catch (Exception e) {}
        });
    }
}

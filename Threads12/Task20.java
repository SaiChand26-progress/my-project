package Threads12;

import java.util.concurrent.*;

public class Task20 {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(10);

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100; i++) {

            service.execute(() -> {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
            });
        }

        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);

        long end = System.currentTimeMillis();

        System.out.println("Total time taken: " + (end - start) + " ms");
    }
}
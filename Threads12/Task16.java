package Threads12;

import java.util.concurrent.*;

public class Task16 {

    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(
                        2,
                        4,
                        10,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(5)
                );

        try {

            for (int i = 1; i <= 30; i++) {

                int id = i;

                executor.execute(() ->
                        System.out.println("Task " + id +
                                " executed by " +
                                Thread.currentThread().getName()));
            }

        } finally {

            executor.shutdown(); 
        }
    }
}
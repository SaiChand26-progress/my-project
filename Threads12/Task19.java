package Threads12;

import java.util.*;
import java.util.concurrent.*;

public class Task19 {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(5);

        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            int id = i;

            tasks.add(() -> {
                Thread.sleep(2000);
                return "Report-" + id + " generated";
            });
        }

        List<Future<String>> results = service.invokeAll(tasks);

        for (Future<String> f : results) {
            System.out.println(f.get());
        }

        service.shutdown();
    }
}
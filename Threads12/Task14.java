package Threads12;

import java.util.concurrent.*;

public class Task14 {

    public static void main(String[] args) throws Exception {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        Runnable job = () ->
                System.out.println("Cleaning temporary files...");

        scheduler.scheduleAtFixedRate(job, 0, 5, TimeUnit.SECONDS);

        Thread.sleep(15000);
        scheduler.shutdown();
    }
}

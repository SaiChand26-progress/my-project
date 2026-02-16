package Threads12;

import java.util.concurrent.*;

class FileTask implements Runnable {

    private String file;

    FileTask(String file) {
        this.file = file;
    }

    public void run() {
        try {
            System.out.println("Processing " + file);
            Thread.sleep(3000);
            System.out.println(file + " completed");
        } catch (Exception e) {}
    }
}

public class Task13 {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            service.execute(new FileTask("File-" + i));
        }

        service.shutdown();
    }
}

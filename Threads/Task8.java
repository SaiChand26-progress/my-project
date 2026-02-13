package Threads;

class LogScanner extends Thread {

    public void run() {
        try {

            for (int i = 1; i <= 3; i++) {

                System.out.println("Scanning logs... Cycle " + i);

                Thread.sleep(5000);
            }

        } catch (Exception e) {}
    }
}

public class Task8 {

    public static void main(String[] args) throws Exception {

        LogScanner scanner = new LogScanner();

        System.out.println("State before start: " + scanner.getState());

        scanner.start();

        while (scanner.isAlive()) {
            System.out.println("Current State: " + scanner.getState());
            Thread.sleep(1000);
        }

        System.out.println("Final State: " + scanner.getState());
    }
}

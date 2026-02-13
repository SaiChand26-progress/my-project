package Threads;

class Report extends Thread {

    private String reportName;

    Report(String name) {
        this.reportName = name;
    }

    public void run() {
        try {
            System.out.println(reportName + " generating...");
            Thread.sleep(2000);
            System.out.println(reportName + " completed.");
        } catch (Exception e) {}
    }
}

public class Task3 {

    public static void main(String[] args) throws Exception {

        Report r1 = new Report("Sales Report");
        Report r2 = new Report("Inventory Report");
        Report r3 = new Report("Profit Report");

        r1.start();
        r2.start();
        r3.start();

        r1.join();
        r2.join();
        r3.join();

        System.out.println("All reports completed.");
    }
}

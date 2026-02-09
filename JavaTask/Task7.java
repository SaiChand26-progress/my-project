package JavaTask;

public class Task7 {
    public static void main(String[] args) {

        double cpuUsed = 65;
        double cpuTotal = 100;

        double memUsed = 70;
        double memTotal = 100;

        double cpuPercent = (cpuUsed / cpuTotal) * 100;
        double memPercent = (memUsed / memTotal) * 100;

        String status = (cpuPercent < 80 && memPercent < 80) ? "HEALTHY" : "CRITICAL";

        System.out.println("CPU Usage: " + cpuPercent + "%");
        System.out.println("Memory Usage: " + memPercent + "%");
        System.out.println("System Status: " + status);
    }
}

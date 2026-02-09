package JavaTask;

public class Task3 {
    public static void main(String[] args) {

        int maxUsers = 120;
        double threshold = 75.5;
        boolean featureFlag = true;
        String environment = "PRODUCTION";

        System.out.println("Max Users: " + maxUsers);
        System.out.println("Threshold: " + threshold);
        System.out.println("Feature Enabled: " + featureFlag);
        System.out.println("Environment: " + environment);

        if (maxUsers > 100 || threshold > 70) {
            System.out.println("WARNING: Limits exceed safe thresholds!");
        }
    }

}

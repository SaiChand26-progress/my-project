package Strings16;

public class Task10 {

    public static void main(String[] args) {

        String logs =
                "INFO Start\n" +
                "ERROR Failed login\n" +
                "INFO Running\n" +
                "ERROR Database down\n" +
                "ERROR Timeout";

        String[] lines = logs.split("\n");

        int count = 0;

        for (String line : lines) {
            if (line.contains("ERROR")) {
                count++;
            }
        }

        System.out.println("Total ERROR lines: " + count);
    }
}

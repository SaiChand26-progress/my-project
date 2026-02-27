package FileHandling23;

import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("sample.txt"));

        writer.write("Line 1\n");
        writer.write("Line 2\n");
        writer.write("Line 3\n");
        writer.write("Line 4\n");
        writer.write("Line 5\n");

        writer.close();

        System.out.println("Data written successfully.");
    }
}
package FileHandling23;

import java.io.*;

public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("sample.txt", true));

        writer.newLine();
        writer.write("Appended Line");

        writer.close();

        System.out.println("Data appended successfully.");
    }
}
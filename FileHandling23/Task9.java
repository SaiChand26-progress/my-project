package FileHandling23;

import java.io.*;

public class Task9 {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("merged.txt"));

        String[] files = {"file1.txt", "file2.txt"};

        for (String fileName : files) {

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
        }

        writer.close();

        System.out.println("Files merged successfully.");
    }
}
package FileHandling23;

import java.io.*;

public class Task8 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new FileReader("source.txt"));

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("destination.txt"));

        String line;

        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();

        System.out.println("File copied successfully.");
    }
}
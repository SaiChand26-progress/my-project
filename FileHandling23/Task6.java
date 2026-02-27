package FileHandling23;

import java.io.*;

public class Task6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new FileReader("sample.txt"));

        int wordCount = 0;
        String line;

        while ((line = reader.readLine()) != null) {

            String[] words = line.split(" ");
            wordCount += words.length;
        }

        reader.close();

        System.out.println("Total Words: " + wordCount);
    }
}
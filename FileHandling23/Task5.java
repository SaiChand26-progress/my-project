package FileHandling23;

import java.io.*;

public class Task5 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new FileReader("sample.txt"));

        int count = 0;

        while (reader.readLine() != null) {
            count++;
        }

        reader.close();

        System.out.println("Total Lines: " + count);
    }
}
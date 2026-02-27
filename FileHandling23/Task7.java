package FileHandling23;

import java.io.*;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String searchWord = sc.nextLine();

        BufferedReader reader =
                new BufferedReader(new FileReader("sample.txt"));

        String line;
        int lineNumber = 1;

        while ((line = reader.readLine()) != null) {

            if (line.contains(searchWord)) {
                System.out.println("Found at line: " + lineNumber);
            }

            lineNumber++;
        }

        reader.close();
        sc.close();
    }
}
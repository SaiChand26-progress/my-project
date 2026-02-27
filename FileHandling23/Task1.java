package FileHandling23;

import java.io.File;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            file.createNewFile();
            System.out.println("File created.");
        }

        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
    }
}
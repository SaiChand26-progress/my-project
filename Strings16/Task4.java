package Strings16;

public class Task4 {
     public static void main(String[] args) {

        String text = "<h1>Hello</h1>";

        String clean = text.replaceAll("<.*?>", "");

        System.out.println("Output: " + clean);
    }
}

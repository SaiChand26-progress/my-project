package Strings16;

public class Task2 {
    public static void main(String[] args) {

        String url = "https://example.com";

        if (url.startsWith("http://") || url.startsWith("https://")) {
            System.out.println("Valid URL");
        } else {
            System.out.println("Invalid URL");
        }
    }
}

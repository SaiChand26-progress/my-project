package Strings16;

public class Task9 {

    public static void main(String[] args) {

        String input = "java string programs";

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase());
            result.append(words[i].substring(1));
        }

        System.out.println("camelCase: " + result);
    }
}

package Strings16;

public class Task1 {

    public static void main(String[] args) {

        String input = "Kern Software Solutions";

        String[] words = input.split(" ");
        StringBuilder username = new StringBuilder();

        for (String word : words) {
            username.append(word.charAt(0));
            username.append(word.substring(1)
                    .replaceAll("[aeiouAEIOU]", ""));
        }

        System.out.println("Username: " + username.toString().toLowerCase());
    }
}

package Strings16;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        String paragraph = "Java is powerful and Java is popular";

        String[] words = paragraph.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Repeated words:");
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " -> " + map.get(key));
            }
        }
    }
}

package org.example.Lection10;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String[] string1 = {"a", "b", "a", "c", "b"};
        String[] string2 = {"c", "b", "a"};
        String[] string3 = {"c", "c", "c", "c"};

        System.out.println(countWords(string1));
        System.out.println(countWords(string2));
        System.out.println(countWords(string3));
    }

    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}

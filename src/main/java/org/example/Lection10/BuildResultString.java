package org.example.Lection10;
import java.util.HashMap;
import java.util.Map;

public class BuildResultString {
    public static void main(String[] args) {
        String[] string1 = {"a", "b", "a"};
        String[] string2 = {"a", "b", "a", "c", "a", "d", "a", "b"};
        String[] string3 = {"a", "", "a"};

        System.out.println(buildResultString(string1));
        System.out.println(buildResultString(string2));
        System.out.println(buildResultString(string3));
    }

    public static String buildResultString(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                countMap.put(str, countMap.getOrDefault(str, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 == 0){
                result.append(entry.getKey());
            }
        }
        return !result.isEmpty() ? result.toString() : "";
    }
}

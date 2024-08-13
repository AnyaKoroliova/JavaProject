package org.example.Lection10;
import java.util.HashMap;
import java.util.Map;

public class MergeStringsByFirstChar {
    public static void main(String[] args) {
        String[] string1 = {"salt", "tea", "soda", "toast"};
        String[] string2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] string3 = {};

        System.out.println(mergeStringsByFirstChar(string1));
        System.out.println(mergeStringsByFirstChar(string2));
        System.out.println(mergeStringsByFirstChar(string3));
    }

    public static Map<String, String> mergeStringsByFirstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                String firstChar = str.substring(0, 1);
                if (result.containsKey(firstChar)) {
                    result.put(firstChar, result.get(firstChar) + str);
                } else {
                    result.put(firstChar, str);
                }
            }
        }

        return result;
    }
}

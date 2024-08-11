package org.example.Lection10;
import java.util.HashMap;
import java.util.Map;

public class LengthOfStrings {
    public static void main(String[] args) {
        String[] string1 = {"a", "bb", "a", "bb"};
        String[] string2 = {"this", "and", "that", "and"};
        String[] string3 = {"code", "code", "code", "bug"};

        System.out.println(getLengthOfStrings(string1));
        System.out.println(getLengthOfStrings(string2));
        System.out.println(getLengthOfStrings(string3));
    }


    public static Map<String, Integer> getLengthOfStrings(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            if (!result.containsKey(str)) {
                result.put(str, str.length());
            }
        }
        return result;
        }
}


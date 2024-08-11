package org.example.Lection10;
import java.util.HashMap;
import java.util.Map;

public class CreateMap {
    public static void main(String[] args) {
        String[] string1 = {"code", "bug"};
        String[] string2 = {"man", "moon", "main"};
        String[] string3 = {"man", "moon", "good", "night"};

        System.out.println(createMap(string1));
        System.out.println(createMap(string2));
        System.out.println(createMap(string3));
    }

    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            if (str != null && !str.isEmpty()) {
                String firstChar = str.substring(0, 1);
                String lastChar = str.substring(str.length() - 1);

                result.putIfAbsent(firstChar, lastChar);
            }
        }

        return result;
    }
}

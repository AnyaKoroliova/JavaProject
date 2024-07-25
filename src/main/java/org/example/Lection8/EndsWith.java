package org.example.Lection8;

public class EndsWith {
    public static void main(String[] args) {
        String str1 = "Hiabc";
        String str2 = "abc";

        boolean result = endsWith(str1, str2);

        System.out.println(result);
    }

    public static boolean endsWith(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}

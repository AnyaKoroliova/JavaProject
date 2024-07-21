package org.example.Lection6;

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lengthA = a.length();
        int lengthB = b.length();
        int maxLength = Math.max(lengthA, lengthB);

        for (int i = 0; i < maxLength; i++) {
            if (i < lengthA) {
                result.append(a.charAt(i));
            }
            if (i < lengthB) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }
}

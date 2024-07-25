package org.example.Lection8;

public class DoubleChars {
    public static void main(String[] args) {
        String string = "Hi-There";
        String newString = doubleChars(string);

        System.out.println(newString);
    }

    public static String doubleChars(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            result.append(a).append(a);
        }
        return result.toString();
    }
}

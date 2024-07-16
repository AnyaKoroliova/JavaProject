package org.example.Lection6;

public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }

    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);

        return end.repeat(Math.max(0, n));
    }
}

package org.example.Lection8;

public class CountHi {
    public static void main(String[] args) {
        String string = "hihi";
        int count = countHi(string);

        System.out.println(count);
    }
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }
}

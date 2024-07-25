package org.example.Lection8;

public class CatDog {
    public static void main(String[] args) {
        String string = "catcat";
        boolean result = catDog(string);

        System.out.println(result);
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String substring = str.substring(i, i + 3);
            if (substring.equals("cat")) {
                catCount++;
            } else if (substring.equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
}

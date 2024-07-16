package org.example.Lection6;

public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    public static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }
}

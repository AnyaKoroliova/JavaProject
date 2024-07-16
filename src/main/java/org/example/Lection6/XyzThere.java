package org.example.Lection6;

public class XyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str){
        return str.matches(".*(?<!\\.)xyz.*");
    }
}

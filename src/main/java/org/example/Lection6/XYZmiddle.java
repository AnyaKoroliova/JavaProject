package org.example.Lection6;

public class XYZmiddle {

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int xyzLen = 3;

        if (len < xyzLen) {
            return false;
        }

        for (int i = 0; i <= len - xyzLen; i++) {
            if (str.substring(i, i + xyzLen).equals("xyz")) {
                int leftLen = i;
                int rightLen = len - (i + xyzLen);

                if (Math.abs(leftLen - rightLen) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
}

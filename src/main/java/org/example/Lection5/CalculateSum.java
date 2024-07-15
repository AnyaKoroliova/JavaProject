package org.example.Lection5;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = console.nextInt();

        String sum = calculateSumUpToN(number);
        System.out.println(sum);
    }

    public static String calculateSumUpToN(int n) {
        if (n <= 0) {
            return "Хибні вхідні параметри";
        }

        return (n * (n + 1) / 2) + "";
    }
}

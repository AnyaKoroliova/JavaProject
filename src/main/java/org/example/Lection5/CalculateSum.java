package org.example.Lection5;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = console.nextInt();

        if (number <= 0) {
            System.out.print("Хибні вхідні параметри");
            return;
        }

        int sum = calculateSum(number);
        System.out.println(sum);
    }

    public static int calculateSum(int n){
        return (n * (n + 1) / 2);
    }
}

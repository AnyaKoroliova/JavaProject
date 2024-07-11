package org.example.Lection5;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = console.nextInt();

        Boolean result = isPerfectSquare(number);
        System.out.println(result);
    }

    public static boolean isPerfectSquare(int number){
        double squareRoot = Math.sqrt(number);
        return squareRoot % 1 == 0;
    }

}

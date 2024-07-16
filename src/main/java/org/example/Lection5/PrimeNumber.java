package org.example.Lection5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = console.nextInt();

        boolean result = isPrime(number);
        System.out.println(result);
    }

    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;

        }
        return true;
    }
}

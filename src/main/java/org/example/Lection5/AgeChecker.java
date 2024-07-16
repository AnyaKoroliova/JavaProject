package org.example.Lection5;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть ваш вік: ");
        int age = console.nextInt();

        String message = checkAge(age);
        System.out.println(message);
    }

    public static String checkAge(int age) {
        if (age >= 18) {
            return "Ви доросла особа";
        } else {
            return "Ви не є дорослою особою";
        }
    }
}

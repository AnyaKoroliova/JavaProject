package org.example;

public class Lection4 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Квадрат числа " + number + " дорівнює " + square(number));

        double r = 3.5;
        double h = 10.0;
        System.out.println("Об'єм циліндра з радіусом " + r + " і висотою " + h + " дорівнює " + volume(r,h));

        int a = 2;
        int b = 3;
        System.out.println("Результат " + a + " у ступені " + b + " дорівнює " + degree(a,b));
    }
    // Метод обчислення квадрата числа
    public static int square(int number) {
        return number * number;
    }

    // Метод обчислення об'єма циліндра
    public static double volume(double radius, double height) {
        return Math.PI * Math.pow(radius,2) * height;
    }

    // Метод підняття а до ступеня b
    public static int degree(int fistNumber, int secondNumber) {
        return (int)Math.pow(fistNumber, secondNumber);
    }
}

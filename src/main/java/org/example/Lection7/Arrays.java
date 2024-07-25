package org.example.Lection7;

import java.util.Scanner;

public class Arrays {
    static int[] number = {-1, -2, -3, -4, -5};

    public static double average() {
        double sum = 0;
        for (int x: number) {
            sum += x;
        }
        return sum/ number.length;
    }

    public static int min(){
        int min = number[0];
        for(int i = 1; i < number.length; i++){
            if (number[i] < min){
                min = number[i];
            }
        }
        return min;
    }
    public static int max(){
        int max = number[0];
        for(int i = 1; i < number.length; i++){
            if ( number[i] > max){
                max = number[i];
            }
        }
        return max;
    }

    public static void arrayInReverse() {
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
    public static boolean valueExist(int inputNum){
        for (int i : number) {
            if (inputNum == i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int inputNumber = console.nextInt();
        boolean message = valueExist(inputNumber);
        System.out.println(message);

        System.out.println("Середнє значення: " + average());
        System.out.println("Мінімальне значення: " + min() + " . " + "Максимальне значення: " + max());
        arrayInReverse();
    }

}

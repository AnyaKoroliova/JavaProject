package org.example.Lection7;

import java.util.Scanner;

public class Arrays {
    static int[] num = {-1, 2, 3, 4, 5};

    public static double average() {
        double sum = 0;
        for (int x: num) {
            sum += x;
        }
        return sum/num.length;
    }

    public static int min(){
        int min = 0;
        for( int i = 0; i < num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
    public static int max(){
        int max = 0;
        for( int i = 0; i < num.length; i++){
            if ( num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static void arrayInReverse() {
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
    public static boolean valExist(int inputNum){
        for (int i : num) {
            if (inputNum == i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int inputNum = console.nextInt();
        boolean message = valExist(inputNum);
        System.out.println(message);

        System.out.println("Середнє значення: " + average());
        System.out.println("Мінімальне значення: " + min() + " . " + "Максимальне значення: " + max());
        arrayInReverse();
    }

}

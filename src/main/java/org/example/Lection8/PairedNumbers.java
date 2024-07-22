package org.example.Lection8;

public class PairedNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 0};

        int paired = countEvenInts(numbers);

        System.out.println("Кількість парних чисел у масиві: " + paired);
    }

    public static int countEvenInts(int[] array) {
        int count = 0;
        for (int numbers : array) {
            if (numbers % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}
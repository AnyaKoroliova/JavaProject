package org.example.Lection8;

public class SumWithoutUnlucky13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 13, 99, 1, 13, 2, 4};

        int sum = sumWithoutUnlucky13(array);

        System.out.println("Сума чисел у масиві: " + sum);
    }

    public static int sumWithoutUnlucky13(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) {
                i++;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }
}

package org.example.Lection8;

public class SumIgnoreSections {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 6, 99, 99, 7};

        int sum = sumIgnoringSections(array);

        System.out.println("Сума чисел у масиві: " + sum);
    }

    public static int sumIgnoringSections(int[] array) {
        int sum = 0;
        boolean ignoreSections = false;

        for (int number : array) {
            if (number == 6) {
                ignoreSections = true;
            }
            if (!ignoreSections) {
                sum += number;
            }
            if (ignoreSections && number == 7) {
                ignoreSections = false;
            }
        }
        return sum;
    }
}

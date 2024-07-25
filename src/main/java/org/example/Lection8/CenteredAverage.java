package org.example.Lection8;
import java.util.Arrays;

public class CenteredAverage {
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 100};
    int[] array2 = {1, 1, 5, 5, 10, 8, 7};
    int[] array3 = {-10, -4, -2, -4, -2, 0};

    int centeredAvg = centeredAverage(array);
    int centeredAvg2 = centeredAverage(array2);
    int centeredAvg3 = centeredAverage(array3);

        System.out.println("Центроване середнє значення масиву: " + centeredAvg);
        System.out.println("Центроване середнє значення масиву: " + centeredAvg2);
        System.out.println("Центроване середнє значення масиву: " + centeredAvg3);
    }

    public static int centeredAverage(int[] array) {
        Arrays.sort(array);
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
        return sum / (array.length - 2);
    }
}

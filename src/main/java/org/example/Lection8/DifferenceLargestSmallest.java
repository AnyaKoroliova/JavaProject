package org.example.Lection8;

public class DifferenceLargestSmallest {
    public static void main(String[] args) {
        int[] array = {10, 3, 5, 6};
        int difference = differenceLargestSmallest(array);

        System.out.println("Різниця: " + difference);
    }

    public static int differenceLargestSmallest(int[] array) {
        int minNumber = array[0];
        int maxNumber = array[0];

        for (int number : array) {
            minNumber = Math.min(minNumber, number);
            maxNumber = Math.max(maxNumber, number);
        }
        return maxNumber - minNumber;
    }
}

package org.example.Lection10;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SetsIntersection {
    public static void main(String[] args) {
        LinkedHashSet<Integer> setA = new LinkedHashSet<>(Arrays.asList(1,2,3,4));
        LinkedHashSet<Integer> setB = new LinkedHashSet<>(Arrays.asList(3,5,6));

        setA.retainAll(setB);

        System.out.println(!setA.isEmpty());
    }


}

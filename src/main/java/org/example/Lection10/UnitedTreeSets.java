package org.example.Lection10;

import java.util.Arrays;
import java.util.TreeSet;

public class UnitedTreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>(Arrays.asList(1, 2, 3));
        TreeSet<Integer> setB = new TreeSet<>(Arrays.asList(3, 4, 5));

        TreeSet<Integer> unitedSet = new TreeSet<>(setA);
        unitedSet.addAll(setB);
        System.out.println(unitedSet);
    }
}

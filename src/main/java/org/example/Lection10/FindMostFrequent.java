package org.example.Lection10;

import java.util.HashMap;
import java.util.Map;

public class FindMostFrequent {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 2, 2, 1, 2, 3, 3, 3};

        System.out.println(findMostFrequent(numbers));
    }

    public static Integer findMostFrequent(Integer[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : numbers) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Integer mostFrequent = null;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
}

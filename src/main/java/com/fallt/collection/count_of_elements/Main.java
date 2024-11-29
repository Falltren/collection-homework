package com.fallt.collection.count_of_elements;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 1, 3, 2, 3, 1};
        System.out.println(calculateElementsCount(array));
    }

    public static <T> Map<T, Integer> calculateElementsCount(T[] array) {
        Map<T, Integer> result = new HashMap<>();
        for (T t : array) {
            result.compute(t, (key, value) -> (value == null) ? 1 : value + 1);
        }
        return result;
    }

}

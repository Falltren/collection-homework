package com.fallt.collection.filter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Filter filter = o -> (Integer) o * 2;
        Integer[] integerArray = new Integer[]{3, 5, 6, 8};
        System.out.println(Arrays.toString(filter(integerArray, filter)));
        String[] stringArray = new String[]{"Один", "два", "три"};
        System.out.println(Arrays.toString(filter(stringArray, o -> ((String) o).length())));
    }

    public static Object[] filter(Object[] array, Filter filter) {
        Object[] result = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }

}

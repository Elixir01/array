package com.amrit.array;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] intArray = {1,3,2,7,4,5};
        String[] stringArray = {"a", "c", "b", "f", "d"};
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(intArray);
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
    }
}

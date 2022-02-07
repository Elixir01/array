package com.amrit.array;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int removeIndex = 1;

        for(int x = removeIndex; x < my_array.length -1 ;x ++){
            my_array[x] = my_array[x + 1];
        }
        System.out.println(Arrays.toString(my_array));
    }
}


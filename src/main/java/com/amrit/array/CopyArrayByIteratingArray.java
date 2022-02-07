package com.amrit.array;

import java.util.Arrays;

public class CopyArrayByIteratingArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];

        for(int x = 0; x <a.length; x++){
            b[x] = a[x];
        }

        System.out.println(Arrays.toString(b));
    }
}

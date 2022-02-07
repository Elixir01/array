package com.amrit.array;

import java.util.Arrays;

public class InsertElementAtSpecificPosition {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        for(int x = a.length-1; x>1; x--){
            a[x] = a[x-1];
        }
        a[1] = 6;

        System.out.println(Arrays.toString(a));
    }


}

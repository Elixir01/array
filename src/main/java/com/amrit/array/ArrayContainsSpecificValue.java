package com.amrit.array;

import java.util.Arrays;

public class ArrayContainsSpecificValue {

    public static boolean contains(int [] arr, int value){
        for(int i : arr){
            if(value == i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6};
        System.out.println(contains(myArray,5));
        System.out.println(contains(myArray, 8));
    }

}

package com.amrit.array;

import java.util.Arrays;

public class FindIndexOfArrayElement {
    public static void main(String[] args) {
        int [] i = {2,3,4,5,6};
        System.out.println(indexOf(i,4));
        System.out.println(indexOf(i,8));
        System.out.println(indexOf(i,2));


    }


    public static int indexOf(int [] arr, int value){
     for(int x = 0; x<arr.length; x++){
         if(value == arr[x]){
             return x;
         }
     }
     return -1;
    }
}

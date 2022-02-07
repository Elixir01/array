package com.amrit.array;

public class FindMaxAndMinValueOfArray {
    public static void main(String[] args) {
        int[] x = {1000,100,3,4,5,46,7,8,10,200,500};
        System.out.println(max(x));
        System.out.println(min(x));
    }

    public static int max(int [] arr){
        int max = arr[0];
        int min = arr[1];
        for(int x : arr){
            if(x > max){
                max = x;
            }
        }
     return max;

    }
    public static int min(int [] arr){
        int min = arr[0];
        for(int x : arr){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
}

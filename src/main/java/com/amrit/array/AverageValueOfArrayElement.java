package com.amrit.array;

public class AverageValueOfArrayElement {
    public static void main(String[] args) {
        int[] a = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for(int b : a){
            sum += b;

        }
        double c= sum/a.length;
        System.out.println(c);
    }
}

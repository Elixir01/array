package com.amrit.array;

public class SumValuesOfArray {
    public static void main(String[] args) {

        int[] sumValues = {1,3,4,2};
        int sum = 0;
        for(int i :sumValues){
            sum +=i;
        }
        System.out.println(sum);
    }
}

package com.amrit.array;

public class PrintingGrid {
    public static void main(String[] args) {
        int [][] twoDimension = new int[10][10];
        for(int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                System.out.printf("%2d ",twoDimension[i][j]);
            }
            System.out.println();
        }
    }
}

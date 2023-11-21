package com.ds.patterns;

public class Pyramid {
    public static void main(String[] args) {
        //printRightPyramidPattern(10);
        printLeftPyramidPattern(10);
    }
    public static void printRightPyramidPattern(int n){
        for (int i = 0; i < n ; i++) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
    public static void printLeftPyramidPattern(int n){
        for (int i = n; i < n-1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                System.out.print(" *");

            }
            System.out.println();
        }
    }

}


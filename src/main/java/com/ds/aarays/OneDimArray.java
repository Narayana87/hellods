package com.ds.aarays;

public class OneDimArray {
    static double[] theArray = new double[10];

    public static void main(String[] args) {
        createArray();
        displayArray();
    }

    public static void createArray(){

        for (int i = 0; i < theArray.length ; i++) {
            theArray[i] = Math.rint(Math.random() * 2 + 5);
        }
    }

    public static void displayArray(){
        for (double d : theArray
             ) {
            System.out.println(d);

        }
    }
}

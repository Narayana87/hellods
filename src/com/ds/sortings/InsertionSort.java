package com.ds.sortings;

public class InsertionSort {
    public static void main(String[] args) {
        int[] theArray = {1,9,4,6,5,7,2,3,8,10};
        insertionSort(theArray);
        printDisplay(theArray);

    }
    public static void insertionSort(int[] theArray){
        for (int i = 0; i < theArray.length; i++) {
            int currentElement = theArray[i];
            int k;
            for(k = i-1; k >=0 && theArray[k] > currentElement; k--){
                theArray[k+1] = theArray[k];
            }
            theArray[k+1] = currentElement;

        }
    }

    public static void printDisplay(int[] theArray){
        for (int i : theArray
             ) {
            System.out.print(" "+i);
        }
    }
}

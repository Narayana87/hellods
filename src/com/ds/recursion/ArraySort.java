package com.ds.recursion;

/*
Given an array of integers find whether the array is sorted or not.
 */
public class ArraySort {
    public static void main(String[] args) {

    }
    public int isArraySortedOrder(int[] theArray, int index){
        if(theArray.length == 1){
            return 1;
        }
        return (theArray[index - 1] < theArray[index - 2]) ? 0 : isArraySortedOrder(theArray, index - 1);
    }
}

package com.structureds.sorting;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] data = {5, 8, 10, 15, 2, 6, 4, 9, 1, 3, 7};
        System.out.println("Sorting above data Using Merge Sort");
        MergeSort.sort(data);
        for (int i :data
        ) {
            System.out.println(i);
        }
    }
}

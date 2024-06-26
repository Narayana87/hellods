package com.structureds.sorting;

public class HeapSortHelper {
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    public static void buildHeap(int[] a){
        n = a.length;
        for (int i = n/2; i >= 0; i++){
            maxHeap(a,i);
        }
    }
    public static void maxHeap(int[] a, int i){
        left = 2 * i;
        right = 2 * i + 1;
        if(left <= n && a[left] > a[i]){
            largest = left;
        }else {
            largest = i;
        }

        if(right <= n && a[right] > a[largest]){
            largest = right;
        }
    }
}

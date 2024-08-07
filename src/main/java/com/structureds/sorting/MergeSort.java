package com.structureds.sorting;
/*
The merge sort algorithm is a recursive algorithm based on the divide & conquer strategy.
 */
public class MergeSort {
    private static int[] data;
    private static int size;
    private static int[] left;
    private static int[] right;

    // sort() method
    public static void sort(int[] arr){
        data = arr;
        size = data.length - 1;
        if(size > 1){
            left = leftHalf(data);
            right = rightHalf(data);

            //recursively calling sort() for both left & right
            sort(left);
            sort(right);

            //merging data[], left[] & right[]
            merge(data, left, right);
        }
    }
    public static int[] leftHalf(int[] leftData){
        int lSize = leftData.length / 2;
        left = new int[lSize];
        System.arraycopy(leftData, 0, left, 0, lSize);
        return left;
    }

    public static int[] rightHalf(int[] rightData){
        int rSize1 = rightData.length / 2;
        int rSize2 = rightData.length - rSize1;
        right = new int[rSize2];
        for (int i = 0; i < rSize2; i++) {
            right[i] = rightData[i + rSize1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left1, int[] right1){
        data = result;
        left = left1;
        right = right1;
        int m = (data.length / 2) - 1;
        int t1 = m - left.length + 1;
        int t2 = right.length - m;

        for (int i = 0; i < result.length; i++) {
            if(t2 >= right.length || (t1 < left.length && left[t1] <= right[t2])){
                result[i] = left[t1];
                t1++;
            }else {
                result[i] = right[t2];
                t2++;
            }

        }
    }

}

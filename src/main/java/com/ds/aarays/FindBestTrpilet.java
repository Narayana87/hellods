package com.ds.aarays;

import java.util.ArrayList;
import java.util.List;

/*
A,B,C are 3 arrays a perfect triplet  will be A[i] < B[j] <C[k] .
Write a code or approach to get the No of triplet present here

Eg: a - 1,3,5 A[] =
    B-  2,7,9
    C- 10,11,13
 */
public class FindBestTrpilet {
    public static void main(String[] args) {
        int[] A = {1,3,5};
        int[] B = {2,7,9};
        int[] C = {10,11,13};
        List<Integer> result = countPerfectTriplet(A,B,C);
        System.out.println(result);

    }
    public static List<Integer> countPerfectTriplet(int[] A, int[] B, int[] C){
        List<Integer> templist = new ArrayList<>();
        for (int j : B) {
            // Count the number of elements in A that are less than B[i]
            for (int a : A) {
                if (a < j) {
                    templist.add(a);
                    break;
                }
            }
            // Count the number of elements in C that are greater than B[i]
            for (int c : C) {
                if (c > j) {
                    templist.add(j);
                    templist.add(c);
                    break;
                }
            }
        }
        return templist;
    }
}

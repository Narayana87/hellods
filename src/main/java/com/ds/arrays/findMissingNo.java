package com.ds.arrays;

public class findMissingNo {
    public static void main(String[] args) {
        int[] theArray = {1,2,3,4,5,6,8};
        int n = theArray.length+1;
        int sum = ((n * (n+1))/2);
        int theArraySum = 0;
        System.out.println("Total Sum is : "+sum);
        for (int i = 0; i < theArray.length; i++) {
            theArraySum += theArray[i];
        }
        System.out.println("Missing number is : "+ (sum - theArraySum));
    }
}

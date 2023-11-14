package com.ds.misc;

public class CountLongestSequence {
    public static void main(String[] args) {
        String n = "010101100001111";
        int currentCount = 0;
        int maxCount = 0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == '1'){
                currentCount++;
            }else {
                currentCount = 0;
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
        }

        }
        System.out.println("Lonest sequence of is : "+maxCount);
    }

}

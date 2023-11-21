package com.ds.recursion;

public class Factorial {
    public static void main(String args[]){
        System.out.println("Factorial : "+fact(10));
    }
    public static int fact(int num){
        if(num < 1){
            return -1;
        }
        if(num == 0 || num == 1){
            return 1;
        }
        return num * fact(num -1);
    }
}

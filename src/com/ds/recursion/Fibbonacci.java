package com.ds.recursion;

public class Fibbonacci {
    public static void main(String args[]){
       for(int i = 0; i < 20; i++) {
           System.out.println(fibbonacci(i));
       }
    }
    public static int fibbonacci(int num){
        if(num < 0){
            return -1;
        }
        if(num == 0 || num == 1){
            return num;
        }
        return fibbonacci(num -1) + fibbonacci(num - 2);
    }
}

package com.ds.recursion;

public class StringReverse {
    public static String reverse(String input){
        if(input.isEmpty()){
           return input;
        }else {
            return reverse(input.substring(1))+input.charAt(0);
        }
    }

    public static void main(String[] args) {
        String str = "Amex Loves Coders";
        System.out.println("After reverse : "+reverse(str));
        System.out.println(str.substring(1));
    }
}

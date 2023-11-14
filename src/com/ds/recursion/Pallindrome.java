package com.ds.recursion;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Pallindrome : "+pallindrome("hhhh"));
        isPallindrome("radar");
    }
    public static String pallindrome(String s){
        if(s.isEmpty()){
            return s;
        }if (s.charAt(0) == s.charAt(s.length() - 1)){
            return pallindrome(s.substring(1, s.length() - 1));
        }else{
            return s;
        }

    }
    //using string reverse methods
    public static void isPallindrome(String input){
        if(input.isEmpty()){
            System.out.println("Input can't Empty");
        }
        String rev = " ";
        for(int i = input.length() - 1 ; i >= 0; i--){
            rev += input.charAt(i);
        }
        if(input.equals(rev)){
            System.out.println("The String are pallndrome");
        }else {
            System.out.println("The String are not pallindrome");
        }
    }
}

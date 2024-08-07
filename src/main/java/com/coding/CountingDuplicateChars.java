package com.coding;
/*
Problem: Consider a String that can contains ASCII and unicode characters ranging between 0 - 65534.
Write a snippet of code that returns true, if this string contains unique characters. The whitespaces
can be ignored.

Solution: Let's consider the following three valid given strings:
abcd
a DBD

first of all, it is important to know that we can fetch any character between 0 to 65534 via charAt(int index)
method

A simple solution to this problem consists of using a Map<Character, Boolean>. while we loop the character
from  index into this mao and flip the corresponding boolean value false to true.
 */

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateChars {
    private static final int MAX_CHARS = 65535;
    public static void main(String args[]){
        String s = "汉字";
        System.out.println(isUnique(s));

    }
    public static boolean isUnique(String input){
        Map<Character, Boolean> chars = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.codePointAt(i) <= MAX_CHARS){
                char ch = input.charAt(i);
                if(!Character.isWhitespace(ch)){
                    if(chars.put(ch, true) != null){
                        return false;
                    }
                }
            }else {
                System.out.println("The given string contains un-allowed characters");
                return false;
            }
        }
        return true;
    }
}

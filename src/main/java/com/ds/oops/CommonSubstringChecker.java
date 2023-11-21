package com.ds.oops;

import java.util.List;
import java.util.stream.IntStream;

public class CommonSubstringChecker {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "orange");
        List<String> list2 = List.of("pineapple", "grape", "watermelon");

        boolean hasCommonSubstring = IntStream.range(0, list1.size())
                .anyMatch(i -> hasCommonSubstring(list1.get(i), list2.get(i)));

        if (hasCommonSubstring) {
            System.out.println("At least one pair of strings has a common substring.");
        } else {
            System.out.println("No pair of strings has a common substring.");
        }
    }

    public static boolean hasCommonSubstring(String str1, String str2) {
        return str1.chars()
                .anyMatch(c -> str2.indexOf(c) != -1);
    }
}

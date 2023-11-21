package com.ds.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
A lambda expressions can be used in many different situations, including:
1. Assigned to a variables
2. Passed as a parameter
3. Returned from a function

 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> nameList =Arrays.asList("Lakshmi", "NArayana", "Maharana", "Duey", "Luey");
        nameList.forEach(t -> System.out.println(t.toLowerCase()));
        System.out.println("---");
        nameList.forEach(t -> System.out.println(t.toUpperCase()));
        System.out.println("---");
        nameList.parallelStream().forEach(t -> System.out.println(t.toLowerCase()));
        System.out.println("---");
        nameList.forEach(s -> System.out.println(processString(String::toLowerCase, s)));
        System.out.println("---");
        nameList.forEach(s -> System.out.println(processString(String::toUpperCase, s)));
        nameList.forEach(s -> System.out.println(processString(String::toLowerCase, s)));

        List<String> stringList = Arrays.asList("20","40","30","80","33");
        List<Integer> numbers = new ArrayList<>();
        Function<List<String>, List<Integer>> singleFunction = s -> {
            s.stream().forEach(t -> numbers.add(Integer.parseInt(t)));
            return numbers;
        };


    }

    public static String processString(Function<String, String> operation, String target){
        return operation.apply(target);
    }

    public static List<Integer> connvertToInt(List<String> stringList){
        List<Integer> numberList = new ArrayList<>();
        for (String s : stringList
             ) {
            numberList.add(Integer.parseInt(s));
        }
        return numberList;
    }
}

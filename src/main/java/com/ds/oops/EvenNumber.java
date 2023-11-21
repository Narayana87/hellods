package com.ds.oops;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,16,18,5,3,9,8,52,5,3,8);
        System.out.println("Printing Even numbers");
        numbers.stream().filter( n -> n%2 == 0).forEach(System.out::println);
        System.out.println("Printing Odd Numbers");
        numbers.stream().filter(n -> n%2 == 1).forEach(System.out::println);
        System.out.println("Printing numbers starting with 1");
        numbers.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
        System.out.println("Find duplicate item on stream");
        Set<Integer> num = new HashSet<>();
        numbers.stream().filter(n -> !num.add(n)).forEach(System.out::println);
        System.out.println("Find the First element of the stream");
        numbers.stream().findFirst().ifPresent(System.out::println);
        System.out.println("Find the distinct element of the stream");
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println("Count number of elements");
        long count  = numbers.stream().count();
        System.out.println("Number of Elements : "+count);
        System.out.println("Max element from stream");
        int max = numbers.stream().max(Integer::compare).get();
        System.out.println(max);
        System.out.println("Min element from stream");
        int min = numbers.stream().min(Integer::compare).get();
        System.out.println(min);
        System.out.println("Sorting all the sorted using stream");
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("Sorting by removing duplicate");
        numbers.stream().sorted().distinct().forEach(System.out::println);
    }
}

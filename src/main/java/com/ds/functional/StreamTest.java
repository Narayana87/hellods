package com.ds.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> odds = new ArrayList<>();
        IntStream.range(0,10).forEach(System.out::println);

        System.out.println("Printing Even numbers");
        IntStream.range(0,100).filter(i -> i%2 == 0).forEach(System.out::println);
        System.out.println("Printing Odd numbers");
        IntStream.range(0,100).filter(i -> i%2 !=0).forEach(System.out::println);
    }
}

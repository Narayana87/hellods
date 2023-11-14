package com.ds.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTesting {
    public static void main(String[] args) {
        Collection<String> courseCollection = Arrays.asList("Java","Jee","Spring","Springboot","Spring","Hibernate","NodeJs", "Java");
        courseCollection.stream().forEach(System.out::println);
        System.out.println(courseCollection.stream().count());
        Set<String> courseSet = new HashSet<>(courseCollection);
        courseSet.stream().forEach(System.out::println);
        System.out.println(courseSet.stream().count());
        System.out.println("Count : " +courseCollection.stream().count());


        Map<String, Integer> courseMap = new HashMap<>();
        courseMap.put("Java",4);
        courseMap.put("Spring",3);
        courseMap.put("RDBMS",1);
        courseMap.put("NodeJs",2);
        courseMap.put("MongoDB",5);
        //sorting based on value descending order
        courseMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
        //sorting based on value ascending order
        courseMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(System.out::println);

        String s = new String("Hello");
        String s1 = "World";
        System.out.println("Using Concat :"+s.concat(s1));
        System.out.println("+:" +s+s1);
        s.concat("world");
        System.out.println(s);


        String s11="Sachin";
        String s21="Sachin";
        String s31="Ratan";
        System.out.println(s1.compareTo(s21));//0
        System.out.println(s1.compareTo(s31));//1(because s1>s3)
        System.out.println(s31.compareTo(s1));//-1(because s3 < s1 )

        String hello = "Hello Wrold!";
        // Convert the string to a stream of characters
        hello.chars()
                // Convert each character to a Character object
                .mapToObj(c -> (char) c)
                // Collect the characters into a map with character counts
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((character, count) -> System.out.println(character + ": " + count));
    }
}

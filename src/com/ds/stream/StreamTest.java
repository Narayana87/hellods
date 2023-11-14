package com.ds.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("litu");
        list.add("narayana");
        list.add("chinki");
        list.add("subhasri");
        list.add("lakshmi");
        list.add("googly");

        //Iterating using stream
        //list.stream().forEach(System.out::println);
        //iterating
        //list.stream().forEach(t -> System.out.println(t));
        //Iterating with ordered
       // list.stream().forEachOrdered(t -> System.out.println(t));
        list.stream().filter( t -> t.startsWith("l")).forEach(System.out::println);
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Hello");
        map.put(2,"welcome");
        map.put(3,"to");
        map.put(4,"Banglore");

        //map.forEach((key, value) -> System.out.println(key+": "+value));
       // map.entrySet().stream().forEach(t -> System.out.println(t));
        map.entrySet().stream().filter( t -> t.getKey()%2 == 0).forEach(System.out::println);
        map.entrySet().stream().filter(t -> t.getValue().startsWith("w")).forEach(System.out::println);

        Map<String, Integer> descMap = new HashMap<>();
        descMap.put("Hello", 3);
        descMap.put("welcome",4);
        descMap.put("to",1);
        descMap.put("Hi",2);
        descMap.remove("to");


        System.out.println("IS Contains : "+descMap.containsKey("Hi"));
        //sorting based on values desc
        descMap.remove("to");
        descMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
       // descMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);

    }
}

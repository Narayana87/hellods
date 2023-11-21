package com.ds.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFunctions {
    public static void main(String[] args) {
        Integer[] numbers = {22,55,66,55,99,88,33,44,89,57,66};
        Set<Integer> set = new HashSet<>(Arrays.asList(numbers));
        int count = 0;
        for (int i : set
             ) {
            if(i > 60)
                System.out.println(i);
        }
        //using stream for the same

        set.stream().filter(t -> t > 60).forEach(System.out::println);
        System.out.println(calculateSum());
    }

    static int calculateSum(){
        Integer[] numbers = {22,55,66,55,99,88,33,44,89,57,66};
        int sum = Arrays.asList(numbers).stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    public static Map<Integer, Employee> convertListToMap(List<Employee> listOfEmp){
        Map<Integer, Employee> resultMap = new HashMap<>();
        resultMap = listOfEmp.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));

        return resultMap;
    }

}

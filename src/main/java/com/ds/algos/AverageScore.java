package com.ds.algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AverageScore {
    public static void main(String[] args) {
        String[][] my2DArray = {
                {"Chares", "100"},
                {"Antony", "87"},
                {"Bob", "70"},
                {"Chares", "22"}};

        Map<String, Integer> resultMap = new HashMap<>();
        int avg = 0;
        int count = 0;
        for (String[] entry : my2DArray) {
            String name = entry[0];
            int score = Integer.parseInt(entry[1]);
            System.out.println(name+" : "+score);
            if(name.equalsIgnoreCase(entry[0].toString())){
                System.out.println("Name :"+name);
            }



        }
    }
}

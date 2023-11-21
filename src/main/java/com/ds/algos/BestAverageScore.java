package com.ds.algos;

import java.util.HashMap;
import java.util.Map;

public class BestAverageScore {
    public static void main(String[] args) {
        String[][] my2DArray = {
                {"Chares", "100"},
                {"Antony", "87"},
                {"Bob", "70"},
                {"Chares", "22"}
        };

        Map<String, Integer> totalScores = new HashMap<>();
        Map<String, Integer> scoreCounts = new HashMap<>();

        for (String[] entry : my2DArray) {
            String student = entry[0];
            int score = Integer.parseInt(entry[1]);

            // Update the total score and count for each student
            totalScores.put(student, totalScores.getOrDefault(student, 0) + score);
            scoreCounts.put(student, scoreCounts.getOrDefault(student, 0) + 1);
        }

        double bestAverage = Double.NEGATIVE_INFINITY;
        String bestStudent = null;

        // Calculate the average score for each student and find the best average
        for (String student : totalScores.keySet()) {
            int totalScore = totalScores.get(student);
            int count = scoreCounts.get(student);
            double average = (double) totalScore / count;

            if (average > bestAverage) {
                bestAverage = average;
                bestStudent = student;
            }
        }

        if (bestStudent != null) {
            System.out.println("The student with the best average score is: " + bestStudent);
            System.out.println("The best average score is: " + bestAverage);
        } else {
            System.out.println("No students found.");
        }
    }
}

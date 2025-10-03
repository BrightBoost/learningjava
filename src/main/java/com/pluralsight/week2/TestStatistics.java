package com.pluralsight.week2;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {1, 2, 3, 4};
        // average
        double sum = 0;
        for(int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double average = sum / testScores.length;

        System.out.println("Average score: " + average);
        Arrays.sort(testScores);
        // high score
        System.out.println("High score: " + testScores[testScores.length - 1]);
        // low score
        System.out.println("Low score: " + testScores[0]);
        // median
        if(testScores.length % 2 == 0) {
            double median = (testScores[testScores.length / 2 - 1] + testScores[testScores.length / 2]) / 2.0;
            System.out.println("Median is: " + median);
        } else {
            System.out.println("Median is: " + testScores[(testScores.length)/2]);
        }

    }
}

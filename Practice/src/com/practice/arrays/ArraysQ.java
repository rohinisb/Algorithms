package com.practice.arrays;

import java.util.Arrays;

/**
 * Created by rohin on 5/18/2016.
 */
public class ArraysQ {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int window = 3;
        getMovingAverageSum(arr, window);
        System.out.println("Sum of digits of 14 is " + getOneDigitSum(14));

        String[] words = {"hello","world","hi","this","world"};
        getShortestWordDistance(words, "hello","hi");

    }

    //Given an array of integers and a window size, calculate the average of all integers in the sliding window.
    private static void getMovingAverageSum(int arr[], int window) {
        if (window > arr.length) {
            System.out.println("Invalid input");
            return;
        }
        int j = 0;
        int averageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            j = i + window - 1;
            if (j >= arr.length)
                break;
            for (int k = i; k <= j; k++) {
                sum += arr[k];
            }
            averageSum += sum / window;
        }
        System.out.println(averageSum);
    }

    //get 1 digit recursive sum of all digits in a number
    private static int getOneDigitSum(int number) {
        return 1 + ((number - 1) % 9);
    }

    //shortest word distance in an array of words
    private static void getShortestWordDistance(String[] words, String word1, String word2) {
        int p1 = -1;
        int p2 = -1;
        int dist = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++){
            if(word1.equals(word2)){
                dist = 0;
            }
            else{
                if(words[i].equals(word1)) p1 = i;
                if(words[i].equals(word2)) p2 = i;
            }
            if(p1 > -1 && p2 > -1)
                dist = Math.min(dist, Math.abs(p1-p2));
        }
        System.out.println(dist);
    }
}
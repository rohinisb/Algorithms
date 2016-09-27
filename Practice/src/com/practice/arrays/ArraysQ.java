package com.practice.arrays;

import java.util.*;

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

        int arr1[] = {1,2,3,4};
        int arr2[] = {1,1,2,2,3};
        int[] res = getArraysIntersection(arr1, arr2);
        System.out.print("Intersetion of arrays is ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
        System.out.println("Unique sum is "+getUniqueSum(arr2));

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
        System.out.println("Moving average sum is "+averageSum);
    }

    //get 1 digit recursive sum of all digits in a number
    private static int getOneDigitSum(int num) {
        int sum = 0;
        char s[] = String.valueOf(num).toCharArray();
        for(int i=0;i<s.length;i++){
            sum += Integer.parseInt(String.valueOf(s[i]));
        }
        String su = String.valueOf(sum);
        if(su.length()>1)
            return getOneDigitSum(sum);
        return sum;
    }

    //Find the extra character in the second string compared to the first String. Ex: given "abc" and "abcd" return "d"
    public static char findTheDifference(String s, String t) {
        String c = s+t;
        char arr[] = c.toCharArray();
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result ^= (int)arr[i];
        }
        return (char)result;
    }

    //shortest word distance in an array of words, given 2 words i.e. difference b/w their indices
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
        System.out.println("Distance between "+word1+" and "+word2+" is "+dist);
    }

    //intersection of two arrays
    private static int[] getArraysIntersection(int[] arr1, int[]arr2){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    if(!res.contains(arr1[i]))
                        res.add(arr1[i]);
                }
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }

    //return the only number which is appears once in the array when other numbers appear twice.
    public int singleNumber(int[] nums) {
        if(nums.length < 1)
            return -1;
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }

    //return sum of unique elements in a array
    private static int getUniqueSum(int[] arr){
        Set<Integer> uniqElem = new HashSet<>();
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            if(!uniqElem.contains(arr[i])) {
                uniqElem.add(arr[i]);
                sum += arr[i];
            }
        }
        return sum;
    }
}
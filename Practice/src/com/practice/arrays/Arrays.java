package com.practice.arrays;
/**
 * Created by rohin on 5/18/2016.
 */
public class Arrays {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int window = 3;
        getMovingAverage(arr, window);
    }

    //Given an array of integers and a window size, calculate the average of all integers in the sliding window.
    private static void getMovingAverage(int arr[], int window){
        if(window > arr.length){
            System.out.println("Invalid input");
            return;
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            j = i + window - 1;
            if(j >= arr.length)
                break;
            for (int k = i; k <= j; k++){
                sum += arr[k];
            }
            System.out.println(sum/window);
        }
    }
}

package com.practice.arrays;
/**
 * Created by rohin on 5/18/2016.
 */
public class Arrays {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int window = 3;
        getMovingAverageSum(arr, window);
        System.out.println("Sum of digits of 14 is "+getOneDigitSum(14));
    }

    //Given an array of integers and a window size, calculate the average of all integers in the sliding window.
    private static void getMovingAverageSum(int arr[], int window){
        if(window > arr.length){
            System.out.println("Invalid input");
            return;
        }
        int j = 0;
        int averageSum = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            j = i + window - 1;
            if(j >= arr.length)
                break;
            for (int k = i; k <= j; k++){
                sum += arr[k];
            }
            averageSum += sum/window;
        }
        System.out.println(averageSum);
    }

    //get 1 digit recursive sum of all digits in a number
    private static int getOneDigitSum(int number){
        return 1+((number-1)%9);
    }
}

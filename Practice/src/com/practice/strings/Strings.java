package com.practice.strings;

/**
 * Created by rohin on 5/20/2016.
 */
public class Strings {

    public static void main(String args[]) {
        reverseString("hello");
    }

    //reverse a String
    private static void reverseString(String str){
        char ch[] = str.toCharArray();
        char revStr[] = new char[str.length()];
        for(int i = ch.length-1; i >= 0 ; i--){
            revStr[ch.length-i-1] = ch[i];
        }
        System.out.println(revStr);
    }
}

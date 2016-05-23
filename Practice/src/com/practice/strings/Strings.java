package com.practice.strings;

import java.util.HashSet;

/**
 * Created by rohin on 5/20/2016.
 */
public class Strings {

    public static void main(String args[]) {
        String str = "ababb";
        System.out.println("The reverse of String "+ str+ " is "+reverseString(str));
        System.out.println("Is "+str+" a permutation palidrome "+isPermutationPalidrome(str));
    }

    //reverse a String
    private static String reverseString(String str){
        char ch[] = str.toCharArray();
        char revStr[] = new char[str.length()];
        for(int i = ch.length-1; i >= 0 ; i--){
            revStr[ch.length-i-1] = ch[i];
        }
        return new String(revStr);
    }

    //check if a permutation of a string is a palindrome
    private static boolean isPermutationPalidrome(String str){
        char ch[] = str.toCharArray();
        HashSet<Character> oddCount = new HashSet<>();
        for(int i = 0; i < ch.length; i++){
            if(!oddCount.contains(ch[i]))
                oddCount.add(ch[i]);
            else
                oddCount.remove(ch[i]);
        }
        return oddCount.size() <= 1;
    }
}

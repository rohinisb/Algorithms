package com.practice.linkedlists;

import java.util.LinkedList;

/**
 * Created by rohin on 5/22/2016.
 */
public class LLists {

    public static void main(String args[]){
        LinkedList<Object> list = new LinkedList<Object>();
        LinkedList<Integer> one = new LinkedList<Integer>();
        one.add(2);
        one.add(1);
        list.add(one);
        list.add(new Integer(2));
        System.out.println(getNestedListWeightSum(list, 1));

    }

    private static int getNestedListWeightSum(LinkedList<Object> list, int depth){
        if(list.isEmpty()) {
            System.out.println("List is empty");
            return 0;
        }
        int sum = 0;
        for (Object obj : list) {
            if(obj instanceof LinkedList){
                sum += getNestedListWeightSum((LinkedList) obj, depth + 1);
            }else{
                sum += (Integer)obj * depth;
            }
        }
        return sum;
    }

}

package com.practice.trees;

import sun.reflect.generics.tree.Tree;

/**
 * Created by rohin on 5/25/2016.
 */
public class TreeNode {

    //define structure of a Tree
    int data;
    TreeNode right;
    TreeNode left;

    TreeNode(int data){
        this.data = data;
    }

    public static void main(String args[]){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(3);
        tree.left.left.left = new TreeNode(5);

        System.out.println(getHeight(tree));
    }

    //get height of a binary tree
    private static int getHeight(TreeNode tree){
        if(tree == null)
            return 0;
        return 1 + Math.max(getHeight(tree.right), getHeight(tree.left));
    }
}

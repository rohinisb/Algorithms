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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(5);

        System.out.println(getHeight(root));
    }

    //get height of a binary tree
    private static int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1 + Math.max(getHeight(root.right), getHeight(root.left));
    }

    //invert a binary tree
    private static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.right = left;
        root.left = right;
        return root;
    }
}

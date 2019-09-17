package com.gyang.examples.search;

public class PrintLeafNodeOfBinaryTree
{
    public static void print(NodeTree root) {
        if(root == null) {
            return;
        }
        if(root.left==null &&root.right==null) {
            System.out.println(root.value);
        }
        print(root.left);
        print(root.right);
    }
    public static int printCountOfNode(NodeTree root) {
        if(root == null) {
            return 0;
        }
        if(root.left==null &&root.right==null) {
            return 1;
        }else return printCountOfNode(root.left) + printCountOfNode(root.right);
    }
}

package com.gyang.examples.search;

public class PrintAllPathsToLeaf
{
    public static void print(NodeTree root, int arr[], int len) {
        if(root == null) {
            return;
        }
        arr[len]=root.value;
        len++;
        if(root.left ==null &&root.right == null) {
            for(int i = 0; i < len; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        print(root.left, arr,len);
        print(root.right, arr, len);
    }
    public static NodeTree createBinaryTree()
    {
 
        NodeTree rootNode =new NodeTree(40);
        NodeTree node20=new NodeTree(20);
        NodeTree node10=new NodeTree(10);
        NodeTree node30=new NodeTree(30);
        NodeTree node60=new NodeTree(60);
        NodeTree node50=new NodeTree(50);
        NodeTree node70=new NodeTree(70);
        NodeTree node5=new NodeTree(5);
        NodeTree node55=new NodeTree(55);
 
        rootNode.left=node20;
        rootNode.right=node60;
 
        node20.left=node10;
        node20.right=node30;
 
        node60.left=node50;
        node60.right=node70;
        node10.left=node5;
        node50.right=node55;
 
        return rootNode;
    }
}

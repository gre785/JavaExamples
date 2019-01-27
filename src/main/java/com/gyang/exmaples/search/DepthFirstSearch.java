
package com.gyang.exmaples.search;

import java.util.Stack;

public class DepthFirstSearch
{
    public static void inOrder(NodeTree root)
    {
        if (root.left != null) {
            inOrder(root.left);
        }
        System.out.println(root.value);
        if (root.right != null) {
            inOrder(root.right);
        }
    }

    public static void postOrder(NodeTree root)
    {
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.println(root.value);
    }

    public static void preOrder(NodeTree root)
    {
        System.out.println(root.value);
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }

    public static void preOrderIteration(NodeTree root)
    {
        if (root == null) {
            return;
        }
        Stack<NodeTree> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            NodeTree n = stack.pop();
            System.out.println(n.value);
            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
    }
}

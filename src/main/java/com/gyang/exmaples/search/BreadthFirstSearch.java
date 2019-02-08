
package com.gyang.exmaples.search;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch
{
    public static void Bfs(NodeTree root)
    {
        if (root == null) {
            return;
        }
        Queue<NodeTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            NodeTree node = queue.poll();
            System.out.println(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}


package com.gyang.exmaples;

import com.gyang.exmaples.search.BinarySearch;
import com.gyang.exmaples.search.BreadthFirstSearch;
import com.gyang.exmaples.search.DepthFirstSearch;
import com.gyang.exmaples.search.NodeTree;
import com.gyang.exmaples.sort.InsertionSort;
import com.gyang.exmaples.sort.QuickSort;

public class Entry
{

    public static void main(String[] args)
    {
        // String foo = System.getProperty("foo");
        // System.out.println(foo);

        int[] arr = { 6, 2, 9, 5, 7, 25, 1};
        QuickSort q = new QuickSort();
        q.Sort(arr, 0, arr.length - 1);
        InsertionSort.Print(arr);

        BinarySearch b = new BinarySearch();
        int index = b.BinarySearchRecursion(arr, 0, arr.length - 1, 2);
        System.out.println(index);
        index = b.BinarySearchIterative(arr, 25);
        System.out.println(index);

        NodeTree root1 = new NodeTree(1);
        NodeTree root2 = new NodeTree(2);
        NodeTree root3 = new NodeTree(3);
        NodeTree root4 = new NodeTree(4);

        NodeTree root5 = new NodeTree(5);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;

        DepthFirstSearch.inOrder(root1);
        DepthFirstSearch.postOrder(root1);
        DepthFirstSearch.preOrder(root1);
        DepthFirstSearch.preOrderIteration(root1);

        BreadthFirstSearch.Bfs(root1);

    }

}

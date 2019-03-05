
package com.gyang.exmaples;

import com.gyang.exmaples.search.BinarySearch;
import com.gyang.exmaples.search.BreadthFirstSearch;
import com.gyang.exmaples.search.DepthFirstSearch;
import com.gyang.exmaples.search.NodeTree;
import com.gyang.exmaples.sort.InsertionSort;
import com.gyang.exmaples.sort.QuickSort;

import java.util.Arrays;
import java.util.LinkedList;

import com.gyang.exmaples.coding.algorithm.AnagramCheck;
import com.gyang.exmaples.coding.algorithm.DrawPyramidPattern;
import com.gyang.exmaples.coding.algorithm.FirstNonRepeatCharacter;
import com.gyang.exmaples.coding.algorithm.GreatestCommonDivider;
import com.gyang.exmaples.coding.algorithm.IntegerPalindrome;
import com.gyang.exmaples.coding.algorithm.LeapYear;
import com.gyang.exmaples.coding.algorithm.MiddleElementOfLinkedlist;
import com.gyang.exmaples.coding.algorithm.RemoveAllSpace;
import com.gyang.exmaples.coding.algorithm.RemoveDuplicatedFromArray;
import com.gyang.exmaples.coding.algorithm.ReverseArray;
import com.gyang.exmaples.coding.algorithm.ReverseLinkedList;
import com.gyang.exmaples.coding.algorithm.ReverseNumber;
import com.gyang.exmaples.coding.algorithm.ReverseStringInPlace;
import com.gyang.exmaples.coding.algorithm.SqrtrootOfNumber;
import com.gyang.exmaples.coding.algorithm.StringPalindrome;
import com.gyang.exmaples.coding.algorithm.factorial;
import com.gyang.exmaples.coding.algorithm.ReverseLinkedList.Node;
import com.gyang.exmaples.coding.interview.ReverseString;
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

        System.out.println(StringPalindrome.solution("aabb"));
        System.out.println(IntegerPalindrome.solution(103301));
        
        System.out.println(factorial.solution(5));
        System.out.println(factorial.recursiveSolution(6));
        
        int [] array= {3,2,4,2,1,1};
        InsertionSort.Print(RemoveDuplicatedFromArray.solution(array));
        
        DrawPyramidPattern.solution();
        GreatestCommonDivider.solution(4, 12);
        
        String [] a = {"a","b","c","d","e"};
        ReverseArray.solution(a);
        System.out.println(Arrays.toString(a));
        
        String target = "hello world!";
        System.out.println(ReverseString.solution(target));
        
        System.out.println(SqrtrootOfNumber.solution(28));
        System.out.println(LeapYear.solution(2019));
        System.out.println(AnagramCheck.solution("hello", "olleh"));
        
        System.out.println(ReverseNumber.solution(1234));
        FirstNonRepeatCharacter.solution("helle");
        
//        LinkedList<Integer> l = new LinkedList<Integer>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);
//        System.out.println(MiddleElementOfLinkedlist.solution(l));
        
        System.out.println(ReverseStringInPlace.solution("hello"));
        System.out.println(RemoveAllSpace.solution("h e l l o "));
        
        
        ReverseLinkedList.head = new Node(85); 
        ReverseLinkedList.head.next = new Node(15); 
        ReverseLinkedList.head.next.next = new Node(4); 
        ReverseLinkedList.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        ReverseLinkedList.print(); 
//        head = list.solution(head); 
//        System.out.println(""); 
//        System.out.println("Reversed linked list "); 
//        list.print(head); 
        ReverseLinkedList.solution();
        ReverseLinkedList.print();
        
    }

}

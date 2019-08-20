package com.gyang.algorithm;

public class ReverseLinkedList
{
    public static Node head;
    public static class Node
    {
        public int data;
        public Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node solution()
    {
            Node prev = null;
            Node next = null;
            Node current = head;
            while(current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = current.next;
            }
            head = prev;
            return head;
    }
        public static void print()
        {
            while(head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
  
    
}

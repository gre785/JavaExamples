package com.gyang.exmaples.coding.algorithm;

public class GetLastNNode
{
    public static Node solution(int n, Node head)
    {
        if(head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

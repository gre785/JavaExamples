package com.gyang.exmaples.coding.algorithm;

public class IsCycle
{
    public static boolean solution(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}

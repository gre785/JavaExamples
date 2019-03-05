package com.gyang.exmaples.coding.algorithm;

import java.util.LinkedList;

public class MiddleElementOfLinkedlist
{
    public static int solution(LinkedList <Integer> l)
    {
        int index=0;    
        int i =0;
        int length=0;
        while(l.isEmpty()==false) {
            length++;
            i+=2;
            index++;
            
        }
        if(length%2==0) {
            return l.get( index-1);
        }
        return l.get(index-2);
    }
}

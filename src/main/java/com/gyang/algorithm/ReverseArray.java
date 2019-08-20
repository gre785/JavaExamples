package com.gyang.algorithm;

public class ReverseArray
{
    public static void solution(String []array)
    {
        if(array ==null ||array.length ==1) {
            return;
        }
        for(int i =0; i<array.length/2;i++) {
            String temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
}

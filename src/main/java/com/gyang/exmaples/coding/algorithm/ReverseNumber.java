package com.gyang.exmaples.coding.algorithm;

public class ReverseNumber
{
    public static int solution(int x) 
    {
        int reverse=0;
        while(x>0) {
            int remainer = x%10;
            reverse = reverse*10+remainer;
            x= x/10;
        }
        return reverse;
    }
}

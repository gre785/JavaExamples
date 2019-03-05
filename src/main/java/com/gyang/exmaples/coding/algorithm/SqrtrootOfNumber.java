package com.gyang.exmaples.coding.algorithm;

public class SqrtrootOfNumber
{
    public static int solution(int n)
    {
        if(n == 0 || n == 1) {
            return n;
        }
        int x =1;
        int result =1;
        while(result<=n) {
            x++;
            result = x*x;
        }
        return x-1;
    }
}

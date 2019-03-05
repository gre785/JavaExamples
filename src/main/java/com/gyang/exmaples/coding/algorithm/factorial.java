package com.gyang.exmaples.coding.algorithm;

public class factorial
{
    public static int solution(int n)
    {
        
        int result = 1;
        while(n !=0) {
            result= result*n;
            n--;
        }
        return result;
    }
    public static int recursiveSolution(int n)
    {
        if(n ==1) {
            return 1;
        }
        return n * recursiveSolution(n-1);
    }
}

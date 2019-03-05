package com.gyang.exmaples.coding.algorithm;

public class GreatestCommonDivider
{
    public static void solution(int num1,int num2)
    {
        int result=1;
        for(int i=2;i<=Math.min(num1, num2);i++) {
            if(num1%i==0 && num2%i==0) {
                result=i;
            }
        }
        
        System.out.println(result);
    }
}

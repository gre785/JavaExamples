package com.gyang.examples.util;

public class Fib
{
    public int FibRegular(int n){
        int result =0;
        int a = 1;
        int b = 1;
        if(n == 1) result = 1;
        if(n == 2) result = 1;
        for(int i = 3; i <= n; i++){
            result = a+b;
            a = b;
            b = result;
        }
        return result;
    }
    public int FibRecursion(int n){
        int result=0;
        if(n ==1) result = 1;
        if(n ==2) result = 1;
        if(n > 2) result = FibRecursion(n-1)+FibRecursion(n-2);
        return result;
    }
    
}

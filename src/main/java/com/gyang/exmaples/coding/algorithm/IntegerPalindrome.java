package com.gyang.exmaples.coding.algorithm;

public class IntegerPalindrome
{
    public static boolean solution(int num)
    {
        int palindrome=num;
        int reverse=0;
        while(palindrome > 0) {
            int remaider= palindrome%10;
            reverse = reverse *10+ remaider;
            palindrome/=10;
            
        }
        if(reverse == num) {
            return true;
        }
        return false;
    }
}

package com.gyang.exmaples.coding.algorithm;

public class StringPalindrome
{
    public static boolean solution(String s)
    {
        int n = s.length();
        int i=0,j=n-1;
        while(i <n/2&&j>=n/2) {
                if(s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
        }
        return true;
    }
}

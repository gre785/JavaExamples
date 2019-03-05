package com.gyang.exmaples.coding.algorithm;

public class ReverseStringInPlace
{
    public static String solution(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length()/2;i++) {
            char low = sb.charAt(i);
            int high = sb.length()-i-1;
            sb.setCharAt(i, sb.charAt(high));
            sb.setCharAt(high, low);
        }
        return sb.toString();
    }
}

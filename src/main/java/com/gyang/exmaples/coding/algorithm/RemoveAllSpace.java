package com.gyang.exmaples.coding.algorithm;

public class RemoveAllSpace
{
    public static String solution(String s) 
    {
        String result = s.replaceAll("\\s", "");
        return result;
    }
}

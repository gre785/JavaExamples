package com.gyang.algorithm;

public class RemoveAllSpace
{
    public static String solution(String s) 
    {
        String result = s.replaceAll("\\s", "");
        return result;
    }
}

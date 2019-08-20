package com.gyang.algorithm;

public class AnagramCheck
{
    public static boolean solution(String a, String b)
    {
        if(a.length() != b.length()) {
            return false;
        }
        for(int i = 0; i <b.length();i++) {
            if(a.charAt(i) != b.charAt(b.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}

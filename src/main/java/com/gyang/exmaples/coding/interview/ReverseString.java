
package com.gyang.exmaples.coding.interview;

public class ReverseString
{
    public static String solution(String target)
    {
        String result = "";
        for (int i = target.length() -1; i > -1; i--) {
            result += target.charAt(i);
        }

        return result;
    }
}

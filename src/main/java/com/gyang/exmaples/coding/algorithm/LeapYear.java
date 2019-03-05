package com.gyang.exmaples.coding.algorithm;

public class LeapYear
{
    public static boolean solution(int year) {
        if(year%400 == 0 || year %4 ==0 && year %100 != 0) {
            return true;
        }
        return false;
    }
}

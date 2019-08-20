package com.gyang.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatCharacter
{
    public static void solution(String s)
    {
        Map<Character, Integer> board = new HashMap<>();
        for(int i =0; i<s.length();i++) {
           char c = s.charAt(i);
           if(board.containsKey(c)) {
               board.put(c, board.get(c)+1);
           }else {
               board.put(c,1);
           }
        }
        for(int i = 0; i<s.length();i++) {
            char c = s.charAt(i);
            if(board.get(c)==1) {
                System.out.println(c);
            }
        }
        
    }
}

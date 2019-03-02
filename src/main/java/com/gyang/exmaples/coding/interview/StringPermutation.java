
package com.gyang.exmaples.coding.interview;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class StringPermutation
{
    public static Set<String> solution(String input)
    {
        Set<String> results = new HashSet<>();
        if (input.length() == 0) {
            return results;
        }

        Queue<String> raws = new ConcurrentLinkedQueue<>();
        raws.add(String.valueOf(input.charAt(0)));
        // i = 1: raws(a) -> temp(ab, ba) -> raws = temp
        // i = 2: raws(ab, ba) -> temp(cab, acb, cba, cba, bca, bac) -> raws = temp
        for (int i = 1; i < input.length(); i++) {
            Queue<String> temp = new ConcurrentLinkedQueue<>();
            for (String raw : raws) {
                temp.addAll(insertChar(String.valueOf(input.charAt(i)), raw));
            }
            raws = temp;
        }
        results.addAll(raws);
        return results;
    }

    // x into abc -> xabc, axbc, abxc, abcx
    public static Set<String> insertChar(String charAt, String element)
    {
        Set<String> results = new HashSet<>();
        for (int i = 0; i < element.length() + 1; i++) {
            results.add(insertCharAt(charAt, element, i));
        }
        return results;
    }

    // x into abc at 1 -> axbc
    private static String insertCharAt(String charAt, String element, int i)
    {
        return element.substring(0, i) + charAt + element.substring(i);
    }
}

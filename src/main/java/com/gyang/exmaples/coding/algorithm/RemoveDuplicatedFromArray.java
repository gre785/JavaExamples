
package com.gyang.exmaples.coding.algorithm;

import java.util.Arrays;

public class RemoveDuplicatedFromArray
{
    public static int[] solution(int[] array)
    {
        Arrays.sort(array);
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] != array[i]) {
                array[++index] = array[i];
            }
        }
        int[] result = new int[index + 1];
        for (int i = 0; i <= index; i++) {
            result[i] = array[i];
        }
        return result;
    }
}

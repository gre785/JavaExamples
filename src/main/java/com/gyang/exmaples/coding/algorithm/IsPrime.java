
package com.gyang.exmaples.coding.algorithm;

public class IsPrime
{
    public boolean isPrime(int num)
    {
        if (num == 0 || num == 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < (int)Math.sqrt(num) + 1; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package com.gyang.algorithm;

public class DrawPyramidPattern
{
    public static void solution()
    {
        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

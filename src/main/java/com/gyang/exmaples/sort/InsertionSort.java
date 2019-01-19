package com.gyang.exmaples.sort;

public class InsertionSort
{
   
    public void Sort(int array[]){
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
    public static void Print(int arr[]) {
    	for(int i=0; i < arr.length; i++) {
        	System.out.println(arr[i]+" , ");
        }
    }
 
    
}

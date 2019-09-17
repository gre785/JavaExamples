package com.gyang.examples.sort;

public class SelectionSort
{
	   public void Sort(int array[]) {
	    	for(int i = 0; i < array.length-1; i++) {
	    		int min_index = i;
	    		for(int j = i+1; j < array.length; j++) {
	    			if(array[min_index] > array[j]) {
	    				min_index = j;
	    			}
	    		}
	    		int temp = array[min_index];
	    		array[min_index] = array[i];
	    		array[i] = temp;
	    	}
	   }
	 
}

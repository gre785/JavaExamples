
package com.gyang.examples.sort;

public class QuickSort
{
    public void Sort(int arr[], int left, int right)
    {
        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (i < right) {
            Sort(arr, i, right);
        }
        if (j > left) {
            Sort(arr, left, j);
        }
    }
}

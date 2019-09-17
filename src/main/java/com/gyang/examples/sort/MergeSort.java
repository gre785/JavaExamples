package com.gyang.examples.sort;

public class MergeSort
{
    public void Sort(int array[], int low, int high)
    {
        if (low < high) {
            int mid = (low + high) / 2;
            Sort(array, low, mid);
            Sort(array, mid + 1, high);
            Merge(array, low, high);
        }
    }

    public void Merge(int array[], int low, int high)
    {
        int size = high - low + 1;
        int sorted[] = new int[array.length];
        int i = low;
        int mid = (high + low) / 2;
        int j = mid + 1;
        int k = 0;
        while (k < size) {
            if (i <= mid && array[i] < array[j]) {
                sorted[k++] = array[i++];
            } else {
                sorted[k++] = array[j++];
            }
        }
        for (int n = 0; n < size; n++) {
            array[low + n] = sorted[n++];
        }
    }
}

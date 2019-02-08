
package com.gyang.exmaples.search;

public class BinarySearch
{
    public int BinarySearchIterative(int arr[], int target)
    {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int BinarySearchRecursion(int arr[], int l, int r, int target)
    {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                return BinarySearchRecursion(arr, l, mid - 1, target);
            } else {
                return BinarySearchRecursion(arr, mid + 1, r, target);
            }
        }

        return -1;

    }
}

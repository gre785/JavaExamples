package com.gyang.exmaples;


import com.gyang.exmaples.sort.InsertionSort;
import com.gyang.exmaples.sort.MergeSort;
import com.gyang.exmaples.sort.SelectionSort;
import com.gyang.exmaples.util.Fib;
import com.gyang.exmaples.util.FileUtil;


public class Entry
{

    public static void main(String[] args)
    {
        FileUtil.readFile("C:\\Users\\Administrator\\git\\JavaExamples\\src\\main\\java\\com\\gyang\\exmaples\\util\\test.txt");
        System.out.println(FileUtil.counter);
        
        Fib f = new Fib();
        int x = f.FibRegular(5);
        int y = f.FibRecursion(6);
        System.out.println("x = "+x + ",y = "+y);
        
        int arr[] = {9, 4, 6, 8, 2,-2};
        InsertionSort i = new InsertionSort();
        i.Sort(arr);
        InsertionSort.Print(arr);
        
        SelectionSort s = new SelectionSort();
        s.Sort(arr);
        InsertionSort.Print(arr);
        
        MergeSort m = new MergeSort();
        m.Sort( arr, 0, arr.length-1);
        InsertionSort.Print(arr);
    }

}

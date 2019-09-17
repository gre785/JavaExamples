package com.gyang.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream
{
    private static List<Comparable> useStream(List<Comparable> list, Comparable x)
    {
        return list.stream().filter(item -> item.compareTo(x) < 0).sorted(Comparable::compareTo).map(item -> item.hashCode()).distinct().limit(3)
            .collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        useStream(Arrays.asList(new Integer[] {99, 101, 3, 100, 3, 23, 18, 225}), 100).stream().forEach(System.out::println);
    }
}

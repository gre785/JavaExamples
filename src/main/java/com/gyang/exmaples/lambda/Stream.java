
package com.gyang.exmaples.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream
{
    private static List<Person> _persons = Arrays
        .asList(new Person[] { new Person("Tom", 10, "male"), new Person("Jerry", 8, "male"), new Person("Tom", 11, "female")});

    public static void main(String[] args)
    {
        System.out.println(filter().size());
    }

    /**
     * @return a list of persons where duplicated name is removed
     */
    public static List<Person> filter()
    {
        Set<String> set = new HashSet<>();
        return _persons.stream().filter(p -> !set.add(p.getName())).collect(Collectors.toList());
    }

}

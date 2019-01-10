package com.gyang.exmaples;

public class Entry
{

    public static void main(String[] args)
    {
        MyClass mc = new MyClass();
        SubClass sub = new SubClass();
        sub.print(2);

        MyClass obj = sub.getObject();
    }

}

package com.gyang.exmaples.resizable;

import java.awt.event.MouseAdapter;

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

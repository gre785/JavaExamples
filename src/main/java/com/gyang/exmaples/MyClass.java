package com.gyang.exmaples;

public class MyClass
{
    private String name;

    protected void print()
    {
        System.out.println(getClass().getSimpleName());
    }

    public MyClass getObject()
    {
        return this;
    }
}

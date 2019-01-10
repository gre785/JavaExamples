package com.gyang.exmaples.resizable;

public class MyClass
    extends ResizableComponentEx
{
    private String name;

    protected void print()
    {
        System.out.println(getClass().getSimpleName());
    }

    public void initUI()
    {
        setSize(350, 300);
    }

    public MyClass getObject()
    {
        return this;
    }
}

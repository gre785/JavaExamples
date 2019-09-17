package com.gyang.examples.oop.callback;

public class ConcreteCallbackClass implements ICallbackInterface
{
    @Override
    public void iCallbackInterfaceMethod1()
    {
        System.out.println(iCallbackInterfaceMethod2());
    }

    @Override
    public String iCallbackInterfaceMethod2()
    {
        Class clazz = getClass();
        return clazz.getName();
    }
}

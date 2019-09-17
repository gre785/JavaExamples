package com.gyang.examples.oop.callback;

public class CallbackUtil
{
    public CallbackUtil()
    {
    }

    public static void print(ICallbackInterface callback)
    {
        callback.iCallbackInterfaceMethod1();
    }
}

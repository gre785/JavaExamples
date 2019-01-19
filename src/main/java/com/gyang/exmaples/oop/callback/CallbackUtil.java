package com.gyang.exmaples.oop.callback;

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

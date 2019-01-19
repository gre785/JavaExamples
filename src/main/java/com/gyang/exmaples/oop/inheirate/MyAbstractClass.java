package com.gyang.exmaples.oop.inheirate;

public abstract class MyAbstractClass
    implements IMyInterface
{
    @Override
    public String InterfaceGetName()
    {
        return "Implemented in MyAbstractClass " + AbstractGetName();
    }

    public abstract String AbstractGetName();
}

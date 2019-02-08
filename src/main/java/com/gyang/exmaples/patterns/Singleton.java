package com.gyang.exmaples.patterns;

public class Singleton
{
    private static Singleton _instance;

    private Singleton()
    { }

    public static Singleton getInstance()
    {
        return _instance = _instance == null ? new Singleton() : _instance;
    }
}
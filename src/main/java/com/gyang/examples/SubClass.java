package com.gyang.examples;

public class SubClass extends MyClass {
    @Override
    protected void print()
    {
        System.out.println("Won't tell you!");
    }

    protected void print(int num) {
        System.out.println("Won't tell you!" + num);
    }
}

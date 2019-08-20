
package com.gyang.algorithm;

public class DeadLockFixed
{
    // don't use multiple threads (like Swing does)
    // don't hold several locks at once. If you do, always acquire the locks in the same order
    // don't execute foreign code while holding a lock
    // use interruptible locks

    /**
     * Both method are now requesting lock in same order, first Integer and then String.
     * You could have also done reverse e.g. first String and then Integer,
     * both will solve the problem, as long as both method are requesting lock
     * in consistent order.
     */
    public void method1()
    {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }

    public void method2()
    {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
}

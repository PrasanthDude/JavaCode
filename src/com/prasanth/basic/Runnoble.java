package com.prasanth.basic;

class Threadinggg extends Thread 
{
    public void run()
    {
        System.out.println("Parent run method");
    }
    public static void main(String[] args)
    {
        Threadinggg t = new Threadinggg();
        t.start();
        System.out.println("main method");
    }
}
class Child 
{
    public void m1()
    {
        System.out.println("Hello");
    }
}
class Runnoble extends Child implements Runnable {
    public void run()
    {
        System.out.println("Child Run method");
    }
    public static void main(String[] args)
    {
        Runnoble t = new Runnoble();
        t.m1();
        
    }
}

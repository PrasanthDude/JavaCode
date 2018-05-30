package com.prasanth.basic;

public class Singleton 
{
    private static Singleton single_instance = null;
    
    public String s;

    private Singleton()
    {
    	s = "Hi this is prasanth";
    }
    
    public static Singleton getInstance()
    {
    	if(single_instance==null)
    		single_instance = new Singleton();
    	
    	return single_instance;
    }
    
}
class Main
{
	public static void main(String args[])
	{
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.s = (x.s).toUpperCase();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		y.s = (y.s).toLowerCase();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		
		
	}
}


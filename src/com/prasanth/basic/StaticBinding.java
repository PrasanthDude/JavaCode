package com.prasanth.basic;

public class StaticBinding 
{
	
	public static class Superclass
	{
		static void display()
		{
			System.out.println("SuperClass");
		}
	}
	public static class Subclass extends Superclass
	{
		static void display()
		{
			System.out.println("Subclass");
		}
	}
	public static void main(String args[])
	{
		Superclass s = new Superclass();
		Superclass b = new Subclass();
		s.display();
		b.display();
	}

}

package com.prasanth.basic;

class Student
{
	void display()
	{
		int i=10;
		System.out.println(i);
	}
}
class Man extends Student
{
	void display()
	{
		int i= 90;
		System.out.println(i);
	}
}
public class Overridding 
{
	
	public static void main(String args[])
	{
		Man m = new Man();
		m.display();
	}
  
}


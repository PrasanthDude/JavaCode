package com.prasanth.basic;

import java.util.Scanner;

class hi
{
	public void simple(String name)
	{
		System.out.println("Hi"+ " " +name);
	}
	public void display(String name1,String address)
	{
		System.out.println("Entered name is:"+name1);
		System.out.println("Entered address is:"+address);
	}
}
public class Metho1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = in.next();
		System.out.println("Enter your name1:");
		String name1 = in.next();
		System.out.println("Enter your address:");
		String address = in.nextLine();
		
		hi oo = new hi();
		oo.simple(name);
		oo.display(name1, address);
		in.close();
		
	}

}

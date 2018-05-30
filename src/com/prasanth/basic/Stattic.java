package com.prasanth.basic;

class Statttic
{
	static int n =10;
	static final String name;
	static final String address;
	final double salary = 90.89898;
	static
	{
		name = "prasanth";
	}
	static
	{
		address = "12thStreet Guindy";
	}
	public Statttic(final double salary)
	{
		System.out.println(salary);
	}
	public static void main(String[] args) 
	{
		System.out.println(n);
		System.out.println(name);
		System.out.println(address);
		Statttic sta = new Statttic(12341.23);
		System.out.println(sta);
	}
}


package com.prasanth.basic;

class Encaps 
{
	
	private int age;
	private String name;
	private String address;
	
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAge(int newage)
	{
		age = newage;
	}
	public void setName(String newname)
	{
		name = newname;
	}
	public void setAddress(String newaddress)
	{
		address = newaddress;
	}

}
public class Encapsulate
{
	public static void main(String args[])
	{
		Encaps cap = new Encaps();
		cap.setAge(23);
		cap.setName("Prasanth");
		cap.setAddress("4th street vandavasi");
	
		System.out.println("My age is:"+cap.getAge());
		System.out.println("My name is:"+cap.getName());
		System.out.println("My address is:"+cap.getAddress());
		
	}
}
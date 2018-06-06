package com.prasanth.basic;

class Prasanth
{
	String name;
	int age;
	
	@Override
	public String toString() 
	{
		return "Prasanth [name=" + name + ", age=" + age + "]";
	}
	
}
public class ShallowDeepCopy 
{
	public static void main(String args[])
	{
		Prasanth ravi = new Prasanth();
		ravi.name = "Prasanth";
		ravi.age = 20;
		
		System.out.println("ShallowCopy");
		
		Prasanth shallow = ravi;
		
		System.out.println(shallow.name);
		System.out.println(shallow.age);
		
		System.out.println("DeepCopy");
		
		Prasanth deep = new Prasanth();
		
		deep.name = shallow.name;
		deep.age = shallow.age;
		
		System.out.println(deep.name);
		System.out.println(deep.age);
		
		
	}

}

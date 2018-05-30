package com.prasanth.basic;

abstract class Shape
{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	
}
class Circl extends Shape
{

	double radius;
	public Circl(String color,double radius)
	{
		super(color);
		System.out.println("Circle constructor is called");
		this.radius = radius;
	}
	double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	public String toString()
	{
		return "Circle color is:" +super.color+"and the area is:"+area();
	}
	
}
class Rectangle extends Shape
{
	double length;
	double width;
	public Rectangle(String color,double width,double length)
	{
		super(color);
		System.out.println("Rectangle contructor is called:");
		this.length = length;
		this.width = width;
		
	}
	double area()
	{
		return width*length;
	}
	public String toString()
	{
		return "Rectangle color is:" +super.color+ "and the area is:"+area();
	}
}
public class Abstraction
{
	public static void main(String args[])
	{
		Shape s = new Circl("red",2.2);
		Shape d = new Rectangle("blue",2,4);
		System.out.println(s.toString());
		System.out.println(d.toString());
	}
}
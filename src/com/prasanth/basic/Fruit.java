package com.prasanth.basic;

public class Fruit 
{
private String name;
private String quality;

public void display()
{
	System.out.println("Name is:"+name +"and"+ "quality is:"+quality);
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getQuality() 
{
	return quality;
}
public void setQuality(String quality) 
{
	this.quality = quality;
}
}

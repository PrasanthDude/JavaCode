package com.prasanth.basic;

public class CloningDog 
{
     public static void main(String[] args) throws CloneNotSupportedException
     {
    	 Type obj1 = new Type();
    	 
    	 obj1.setSkin("Shiny");
    	 obj1.setColor("white");
    	 
    	 Type obj2 = (Type) obj1.clone();
    	 
    	 System.out.println("Original"+" "+obj1.getSkin()+" "+obj1.getColor());
    	 
    	 System.out.println("Cloned"+" "+obj2.getSkin()+" "+obj2.getColor());
		
	 }
}

class Type implements Cloneable
{
	private String skin;
	private String color;
	
	public Object clone() throws CloneNotSupportedException
	{
		Type objClone = new Type();
		objClone.setSkin(this.skin);
		objClone.setColor(this.color);
		
		return objClone;
	}

	public String getSkin() 
	{
		return skin;
	}

	public void setSkin(String skin) 
	{
		this.skin = skin;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
}
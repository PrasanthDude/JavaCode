package com.prasanth.basic;

import java.util.Scanner;

public class StringPalindrom 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name:");
		String str = in.next();
		String rev = "";
	    for(int i=str.length()-1;i>=0;i--)
	    {
	    	rev = rev+str.charAt(i);
	    }
	    if(str.equals(rev))
	    {
	    	System.out.println("Palindrom");
	    }
	    else
	    {
	    	System.out.println("Not a Palindrom");
	    }
		in.close();
		
		
	}

}

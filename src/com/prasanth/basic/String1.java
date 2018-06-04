package com.prasanth.basic;

import java.util.StringTokenizer;

public class String1 
{
	public static void main(String args[])
	{
		String s = "PrasanthRavi";
		StringBuffer bb = new StringBuffer(s);
		bb.append("Ravi");
		System.out.println(bb);
		
		String s1 = "Prasanth";
		StringBuilder build = new StringBuilder(s);
		build.append("R");
		System.out.println(build);
		if(s.equals(s1))
		{
			System.out.println("It's");
		}
		else
		{
			System.out.println("It isn't");
		}
		StringTokenizer st = new StringTokenizer("Hi This is Prasanth");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		
		
	}
}
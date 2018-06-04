package com.prasanth.basic;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iteration 
{
 public static void main(String[] args) 
 {
	Set<String> sett = new TreeSet<String>();
	sett.add("Oracle");
	sett.add("Liferay");
	sett.add("Sitecore");
	sett.add("Ibm");
	sett.add("Emc2");
	sett.add("Adobe");
	
	System.out.println(sett);
	
	System.out.println("Enhanced loop");
	
	for(String setttt: sett)
		
		System.out.println(setttt);
	
	Iterator<String> it = sett.iterator();
	
	System.out.println("Using Iterator in While");
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("Using Iterator in ForLoop");
	
	for(Iterator<String> itr = sett.iterator();itr.hasNext();)
	{
		System.out.println(itr.next());
	}
	
	
	
 }
}

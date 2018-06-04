package com.prasanth.basic;

import java.util.LinkedList;

public class LinkedLisCollection 
{

	public static void main(String[] args) 
	{
		LinkedList<String> link = new LinkedList<>();
		link.add("Prasanth");
		link.add("Parvez");
		link.add("Faisul");
		link.add("Naveen");
		link.add("Raj");
		
		System.out.println("Linked List printing");
		
		for(String o : link)
			System.out.println(o);
		
		System.out.println("Adding first and Last elements:");
		
		link.addFirst("Pallavi");
		link.addLast("Janaranjani");
		
		for(String added : link)
			System.out.println(added);
		
		System.out.println("Removing elements");
		
		link.remove("Faisul");
		link.removeFirst();
		link.removeLast();
		
		System.out.println(link);
		
		System.out.println("Finding Elements:");
		
		boolean find = link.contains("Parvez");
		
		if(find)
		{
			System.out.println("It's available");
		}
		else
		{
			System.out.println("It's unavailable");
		}
		
		Object lik = link.get(2);
		System.out.println(lik);
		
		link.set(0,"SET");
		
		System.out.println(link);
		
		
		
		
		
		
		
	}
}

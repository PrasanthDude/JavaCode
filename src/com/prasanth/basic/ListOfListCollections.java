package com.prasanth.basic;

import java.util.List;
import java.util.ArrayList;

public class ListOfListCollections 
{
	public static void main(String[] args) 
	{
		
		List<ArrayList<String>> list1 = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> lis = new ArrayList<String>();
		
		lis.add("Prasanth");
		lis.add("Ravi");
		lis.add("Ashok");
		lis.add("Mohan");
		lis.add("Kishore");
		
		list1.add(lis);
		
		ArrayList<String> lis2 = new ArrayList<String>();
		
		lis2.add("Nayanthara");
		lis2.add("Sneha");
		lis2.add("Keerthi Suresh");
		lis2.add("LakshmiRai");
		lis2.add("PriyankaChopra");
		
		list1.add(lis2);
		
		System.out.println(list1);
		
		
		
		
	}

}

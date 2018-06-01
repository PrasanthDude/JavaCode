package com.prasanth.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayLisCollection {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Prasanth");
		arr.add("Ravi");
		arr.add("Janaranjni");
		arr.add("Subhu");
		arr.add("Pallavi");
		arr.add("Pallavi");
		arr.add("Pallavi");
        System.out.println("List before reversing");
		for(String i : arr)
		{
			System.out.println(i);
		}
		
		Collections.reverse(arr);
		System.out.println("List after reversing");
		for(String j : arr)
		{
			System.out.println(j);
		}
		
		ArrayList<String> arr2 = new ArrayList<>();
		
		arr2 = new ArrayList<String>(arr);
		
		System.out.println("Cloned List are:");
		
		for(String o : arr2)
			System.out.println(o);
		System.out.println();
		Set<String> dup = new HashSet<>();
		dup.addAll(arr2);
		
		System.out.println(dup);
		
		arr2.clear();
		arr2.addAll(dup);
	    System.out.println("Duplicates removal");
		for(String l : arr2)
		{
			System.out.println(l);
		}
		System.out.println("Getting the first element from arrayList");
		
	    System.out.println(arr2.get(0));
		
		System.out.println("Getting Specifiend elements from arrayList");
	
		Collections.shuffle(arr);
	
		for(int m=0;m<arr.size();m++)
		System.out.println(arr);
		
		
	}
}

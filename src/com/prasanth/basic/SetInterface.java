package com.prasanth.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterface
{ 
	public static void main(String[] args) 
	{
	    Set<Integer> sett = new HashSet<>();	
	    sett.addAll(Arrays.asList(new Integer[] {4,2,54,1,9,6,34,0,54}));
	    Set<Integer> settt = new HashSet<>();
	    settt.addAll(Arrays.asList(new Integer[] {8,2,1,0,90,67,45,0}));
	    
	    System.out.println("First set");
	    
	    for(Integer i : sett)
	    	System.out.println(i);
	    System.out.println("Second set");
	    
	    for(Integer j : settt)
	    	System.out.println(j);
	    
	    Set<Integer> inter = new HashSet<>(sett);
	    
	    inter.retainAll(settt);
	    System.out.println("Intersection of 2 sets");
	    System.out.println(inter);
	    
	    Set<Integer> diff = new HashSet<>(sett);
	    
	    diff.removeAll(settt);
	    System.out.println("Difference of 2 sets");
	    System.out.println(diff);
	    
	    
	}

}

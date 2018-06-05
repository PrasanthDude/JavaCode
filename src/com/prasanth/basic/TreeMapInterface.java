package com.prasanth.basic;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInterface 
{
 public static void main(String[] args)
 {
    TreeMap<String,String> mp = new TreeMap<String,String>();
    
    mp.put("A","Apple");
    mp.put("C", "Cat");
    mp.put("O", "Orange");
    mp.put("D", "Donut");
    mp.put("B", "Bannana");
    
    for(Map.Entry m : mp.entrySet())
    {
    	System.out.println(m.getKey());
    	System.out.println(m.getValue());
    	
    }
    
    System.out.println("Remove Operations");
    
    mp.remove("D");
    
    System.out.println(mp);
    
 }
}

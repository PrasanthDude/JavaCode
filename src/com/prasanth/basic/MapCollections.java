package com.prasanth.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollections {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Prasanth",10);
		map.put("Janaranjini",20);
		map.put("Faisul",30);
		map.put("Naveen",40);
		map.put("Ravi", 50);
		
		System.out.println(+map.get("Prasanth"));
		
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +"+"+entry.getValue());
		}
		
		System.out.println("Sorted Map");
		
		Map<String,Integer> tree = new TreeMap<>(map);
		
		for(Map.Entry<String,Integer> entry : tree.entrySet())
		{
			System.out.println(entry.getKey() +"+"+ entry.getValue());
		}
		
		
		
	}

}

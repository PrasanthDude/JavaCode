package com.prasanth.basic;

import java.util.EnumMap;
import java.util.Map;

import com.prasanth.basic.Perficient.EnumMapExamaple.Key;

class Perficient
{
	int emp_id;
	String name;
	String org_name;
	int start_date;
	
	public Perficient(int emp_id,String name,String org_name,int start_date)
	{
		this.emp_id = emp_id;
		this.name = name;
		this.org_name = org_name;
		this.start_date = start_date;
	}
	public class EnumMapExamaple
	{
		public enum Key
		{
			One,Two,Three
		};
	}
}
public class EnumMappExample 
{
	public enum Days
	{
		Monday,Tuesday,Wednesday,Thursday,Friday;
	};
	public static void main(String args[])
	{
		 EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
		 
		 EnumMap<Key, Perficient> map1 = new EnumMap<Key,Perficient>(Key.class);  
		 
		 Perficient p = new Perficient(111,"Prasanth","Google",23);
		 Perficient p1 = new Perficient(222,"Priya","Microsoft",43);
		 Perficient p2 = new Perficient(444,"Mohan","IBM",73);
		 
		 map1.put(Key.One,p);
		 map1.put(Key.Two,p1);
		 map1.put(Key.Three,p2);
		 
		 for(Map.Entry<Key,Perficient> entry:map1.entrySet())
		 {      
	            
			    Perficient b=entry.getValue();    
	            System.out.println(b.emp_id+" "+b.name+" "+b.org_name+" "+b.start_date);     
		 
		 
		 }
		 map.put(Days.Monday, "Monday office day");
		 map.put(Days.Tuesday, "Tuesday the next day of Monday");
		 map.put(Days.Wednesday, " Wednesday the next day of Tueday");
		 map.put(Days.Thursday, "Thursday the next day of Wednesday");
		 map.put(Days.Friday, "Friday, It's a funDay");
		 
		 for(Map.Entry m : map.entrySet())
		 {
			 System.out.println(m.getKey());
			 System.out.println(m.getValue());
		 }
		 
		
	}
}

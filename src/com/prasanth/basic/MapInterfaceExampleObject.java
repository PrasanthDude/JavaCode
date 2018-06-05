package com.prasanth.basic;

import java.util.LinkedHashMap;
import java.util.Map;

class Perf
{    
	int id;    
	String name,gender,address;    
	int price;    
	public Perf(int id, String name, String gender, String address, int price) 
	{    
	    this.id = id;    
	    this.name = name;    
	    this.gender = gender;    
	    this.address = address;    
	    this.price = price;    
	}    
	}    
	public class MapInterfaceExampleObject
	{    
	public static void main(String[] args) 
	{    
	        
	    Map<Integer,Perf> map=new LinkedHashMap<Integer,Perf>();  
	    
	    Perf b1=new Perf(1,"Prasanth","Male","4th street",8);    
	    Perf b2=new Perf(2,"Jana","Female","67th street",4);    
	    Perf b3=new Perf(3,"Ravi","Male","23rd Street",6);    
	     
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    
	    for(Map.Entry<Integer, Perf> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Perf b=entry.getValue();  
	        System.out.println(key);  
	        System.out.println(b.id+" "+b.name+" "+b.gender+" "+b.address+" "+b.price);   
	    }    
	}    
	}    
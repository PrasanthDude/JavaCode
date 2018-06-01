package com.prasanth.basic;

import java.util.ArrayList;
import java.util.Collections;

class Perficientt implements Comparable<Perficientt>
{
    private String Empname;
    private int DOJ;
    private int age;
    
    public int compareTo(Perficientt p)
    {
    	return this.DOJ-p.DOJ;
    }
    
   public Perficientt(String name,int doj,int age)
    {
    	this.Empname = name;
    	this.DOJ = doj;
    	this.age = age;
    }

public String getEmpname() 
{
	return Empname;
}

public int getDOJ() 
{
	return DOJ;
}

public int getAge() 
{
	return age;
}
   
}

public class ComparableEmployee
{
	public static void main(String[] args)
    {
        ArrayList<Perficientt> list = new ArrayList<Perficientt>();
        list.add(new Perficientt("Prasanth",1990,23));
        list.add(new Perficientt("Naveen", 2091,34));
        list.add(new Perficientt("Faisul", 1998,45));
        list.add(new Perficientt("Ravi", 1901, 10));
 
        Collections.sort(list);
 
        System.out.println("Sorting");
        for (Perficientt p: list)
        {
            System.out.println(p.getEmpname() + " " +p.getDOJ() + " " +p.getAge());
        }
    }
}




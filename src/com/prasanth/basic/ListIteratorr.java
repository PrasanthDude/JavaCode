package com.prasanth.basic;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorr 
{
   public static void main(String[] args) 
   {
        ArrayList<Integer> per = new ArrayList<>();	
        per.add(1);
        per.add(2);
        per.add(3);
        per.add(4);
        per.add(5);
        per.add(6);
        
       ListIterator<Integer> perf = null;
       perf = per.listIterator();
       
       System.out.println("Forward direction");
       
       while(perf.hasNext())
       {
    	   System.out.println(perf.next());
       }
       System.out.println("Backward direction");
       
       while(perf.hasPrevious())
       {
    	   System.out.println(perf.previous());
       }
   }
}

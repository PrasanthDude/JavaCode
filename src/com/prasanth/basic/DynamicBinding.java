package com.prasanth.basic;

public class DynamicBinding 
{
   public static class Superclass
   {
	   void print()
	   {
		   int i=10;
		   System.out.println("i value is:"+i);
	   }
   }
   public static class Subclass extends Superclass
   {
	   void print()
	   {
		   int i=20;
		   System.out.println("i values is:"+i);
	   }
   }
   public static void main(String args[])
   {
   Superclass s = new Superclass();
   Superclass d = new Subclass();
   s.print();
   d.print();
    }
}

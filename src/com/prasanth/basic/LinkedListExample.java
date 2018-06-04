package com.prasanth.basic;

import java.util.LinkedList;

class Perficient12
{
	int Perfno;
	int PerfEmpno;
	String Perfname;
	String PerfAddress;
	public Perficient12(int no,int empno,String name,String address)
	{
		this.Perfno = no;
		this.PerfEmpno = empno;
		this.Perfname = name;
		this.PerfAddress = address;
	}
}
public class LinkedListExample 
{
   public static void main(String args[])
   {
	   LinkedList<Perficient12> perf = new LinkedList<Perficient12>();
	   Perficient12 perf1 = new Perficient12(12,123,"PerficientNoida","Noida");
	   Perficient12 perf2 = new Perficient12(13,1234,"PerficientNagpur","Nagpur");
	   Perficient12 perf3 = new Perficient12(14,12345,"PerficientDubai","Dubai");
	   Perficient12 perf4 = new Perficient12(15,4321,"PerficientSriLanka","SriLanka");
	   
	   perf.add(perf1);
	   perf.add(perf2);
	   perf.add(perf3);
	   perf.add(perf4);
	   
	   for(Perficient12 P : perf)
		   System.out.println(P.Perfno+" "+P.PerfEmpno+" "+P.Perfname+" "+P.PerfAddress);
	   
	   System.out.println("Removal");
	   
	   perf.removeFirst();
	   perf.removeLast();
	   perf.remove(1);
	   
	   for(Perficient12 P : perf)
		   System.out.println(P.Perfno+" "+P.PerfEmpno+" "+P.Perfname+" "+P.PerfAddress);
	   
	   perf.getFirst();
	   perf.getLast();
	   
	   System.out.println("First and Last");
	   for(Perficient12 P : perf)
		   System.out.println(P.Perfno+" "+P.PerfEmpno+" "+P.Perfname+" "+P.PerfAddress);
	   
	   
   }
}

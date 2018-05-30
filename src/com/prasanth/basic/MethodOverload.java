package com.prasanth.basic;

class Perficient
{
	public int employee()
	{
		return 0;
	}
	public int employee(int age)
	{
		return age;
	}
	public double employee(double salary,double insuranceno)
	{
		return salary - insuranceno;
	}
	public float employee(float lastMonthsalary,float thisMonthsalary,float nextMonthSalry)
	{
		return lastMonthsalary+thisMonthsalary+nextMonthSalry;
	}
	
}

public class MethodOverload
{
    public static void main(String[] args) {
		
    	Perficient p = new Perficient();
    	p.employee();
    	p.employee(23);
    	p.employee(22.500, 45);
    	
    	
	}	
}


package com.prasanth.basic;

import java.util.Scanner;

public class fact 
{
public static void main(String[] args) 
{
	Scanner nn = new Scanner(System.in);
	System.out.println("Enter number:");
	int n = nn.nextInt();
	int i=1;
	int f =1;
	while(i<=n)
	{
		f = f*i;
		i++;
	}
	System.out.println(f);
	nn.close();
	
	
}
}

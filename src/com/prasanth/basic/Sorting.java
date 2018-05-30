package com.prasanth.basic;

import java.util.Scanner;

class Sorting
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n = in.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			ar[i] = in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]<ar[j])
				{
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		in.close();
	}
}

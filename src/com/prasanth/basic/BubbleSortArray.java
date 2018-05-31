package com.prasanth.basic;

import java.util.Scanner;

public class BubbleSortArray
{
	public static void main(String[] args) 
	{
	     Scanner op = new Scanner(System.in);
	     System.out.println("Enter size:");
	     int n = op.nextInt();
	     System.out.println("Enter elements: ");
	     int arr[] = new int[n];
	     for(int i=0;i<arr.length;i++)
	     {
	    	 arr[i] = op.nextInt();
	     }
	     System.out.println("Entered Elements are:");
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	     for(int i=0;i<n;i++)
	     {
	    	 for(int j=0;j<n-i-1;j++)
	    	 {
	    		 if(arr[j]>arr[j+1])
	    		 {
	    			 int swap = arr[j];
	    			 arr[j] = arr[j+1];
	    			 arr[j+1] = swap;
	    		 }
	    	 }
	     }
	     System.out.println("Sorted elements");
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	     
	}
}
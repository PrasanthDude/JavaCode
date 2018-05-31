package com.prasanth.basic;

public class InsertionSort 
{
	
	public static void main(String args[])
	{
	     int arr[] = {8,1,6,3,4,0,1};
	     int len = arr.length;
	     for(int i=0;i<len;i++)
	     {
	    	 for(int j=i;j>0;j--)
	    	 {
	    		 if(arr[j] < arr[j-1])
	    		 {
	    			 int swap = arr[j];
	    			 arr[j] = arr[j-1];
	    			 arr[j-1] = swap;
	    		 }
	    	 }
	     }
	     for(int i=0;i<len;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	}

}

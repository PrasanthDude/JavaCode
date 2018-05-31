package com.prasanth.basic;

public class MatricTranspose 
{

	public static void main(String[] args) 
	{
	   int arr1[][] = {{1,2,3},{2,4,3},{5,3,0}};
	   int trans[][] = new int[3][3];
	   
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   trans[i][j] = arr1[j][i];
		   }
	   }
	   System.out.println("Matrix:");
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   System.out.print(arr1[i][j]);
		   }
		   
		   	System.out.println();
	   }
	   System.out.println("Transpose");
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   System.out.print(trans[i][j]);
		   }
		   
		   System.out.println();
	   }
		   
	}
}

package com.prasanth.basic;

import java.util.Scanner;

public class TransposeUserInput
{
   public static void main(String args[])
   {
	   
	   Scanner dot = new Scanner(System.in);
	   System.out.println("Enter rows and Columns:");
	   int row = dot.nextInt();
	   int column = dot.nextInt();
	   int arr[][] = new int[row][column];
	   
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<column;j++)
		   {
			   arr[i][j] = dot.nextInt();
		   }
	   }
	   
	   System.out.println("Matrix");
	   
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<column;j++)
		   {
			   System.out.print(arr[i][j]);
		   }
		   System.out.println();
	   }
	   
	   System.out.println("Transpose");
	   
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<column;j++)
		   {
			   System.out.print(arr[j][i]);
		   }
		   System.out.println();
	   }
   }
   
}

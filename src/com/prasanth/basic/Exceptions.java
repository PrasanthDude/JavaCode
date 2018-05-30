package com.prasanth.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Exceptions
{
	public static void main(String[] args) throws IOException 
	{
		
		try
		{
			int num1 = 100,num2 = 0;
			int out = num1/num2;
			System.out.println("Result is:"+out);
			
			int array[] = new int[5];
			for(int i=0;i<array.length;i++)
			{
				System.out.println(i);
				System.out.println(array[10]);
			}
			 FileInputStream fis = null;
			 fis = new FileInputStream("C://prasantResume.txt");
			 int k;
			 while(( k = fis.read() ) != -1)
		      {
		        System.out.print((char)k);
		      }
		      fis.close();
			
			
        }
		catch(FileNotFoundException fp)
		{
			fp.printStackTrace();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException iop)
		{
			iop.printStackTrace();
		}
	}
}
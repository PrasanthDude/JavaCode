package com.prasanth.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite 
{
	public static void main(String[] args) throws IOException
	{
		
		FileInputStream PrasanthRead = null;
		FileOutputStream PrasanthWrite = null;
		
		try
		{
			PrasanthRead = new FileInputStream("D:\\DailyActivities.txt");
			PrasanthWrite = new FileOutputStream("D:\\Perficientcode.txt");
			int i;
			
			while((i = PrasanthRead.read())!=-1)
			{
				
				PrasanthWrite.write(i);
			}
	
		}
		catch(IOException po)
		{
			po.printStackTrace();
		}
		finally
		{
			PrasanthRead.close();
			PrasanthWrite.close();
			
		}
		
	}
}

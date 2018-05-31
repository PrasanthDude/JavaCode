package com.prasanth.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCharacterStream 
{
      public static void main(String args[]) throws IOException
      {
    	  File reader = new File ("D:\\DailyActivities.txt");
    	  File writerprasanth = new File ("D:\\Empty.txt");
    	  File readerprasanth = new File ("D:\\beann.xml");
    	  BufferedReader read = new BufferedReader(new FileReader(readerprasanth));
    	  BufferedWriter writer = new BufferedWriter(new FileWriter(writerprasanth));
    	  Scanner sn = new Scanner(reader);
    	  
    	  writer.write("Welcome to Perficient");
    	  
    	  while(sn.hasNextLine())
    	  {
    		 System.out.println(sn.nextLine());
    	  }
    	 
    	  String str;
    	  while((str = read.readLine())!=null)
    	  {
    		 System.out.println(str);
    	  }
    	  
    	  writer.close();
    	  read.close();
    	  sn.close();
    	 }
}

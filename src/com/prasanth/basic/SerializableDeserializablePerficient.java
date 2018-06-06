package com.prasanth.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PerficientDetails implements Serializable
{
	String name;
	String address;

}

public class SerializableDeserializablePerficient
{
	public static void main(String args[]) throws ClassNotFoundException,IOException
	{
		PerficientDetails perfy = new PerficientDetails();
		perfy.name = "Perficient";
		perfy.address = "Guindy";
		
		try
		{
			FileOutputStream fout = new FileOutputStream("D:\\perficient.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(perfy);
			oout.close();
			fout.close();
			System.out.println("Data is saved");
			FileInputStream fin = new FileInputStream("D:\\perficient.txt");
			ObjectInputStream din = new ObjectInputStream(fin);
			
			PerficientDetails perfy1 = (PerficientDetails) din.readObject();
			System.out.println(perfy1.name);
	    	 System.out.println(perfy1.address);
			din.close();
			fin.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
	}
}

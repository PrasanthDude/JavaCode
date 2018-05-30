package com.prasanth.basic;

public class Threading extends Thread {
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			 System.out.println(i);
			 try
			 {
				 Thread.sleep(400);
				 
			 }catch(InterruptedException e)
			 {
				 System.out.println(e);
		     }  
		}
		
	}
	public static void main(String args[])
	{
		Threading ding = new Threading();
		ding.start();
	}

}

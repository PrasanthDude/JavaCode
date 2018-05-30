package com.prasanth.basic;

public class PalindromNumber 
{
	public static void main(String[] args) 
	{
	    int n = 94345;
	    System.out.println("Entered number is:"+n);
	    int t = n;
	    int rev=0;
	    while(n!=0)
	    {
	    	rev = rev*10+n%10;
	    	n/=10;
	    }
	    System.out.println("Is this a palindrom???");
	    if(rev==t)
	    {
	    	System.out.println("Yeap");
	    }
	    else
	    {
	    	System.out.println("Nope");
	    }
		
	}

}

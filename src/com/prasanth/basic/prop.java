package com.prasanth.basic;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
class prop
{
 public static void main(String arg[])
 {
     Properties p = new Properties();
     Set URL;
     String str;
      
     p.put("google", "www.google.com");
     p.put("amazon", "www.amazon.in");
     p.put("flipkart", "www.flipkart.com");
      
   
     URL = p.keySet();
     Iterator itr = URL.iterator();
      
     while(itr.hasNext())
     {
         str = (String)itr.next();
         System.out.println("The URL for" + str + 
                 " is " + p.getProperty(str));
     }
      
     System.out.println();
     str = p.getProperty("This site is", "not found");
     System.out.println("The URL for Snapdeal is " + str);
      
 }
}

package com.prasanth.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestion
{
	public static void main(String[] args) throws Exception
	{
		
		try 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanth.Ravi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        
	        driver.get("http://www.google.com");
	        driver.findElement(By.id("lst-ib")).sendKeys("perficient");
	        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbqs_c']"));
	        System.out.println("Total number of Suggestions");
	        
	        System.out.println(list.size());
	        
	        for(int i=0;i<list.size();i++)
	        {
	        	Thread.sleep(100);
	        	System.out.println(list.get(i).getText());
	        	if(list.get(i).getText().toLowerCase().contains("perficient meaning")) {
	        		
		        	list.get(i).click();
		        
	        	}
	        	
	        		
	        		
	        	
	        }
	        
	    } 
		
		catch (NoClassDefFoundError ex) 
		{
	        ex.printStackTrace();
	    }
	}

}
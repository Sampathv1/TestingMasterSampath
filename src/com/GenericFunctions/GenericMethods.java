package com.GenericFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GenericMethods {
	
	public static WebDriver driver;
	
	static Actions acc;


		/***************************************************
		Method Name    : launchBrowser	
		Description	:  This  Method  is to launch the Browser
		Input  parameters	:   browserType and url
		Created By :	Sampath
		Reviewed By :
		

		***************************************************/
	
	
	public static boolean launchBrowser(String browserType, String url)
	{
		
		boolean status = true;
		
		try
		{
	   	/* Convert the browserType String to lower case*/
			switch (browserType.toLowerCase())
	   	{
	   	case "ff": 
	   		driver = new FirefoxDriver();
	   		System.out.println(url);
	   		driver.get(url);
	   		Thread.sleep(5000);
	   		break;
	   	}
		}
		catch (Exception e) 
		{
			status = false;
			System.out.println(e.getMessage());
		}
		
		driver.manage().window().maximize();
		return false;
	}

	public static boolean clickandclear(WebElement element, String data1)
	{
	
		boolean status = true;
		
		try
		{
			acc = new Actions(driver);
			acc.moveToElement(element).click().build().perform();
			element.clear();
			element.sendKeys(data1);
						
		}catch (Exception e)
		{
			status = false;
			System.out.println(e.getMessage());
			System.out.println("Unable to enter the data" + element);
			
	}
		return status;
		
	}
	
	public static void movetoLink(String LinkText)
	{
		WebElement e = driver.findElement(By.xpath(LinkText));
		Actions a = new Actions(driver);
	    a.moveToElement(e).build().perform();	
	}
	

	public static boolean Elementdisplay(String Fieldtext)
	{
	   driver.findElement(By.xpath(Fieldtext)).isDisplayed();
	   return true;
	
	}
	
	
	public static boolean TestGit(String Fieldtext)
	{
	   driver.findElement(By.xpath(Fieldtext)).isDisplayed();
	   return true;
	
	}
	
	
	
	
}

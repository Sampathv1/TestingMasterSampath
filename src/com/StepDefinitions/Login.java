package com.StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.GenericFunctions.GenericMethods;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends GenericMethods {
	
	static boolean Status = true;
	
	
	@Given ("^Launch \"([^\"]*)\" Browser and enter the \"([^\"]*)\"$")
	public static boolean launch(String browser, String url, DataTable table)
	{
	   
		List<List<String>> data  = table.raw();
		
		System.out.println(data.get(0).get(0));
		
		url = data.get(0).get(0);
		
		return  Status = launchBrowser(browser,url);
	
	}

	@Then("^Click on username and enter the \"([^\"]*)\"$")
	public static boolean InputClickandClear(String fieldname, DataTable table)
	{
		
	List<List<String>> data  = table.raw();
		
		String data1 = data.get(0).get(0);
		
		System.out.println(data1);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		
		WebElement ele = driver.findElement(By.xpath("//*[@name='uname']"));
		
		
		return  Status = clickandclear(ele, data1);
	
		
		
		
		
		

	}
	
	
	@When("^Click on \"([^\"]*)\" to navigate to next page$")
	public static void Navigate(String LinkText)
	{
		
		LinkText="//";
	    movetoLink(LinkText);

	}
	
	@Then("^Verify the \"([^\"]*)\" is displayed or not$")
	public static void VerifyElementDisplay(String Fieldtext)
	{
		
		Fieldtext = "//*[@name='uname']";
	    Elementdisplay(Fieldtext);

	}
	
	
	

















}	
	
	



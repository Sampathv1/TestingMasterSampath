package com.StepDefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Admin;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonAnnotations extends GenericMethods{
	
	public static Admin admin = PageFactory.initElements(driver, Admin.class);
	
	static boolean Status;
	 @Given ("Launch \"([^\"])\" Browser and enter the \"([^\"])\"")
	
	 public static boolean launch(String browser, String url, DataTable table)
		{
		   
			List<List<String>> data  = table.raw();
			
			System.out.println(data.get(0).get(0));
			
			url = data.get(0).get(0);
			
			return  Status = launchBrowser(browser,url);
		
		}

	
	
	
	@Then("Click on admintab")
	
	public static void ClickAdmintab()
	
	{
		Admin.Click_Admin();
	
	}


}

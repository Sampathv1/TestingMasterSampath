package com.StepDefinitions;

import org.openqa.selenium.support.PageFactory;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Admin;

import cucumber.api.java.en.Then;

public class TC_01_HomePage_Login extends GenericMethods{
	
	public static Admin admin = PageFactory.initElements(driver, Admin.class);
	

	
	@Then("Close the Browser")
	
	public static void ClickAdmintab()
	
	{
		
		
	}

}

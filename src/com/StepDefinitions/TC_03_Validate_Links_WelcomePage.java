package com.StepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Admin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TC_03_Validate_Links_WelcomePage extends GenericMethods {
	
	public static Admin admin = PageFactory.initElements(driver, Admin.class);
		
	
	// @And("Validate the Links")

	/*
	
public static void Validate()
	
	{
		
		Admin.Adminpage_validate();
	

	}

*/
}

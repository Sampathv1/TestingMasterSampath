package com.StepDefinitions;

import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Admin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TC_02_Login_Adminuser extends GenericMethods{

	public static Admin admin = PageFactory.initElements(driver, Admin.class);
	
	
		
	@And(("^Enter the username and enter the password$"))
	
	public static void userDetails()
	
	{
		
		
		Admin.User_Input();
		Admin.User_pwd();
		Admin.User_submit();
		

	}

	
}

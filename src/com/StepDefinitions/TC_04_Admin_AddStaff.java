package com.StepDefinitions;

import org.openqa.selenium.support.PageFactory;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Admin;

import cucumber.api.java.en.Then;

public class TC_04_Admin_AddStaff extends GenericMethods{
	
	public static Admin admin = PageFactory.initElements(driver, Admin.class);
	

	@Then("^Click Add Staff member$")
	public void click_Add_Staff_member()  {
		
	    
	}

	@Then("^Enter the Staff Details and click on Add Staff member$")
	public void enter_the_Staff_Details_and_click_on_Add_Staff_member() {
	   	
		Admin.Add_Staff();
	
	}


	

}

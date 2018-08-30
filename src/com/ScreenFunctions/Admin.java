package com.ScreenFunctions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericMethods;


public class Admin extends GenericMethods {
	
  //
  @FindBy(how=How.XPATH,using="//a[normalize-space(text())='Admin']")
  public static WebElement Tab_Admin_Homepage;
  
  @FindBy(how=How.XPATH,using="//input[@name='uname']")
  public static WebElement Tab_Admin_Username;
  
  
  @FindBy(how=How.XPATH,using="//input[@name='pwd']")
  public static WebElement Tab_Admin_Pwd;
  
 
  @FindBy(how=How.XPATH,using="//input[@type='submit']")
  public static WebElement Tab_Admin_Submit;
  
  @FindBy(how=How.XPATH,using="//u")
  public static WebElement Tab_Admin_Links;
  
  @FindBy(how=How.XPATH,using="//a[text()='Add staff member']")
  public static WebElement Link_Add_Staff_Member;
  
  @FindBy(how=How.XPATH,using="//input[@name='staff_name']")
  public static WebElement Field_Add_Staff_name;
   
  @FindBy(how=How.XPATH,using="//input[@name='staff_gender']")
  public static WebElement Field_Add_Staff_gender;
  
  @FindBy(how=How.XPATH,using="//input[@name='staff_dob']")
  public static WebElement Field_Add_Staff_dob;
  
  @FindBy(how=How.XPATH,using="//select[@name='staff_status']")
  public static WebElement Field_Add_Staff_status;
  
  @FindBy(how=How.XPATH,using="//select[@name='staff_dept']")
  public static WebElement Field_Add_Staff_dept;
  
  @FindBy(how=How.XPATH,using="//input[@name='staff_doj']")
  public static WebElement Field_Add_Staff_doj;
  
  @FindBy(how=How.XPATH,using="//textarea[@name='staff_address']")
  public static WebElement Field_Add_Staff_address;
  
  @FindBy(how=How.XPATH,using="//input[@name='staff_mobile']")
  public static WebElement Field_Add_Staff_mobile;
  
  @FindBy(how=How.XPATH,using="//input[@name='staff_email']")
  public static WebElement Field_Add_Staff_email;

  @FindBy(how=How.XPATH,using="//input[@name='staff_pwd']")
  public static WebElement Field_Add_Staff_pwd;
  
  @FindBy(how=How.XPATH,using="//input[@value='ADD STAFF MEMBER']")
  public static WebElement Field_Add_Staff_Submit;
		  



  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
  public static List<String> tabs = new ArrayList<String>();
  
  /***************************************************
	Method Name    : URL Click	
	Description	:  This  Method  is to click the admin tab
	Input  parameters	:   No parameters
	Created By :	Sampath
	Reviewed By :
	***************************************************/
  
  public static boolean Click_Admin()
  {
	  boolean status=true;
	  
	  try
	  {
		
		  Tab_Admin_Homepage.click();
		  
		  System.out.println("Admin tab clicked sucessfully");
		  
	  }catch(Exception e)
	  {
		  
	   System.out.println(e.getMessage());	  
	   System.out.println("Unable to click on the Admin tab");
	 
	  }
	return status;
  }

  
  /***************************************************
	Method Name    : User_Input()
	Description	:  This  Method  is to click the input value to username field
	Input  parameters	:   No parameters
	Created By :	Sampath
	Reviewed By :
	***************************************************/


 public static boolean User_Input()
  {
	  boolean status=true;
	  
	  try
	  {
		
		  clickandclear(Tab_Admin_Username,"admin");
		 // Tab_Admin_Username.click();
		 // Tab_Admin_Username.sendKeys("admin");
		  System.out.println("User name entered sucessfully");
		  
	  }catch(Exception e)
	  {
		  
	   System.out.println(e.getMessage());	  
	   System.out.println("Unable to enter the user name");
	 
	  }
	return status;
  }

 /***************************************************
	Method Name    : User_pwd()	
	Description	:  This  Method  is to click the input value to password field
	Input  parameters	:   No parameters
	Created By :	Sampath
	Reviewed By :
	***************************************************/

 
 
 
 public static boolean User_pwd()
  {
	  boolean status=true;
	  
	  try
	  {
		
		  clickandclear(Tab_Admin_Pwd,"admin");
		  
		 // Tab_Admin_Pwd.click();
		  //Tab_Admin_Pwd.sendKeys("admin");
		  
		  System.out.println("password entered sucessfully");
		  
	  }catch(Exception e)
	  {
		  
	   System.out.println(e.getMessage());	  
	   System.out.println("Unable to enter the password");
	 
	  }
	return status;
  }

 /***************************************************
	Method Name    : 	User_submit()
	Description	:  This  Method is to the click on submit
	Input  parameters	:   No parameters
	Created By :	Sampath
	Reviewed By :
	***************************************************/

 
 
  public static boolean User_submit()
  {
	  boolean status=true;
	  
	  try
	  {
		
		  Tab_Admin_Submit.click();
		  
		  System.out.println("Submit is clicked sucessfully");
		  
	  }catch(Exception e)
	  {
		  
	   System.out.println(e.getMessage());	  
	   System.out.println("Submit is clicked not succesfully");
	 
	  }
	return status;
  }

  /***************************************************
	Method Name    : Adminpage_validate()	
	Description	:  This  Method  is to click the validate the admin page
	Input  parameters	:   No parameters
	Created By :	Sampath
	Reviewed By :
	***************************************************/

  
  public static boolean AddStaff_Validate()
  {
	  boolean status=true;
		 
	  try
	  {
		  Link_Add_Staff_Member.click();
		  List<WebElement> alltabs = driver.findElements(By.cssSelector("//input:invalid"));
		  System.out.println((alltabs.size()));
		  int count = alltabs.size();
		  for (int i=0 ; i<=count;i++)
		  {
			  clickandclear(Field_Add_Staff_name,"sampath");
			  User_submit();
			  List<WebElement> alltabs1 = driver.findElements(By.cssSelector("//input:invalid"));
			 count =  alltabs1.size();
			  
			  
			  
		  }
		  
		 
				  
				 
	}catch(Exception e)
	  {
		  
	   System.out.println(e.getMessage());	  
	   System.out.println("Not in Expected order");
	 
	  }
	return status;
  }

  

  /***************************************************
 	Method Name    : 	Add_Staff()
 	Description	:  This  Method is to the click on Add
 	Input  parameters	:   No parameters
 	Created By :	Sampath
 	Reviewed By :
 	***************************************************/

  
  
   public static boolean Add_Staff()
   {
 	  boolean status=true;
 	  
 	  try
 	  {
 		
 		 Link_Add_Staff_Member.click();
 		  
 		  System.out.println("Submit is clicked sucessfully");
 		
 		 Field_Add_Staff_name.sendKeys("Sampath");
 		 
 		 Field_Add_Staff_gender.click(); 

 		 Field_Add_Staff_dob.sendKeys("10/10/2011");
 		 
 		Field_Add_Staff_status.click();
 		
 		Field_Add_Staff_dept.click();
 		
 		Field_Add_Staff_doj.sendKeys("10/10/2018");
 		
 		Field_Add_Staff_address.sendKeys("Text Area");
 		
 		Field_Add_Staff_mobile.sendKeys("9199999111");
 		
 		Field_Add_Staff_email.sendKeys("xyz@test.com");
 		
 		Field_Add_Staff_pwd.sendKeys("sampath");
 		
 		Field_Add_Staff_Submit.click();
 		
 	}catch(Exception e)
 	  {
 		  
 	   System.out.println(e.getMessage());	  
 	   System.out.println("Submit is clicked not succesfully");
 	 
 	  }
 	return status;
   }
  
  
  
  
  
  
  
}

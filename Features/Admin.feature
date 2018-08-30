Feature: Validate the following funtionalities on the login module
		As an Admin user application should accept only admin credentials
		
	 	Background:
		  Given Launch "FF" Browser and enter the "url"
		  |http://Server/bank|
		  Then Click on admintab
		  
		  And  Enter the username and enter the password
		  
@tab
Scenario: This scenario is designed to validate the valid credentials of admin user
  
    
    Then Close the Browser
   
 
   
    
    
  @tab2
Scenario: This scenario is designed to validate the links after successful login
   
    And  Enter the username and enter the password
    And Validate the Links
    
  
  @tab3
	Scenario: This scenario is designed to validate the links after successful login
   
    	
    	
    	Then Click Add Staff member
    	And  Enter the Staff Details and click on Add Staff member
    
    
    
    
    
    
    
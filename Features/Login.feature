Feature: Validate the following funtionalities on the login module
	As an Admin user application should accept only admin credentials
	if there is a invalid user name and password user must validate the error message
	if the user forgot user name and password should be able to reset

@smoketest
Scenario: This scenario is designed to validate the valid credentials of admin user
    Given Launch "FF" Browser and enter the "url"
    |http://Server/bank|
    Then Click on username and enter the "Fieldname"
    |Sampath|
    When Click on "LinkText" to navigate to next page
    Then Verify the "Fieldtext" is displayed or not  
    
	
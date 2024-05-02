Feature: Login
#@sanity
#Scenario: Successful Login with Valid Credentials 
#	Given User Launch "Chrome" browser and opens URL "http://admin-demo.nopcommerce.com/login" 
#	When User enters Email  "admin@yourstore.com" and Password  "admin" 
#	And Click on Login 
#	Then Page Title should be "Dashboard / nopCommerce administration" 
#	When User click on Log out link 
#	Then Page Title should be "Your store. Login" 
#	And close browser 
	
	@sanity 
	Scenario: Successful Login with InValid  and valid Credentials 
	Given User Launch "Chrome" browser and opens URL "http://admin-demo.nopcommerce.com/login" 
	When User enters Email as <email> and Password as <password> 
	And Click on Login 
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User click on Log out link 
	Then Page Title should be "Your store. Login" 
	And close browser 
	
	Examples:
|email|password|
|admin@yourstore.com|admin|
|test@yourstore.com|admin|

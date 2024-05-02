Feature: Customers
Background: Steps common for all scenrios

    Given User Launch the "Chrome" browser and opens URL "http://admin-demo.nopcommerce.com/login" 
    And User enters Email "admin@yourstore.com" and Password  "admin"
    And Click on the Login
    Then User can view the Dashboad
    
 @regression
  Scenario: Add New Customer  
    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info 13
    And click on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And Enter customer Email
    When Click on search button 
    And close the browser
    
    #@Sanity 
  # Scenario: Search Customer by FirstName
    #When User click on customers Menu
    #And click on customers Menu Item
    #And Enter customer FirstName
    #And Enter customer LastName
    #When Click on search button
    #Then User should found Name in the Search table
    #And close browser

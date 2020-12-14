
@CRM_activity2
Feature: To Create Leads
 
 
  Scenario: Creating Leads using parameterization
    Given The user is at login page
    And Admin User enters Username and Password.
    When Userr navigates to Sales Page
    And Select the Leads option
    And Clicks on Create Lead option
    And User enters the values"<Firstname>"and"<Lastname>"and"<EmailID>"
    And Saves the Lead 
    Then Navigates to the View Leads Page to see results
    And Closes the browser


    Examples: 
      | Firstname| Lastname | EmailID  |
      | Borris     | Becker | Test@email.com     |
      

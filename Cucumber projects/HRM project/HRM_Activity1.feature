#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@HRM_Activity1
Feature: Creating a job vacancy
  To create a job vacancy for “DevOps Engineer”

  @test
  Scenario: create a job vacancy for “DevOps Engineer”
    Given User is on OrangeHRM page
    When User logs in
     And Navigate to Recruitment page
    Then Click on the Vacancies menu item
    And Click on the Add button
    Then Fill out the necessary details and click on save
    And Verify the vacancy is created
    And close the browser


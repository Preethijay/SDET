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
@HRM_Activity2
Feature: Adding a candidate for recuitment
  Add information about a candidate for recruitment

  @test
  Scenario: Add a candidate for recruitment
    Given User on OrangeHRM welcome page
    When User logs in to the site
    And Navigate to Recruitment page and click on Add button
    And Click on the Add button to add a candidate
    Then Fill in the details of the candidate
    And Upload the resume and click on save
    And Navigate back to the Recruitments page 
    Then close windows

 

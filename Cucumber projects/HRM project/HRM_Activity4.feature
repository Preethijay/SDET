
@HRM_Activity4
Feature: Creating job vacancy
  

  @tag2
  Scenario Outline: To create a job vacancy for devops engineer 
    Given User is on Login page.
    When User enters"orange"and"orangepassword123"
    And Navigate to recruitment page
    And Click on the Vacancies menu item to navigate to the vacancies page
    And Click on the Add button to navigate to the Add Job Vacancy form
    And Fill the necessary details"<JobTitle>"and"<JobVacancy>"and"<HiringManager>"
    Then Verify that the vacancy was created"<JobVacancy>"
    And Closes the browser.
    
    Examples: 
    | JobTitle | JobVacancy | HiringManager |
    | DevOps Engineer | DevEng1 | Test Employee |
    | Java Developer | JavaDev1 | Test Employee |
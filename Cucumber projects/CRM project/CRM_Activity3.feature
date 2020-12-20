
@CRMActivity3
Feature: To Schedule Meeting with Friends
  

  Scenario: Scheduling a meeting with three invitees
     Given User navigates to Login Page
    When User Enters the "admin" and "pa$$w0rd" 
    And Navigate to Activites and click on Meetings
    And Click on Schedule meeting
    And Add "<FirstMember>" and "<LastMember>" to meeting
    And Enter meeting details and click save
    Then Navigate to View Meetings page and Verify creation of meeting
    And Browser Closes


Examples: 
      | FirstMember| LastMember | 
      | Borris     | Denise      | 
      

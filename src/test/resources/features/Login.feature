Feature: Login related scenarios

  Background:
    #Given user is able to access the HRMS application

  @sprint1 @alpha
  Scenario: Valid admin login

    When user enters valid user name and password
    And user clicks on login button
    Then user has is able to see the dashboard page

    Scenario: Invalid admin login
      #Given user is able to access the HRMS application
      When user enters invalid name and password
      And user clicks on login button
      Then user can see error message
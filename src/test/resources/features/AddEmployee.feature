Feature: Add Employee

  Background:

    #Given user is able to access the HRMS application
    When user enters valid user name and password
    And user clicks on login button
    Then user has is able to see the dashboard page
    When user clicks on PIM option
    And when user clicks on Add employee option

@spritnt2 @magic @melissa
  Scenario: Adding the employee by first and lastname

    And user enters first name and last name
    And user clicks on save button
    Then employee added successfully

    @sprint1 @mojo @melissa
    Scenario: Adding employee by firstname middlename and lastname

      And user adds firstname middlename and lastname
      And user clicks on save button
      Then employee added successfully

      @param
      Scenario: Adding employee using parameters
        And user enters "mark" and "kairm" and "jacob" the application
        And user clicks on save button
        Then employee added successfully

        @example
        Scenario Outline: adding multiple employees
          And user adds "<firstName>", "<middleName>", and "<lastName>"
          And user clicks on save button
          Then employee added successfully
          Examples:
            | firstName | middleName | lastName |
            |mark       |karim       |jacob     |
            |adam       |ms          |anthony   |
            |steve      |ms          |jacob     |

          @data
          Scenario: Adding employees using data table
            When user adds multiple employees using data table and save them
            | firstName | middleName |lastName  |
            |mark       |karim       |jacob     |
            |adam       |ms          |anthony   |
            |steve      |ms          |jacob     |

            @excel
            Scenario: Adding employees using excel file
              When user adds multiple employees from excel file


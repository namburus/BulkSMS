Feature: Testing the login functionality

  Scenario: As a user i should be able to log into the application
    Given i am on the log in page
    When i enter the username and password
    And click on the login
    Then i should log into the application


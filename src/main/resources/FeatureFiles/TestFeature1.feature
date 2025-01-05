@testLogin
Feature: Login Feature
  I want to use this template for my feature file

  Scenario: Test login with valid login credentials
    Given The user is on the login page
    When The user is trying to enter user name as ""
    And The user enter password as ""
    And The login button is clicked
    Then Login should be successful

  Scenario Outline: Test login with valid login credentials
    Given The user is on the login page
    When The user enter <username> on login field
    And The user enter <password> on password field
    And The login button is clicked
    Then Login should be successful

    Examples: 
      | username | password |
      | adi      |    12345 |
      | pqr      |     1234 |
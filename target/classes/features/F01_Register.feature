@smoke
Feature: Register - user could login with valid account

  # scenario = test case
  Scenario: user could register with valid email and password

  Given navigate to home page
  And go to register page
    When select gender type
    And Enter first and last name
    And Enter birth of date
    And enter email
    And Enter password and confirm password
    And click on rigister button
    Then verify user registered successfully

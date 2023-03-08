#feature = user story
@smoke
Feature: login - user could login with valid account

  # scenario = test case
  Scenario: user could login with valid email and password

    #Given   When    And    Then
   # Given open chrome browser
    And navigate to home page
    When go to login page
    When enter valid email and password
    And click on login button
    Then verify user login successfully
    # And quit driver

  Scenario: user could login with valid email and password

    #Given   When    And    Then
   # Given open chrome browser
    And navigate to home page
    When go to login page
    When enter invalid email and password
    And click on login button
    Then verify user not login successfully
    # And quit driver

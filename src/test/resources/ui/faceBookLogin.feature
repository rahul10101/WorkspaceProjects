
@All
Feature: Login Feature
 
  @TC002
  Scenario Outline: Login Fail Possible Combinations
    Given user is on Application landing page
    When user click on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in userName field
    And user enters "<Password>" in password field
    And user clicks Sign in Button
    Then user gets login failed error message

    Examples: 
      |     UserName  	| Password |
      | name1@gmail.com | abc@123 |
      | name2@yahoo.com | xyz@123 |
      | name2@ymail.com | pqr@123 |

#Author

Feature: LoggedIn user view
  Scenario: Validate user is able to loggedIn

    Given User navigates to login page
    When User enters user name and password
    And click on the login page
    Then User is navigated to home page

#  Scenario Outline: Validate user is able to loggedIn
#
#    Given User navigates to login page
#    When User enters <username> and <password>
#    And click on the login page
#    Then User is navigated to home page
#
#    Examples:
#    |username|password|
#    |username1|password1|
#    |username2|password2|
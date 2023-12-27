Feature: Sign in

  Scenario: Wrong Password
    Given I am on the Sign In page
    When I enter the username "TestAccountKaryawan1" and password "PsswordK1"
    And I click on the Login button
    Then I should see an error message indicating incorrect password
    And I should stay on the Sign In page
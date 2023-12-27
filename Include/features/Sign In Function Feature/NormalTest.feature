Feature: Sign in

  Scenario: Normal Test
    Given I am on the Sign In page
    When I enter the username "TestAccountKaryawan1" and password "P@sswordK1"
    And I click on the Login button
    Then I should be logged in successfully
Feature: Wrong username and password login
  Scenario: I want to use wrong username and password login
    Given I Open browser
    And Located on saucedemo website
    And Located on saucedemo website
    When I login with wrong username and password
    Then stay on the login page and get a login failure notification
Feature: Test create story in a pivotal project

  Background: Login pivotal
    Given Load the home page pivotal
    When I click on the SigIn button
    And It show the login form
    When I type in the username input field
    And I click the next button
    When I type a password valid in input field
    And I click the login button
    Then It is expected that the display name equals WALTER_MERCADO_JALA

    Given I have created a project
    And store as [Project]

  Scenario: Create a new Story

    Given I
    Then It is expected that the display name equals WALTER_MERCADO_JALA
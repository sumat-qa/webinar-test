Feature: Validate Webinars on a page
  Scenario: Validate the number of Webinars on the webinars page
    Given I load the homepage "https://www.foresee.com"
    When I hover over Insights Button
    Then I click on Webinars drop down
    And I validate the number of webinars

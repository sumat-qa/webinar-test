Feature: Validate Webinars on a page
  Scenario: Validate the number of Webinars on the webinars page
    Given I load the homepage "https://www.foresee.com"
    When I click on Insights Page
    Then I navigate to Webinars Page
    And I validate the webinars
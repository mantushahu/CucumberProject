Feature:Orange HRM Login
  Scenario: Logo should be presented on homepage
    Given I lunch chrome browser
    When I open orange homepage
    Then I verify that the logo is displayed on the page
    And Close the browser
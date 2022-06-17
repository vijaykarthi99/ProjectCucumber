Feature: 
  Check Login Functionality

  Scenario Outline: 
    To verify the Login

    Given User is on Facebook Page
    When user enters "<Username>" and "<Password>"
    And click login button
    Then Error page displayed


    Examples: 
      | Username   | Password    |
      | Vijay      | 1234@1234   |
      | Mani@134   | mani@6789   |
      | vijaymani@ | fbmani@1234 |

Feature: Validating login function of blazedemo application

  Scenario Outline: validating login with all conditions
    Given user is on blazedemo app on chrome browser
    When user enter "<departure>" and "<destination>"
    And user should click on find flight button
    Then user click on "<choose the flight>"
    Given user enter "<Name>" and "<Address>"
    Then user enter "<City>" and "<State>"
    And user enter "<Zip Code>" and "<Card Type>"
    When user enter "<Credit Card Number>" and "<Month>"
    Then user enter "<Year>" and "<Name on Card>"
    Given user click radio button
    Then user click "<Purchase Flight>"

    Examples: 
      | Choose your departure city | Choose your destination city | Choose This Flight | Name     | Address                              | City  | State       | Zip Code | Card Type    | Credit Card Number  | Month | Year | Name on Card |
      | Paris                      | Rome                         | United Airlines    | Ganesh A | No 27, 2nd Cross St, Dharmapuri, PDY | Pondy | Pondicherry |   605009 | Diner's Club | 5230 3452 5674 8796 |    04 | 2019 | Ganesh A     |

Feature:
  Search on https://www.sputnik.ru/

  Scenario: Negative test: use search
    Given user opens the site negative
    And user clicks input negative
    When user input and enter 'csdsdccdcdc' negative
    Then result page contains message about nothing was found
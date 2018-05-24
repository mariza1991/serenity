Feature:
  Search on https://www.sputnik.ru/

  Scenario: Positive test: search page contains 10 results
    Given user opens the site
    And user clicks input
    When user input and enter 'automated testing'
    Then user see the result page
    And result page contains 10 results

  Scenario: Negative test: use search
    Given user opens the site
    And user clicks input
    When user input and enter 'csdsdccdcdc'
    Then result page contains message about nothing was found
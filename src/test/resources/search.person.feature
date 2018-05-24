Feature:
  Working with search on http://pipl.com

  Scenario: Positive test: use search
    Given user opens the site
    And user clicks input
    When user search for 'Steve Jobs'
    And user clicks Search
    Then user see list of results
    And 'Steve Jobs' should be contained
Feature: Test en Sustainability section for Banistmo website

  @Test
  Scenario: As a user want download Sustainability generation PDF file
    Given i am Banistmo home page
    And click on about section
    And click Sustainability link
    When i search Sustainability generation link
    Then the results match with Sustainability generation file

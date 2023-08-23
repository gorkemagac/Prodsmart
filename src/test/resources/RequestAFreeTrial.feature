Feature: As a user I should be able to request a free trial

  Scenario:Verify that user can request a free trial
    When clicks Request A Free Trial button
    And enters email address and clicks continue button
    And enters First Name, Last Name, Company and clicks continue
    And enters country, zip code, work phone, ticks terms of use
    Then submit button is enabled
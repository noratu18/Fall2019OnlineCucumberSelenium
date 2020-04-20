@verifyUrl
  Feature: Navigation menu
    As user, I want to be able to see correct page url

  Scenario: Fleet --> Vehicles
    Given user is on the login page
    When user logs in as a sales manager
    And user navigates to "Fleet" and "Vehicles"
    Then user verifies url https://qa3.vytrack.com/entity/Extend_Entity_Carreservation

    Scenario: Marketing --> Campaigns
      Given user is on the login page
      When user logs in as a sales manager
      And user navigates to "Marketing" and "Campaigns"
      Then the url should be https://qa3.vytrack.com/campaign

      Scenario: Activities --> Calendar Events
        Given user is on the login page
        When user logs in as a sales manager
        And user navigates to "Activities" and "Calendar Events"
        Then the url should be https://qa3.vytrack.com/calendar/event
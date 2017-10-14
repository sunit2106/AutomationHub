Feature: BMS Testing

  Background: 
    Given Launch Chrome BRowser
    And Maximize the browser

  Scenario: Find Hindi Movies in Cinemastar
    Given Open Book My Show Website
    Then choose mumbai location
    Then enter user id and click next
    Then enter password
    And click login
    Given Now SHowing page is open
    Then Click on Searchbox
    Then Search for Cinemas
    Then Click on Mumbai South and Central
    And Click on Cinemastar
  
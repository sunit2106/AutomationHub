Feature: BMS Testing

  Background: 
    Given Launch Chrome BRowser
    And Maximize the browser

  Scenario: BMS Login
    Given Open Book My Show Website
    Then choose mumbai location
    Then enter user id and click next
    Then enter password
    And click login

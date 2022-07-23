@Smoke
Feature: Test Health Check Rest API
  Scenario: Health Check Api call is successful 

    Given user wants to call health check api
    When user call health check api with the url "http://www.google.com"
    Then user should get a response with status code "200"
    And user should get a response with status "OK"
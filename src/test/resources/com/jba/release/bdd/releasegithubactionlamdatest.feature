@LamdaTest
Feature: Test Swagger UI
  Scenario: Swagger UI successful 

    Given user wants to check google search
    When user goes to google search using "LamdaTest"
    Then user should see google search
    

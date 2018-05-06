Feature: Search for an existing customer with their User ID
  In order to manage existing customers
  As an Internal User
  I want to search for specific customers using their User IDs

  Scenario: Searching for customer with a User ID 'chained@cloned'
    Given the Internal User is on ElavonConnect
    And the Internal User signs in
    When the Internal User searches for a customer with a User ID 'chained@cloned'
    Then the Internal User should see a Customer User ID 'chained@cloned' 

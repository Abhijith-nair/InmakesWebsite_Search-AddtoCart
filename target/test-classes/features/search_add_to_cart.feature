Feature: Search and Add Course to Cart

  Scenario: User searches for a course and adds it to the cart
    Given User is on the homepage
    When User searches for "Software Testing"
    And User adds the course to the cart
    Then Course should be added to the cart successfully

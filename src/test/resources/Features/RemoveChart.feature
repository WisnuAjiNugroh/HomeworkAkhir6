Feature: Remove Chart Item in basket menu
  Scenario: I want to remove chart item
    Given I clicked the basket icon
    And Enter your chart page
    And Located on your chart page
    When I remove chart item
    Then the item will be deleted from the yourchart menu
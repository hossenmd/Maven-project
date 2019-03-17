

@Search-Cars
Feature: Acceptance testing to validate search cars

  @Search-Cars_Positive
  Scenario: Validate search cars page
    Given I am on the homepage "https://www.carsguide.com.au/" of Carsguid website
    When i move to the manu
      | Manu       |
      | buy + sale |
      | Search car |
    And click on "Search Cars" link
    And select carbrand as "Bmw" from anymake dropdown
    And select carmodel as "1 series" from selectModel dropdown
    And select location as "Australia" from Selactlocation dropdown
    And select price as "$1000" from price dropdown
    And click on find _my_next car button
    Then I should see list of search cars
    And the page title should be "bmw 1 series Cars under $1000 for sale | carsGuide|"

 
Feature: Test scenario for Amazon

  Scenario: Change the Delivery Code

    Given User open "Deliver Popup Module"

    When User change the Delivery Code to "36104" in "Deliver Popup Module"

    Then User see the info Deliver to "Montgomery"

  Scenario: Verify is Poland present in the list of delivery countries

    Given User open "Deliver To Popup Module"

    When User open the list of countries in "Deliver To Popup Module"

    Then User see "Poland" in the list of countries

  Scenario: Verify the country is changed in chosen element after changing in Deliver To Module

    Given User open "Deliver To Popup Module"

    When User choose "Canada" from the list of countries in "Deliver To Popup Module"
    And User open any "Selected Category Page"
    And User choose any item and open "Selected Element Page"

    Then User see "Canada" in "Selected Element Page" shipping details



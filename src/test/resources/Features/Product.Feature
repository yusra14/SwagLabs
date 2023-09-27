Feature: Add to Cart Functionality

  Background:
    Given I am on Products page

  Scenario: Successfully add product to Cart
    When I click add to cart
    Then Cart count increments to "1"

  Scenario: Successfully remove product from Cart
    When I click remove from Cart
    Then Cart count decrements to "1"
Feature: To verify End to End funcionality of Application

  Background: 
    Given User is on UBUY login page

  Scenario: To book particular product
    When User has enter "userName" and "password" and Click Login button
    And User has enter the product and Enter
    And User should click the product and increse quantity
    And User should click Add to cart button
    And User should click confirmation of product

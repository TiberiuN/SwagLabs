Feature: Test

  Scenario: The User checks a project then adds it to the chart
    Given The User is on landing page
    And The User clicks "//a[@id='item_1_title_link']" and "xpath"
    Then The logout is performed and the window is closed

  Scenario: The User2 checks a project then adds it to the chart
    Given The User is on landing page
    And The User clicks "//a[@id='item_1_title_link']" and "xpath"
#    Then The logout is performed and the window is closed

  Scenario Outline: The User clicks on Shopping Cart after login
    Given The User is on landing page
    And The User clicks "<selector>" and "<selectorType>"
    Then The action is performed and the User can see the "<message>" from "//span[contains(text(),'Your Cart')]" and "xpath"
#    Then The logout is performed and the window is closed
    Examples:
      | selector           | selectorType | message   |
      | shopping_cart_link | class        | Your Cart |
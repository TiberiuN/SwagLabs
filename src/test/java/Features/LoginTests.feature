Feature: Test

  Background: The chromeDriver is initialized
    Given The URL is set and the page is accessed
    Then The login is performed using "" and ""

  Scenario Outline: The User clicks on Shopping Cart after login
    Given The User clicks "<selector>" and "<selectorType>"
    Then The logout is performed and the window is closed
    Examples:
      | selector           | selectorType |
      | shopping_cart_link | class        |
      | item_4_title_link  | id           |
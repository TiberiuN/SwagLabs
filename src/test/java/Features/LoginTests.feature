Feature: Checking login and logout actions

  Scenario Outline: The User tries to login with bad credentials
    Given The User enters bad credentials "<username>" and "<password>"
    Then The login error banner is displayed
    Examples:
      | username       | password      |
      | standard_user1 | secret_sauce  |
      | standard_user  | secret_sauce1 |
      | standard_user1 | secret_sauce1 |

  Scenario Outline: The User performs a successfull login, clicks on a button and perform logout
    Given The User is on landing page
    And The User clicks "<selector>" and "<selectorType>"
    Then The action is performed and the User can see the "<message>" from "//span[contains(text(),'Your Cart')]" and "xpath"
    Then The logout is performed and the window is closed
    Examples:
      | selector           | selectorType | message   |
      | shopping_cart_link | class        | Your Cart |

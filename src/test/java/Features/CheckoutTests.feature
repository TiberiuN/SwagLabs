Feature: Checking the Checkout page

  Background: The User is logged in
    Given The User is on landing page

  Scenario Outline: The User Adds a product to basket and remove it
    Given The User clicks "//a[@id='item_1_title_link']" and "xpath"
    When The action is performed and the User can see the "<message>" in the Page
    And The User clicks on add to cart button
    Then The User clicks on Cart button
    And The User clicks on remove button
    And The User clicks on Continue Shopping button
    Then The logout is performed and the window is closed

    Examples:
      | message                 |
      | Sauce Labs Bolt T-Shirt |

  Scenario: The User adds a product to Basket and proceeds to the final
    Given The User clicks on TShirt add to cart button
    Then The User clicks on Cart button
    And The User clicks on Checkout button
    When The User fills in the required details
    And The User clicks on continue Button
    Then The User can see that "Sauce Labs Bolt T-Shirt"> is in the final checkout
    And The User clicks on Finish Button
    And The User can see the "Thank you for your order!" message
    And The User clicks on Back to Products button
    Then The logout is performed and the window is closed

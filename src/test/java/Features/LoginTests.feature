Feature: Test

#  Background: The chromeDriver is initialized
#  Given: The ChromeDriver is initialized

  Scenario Outline: Test Connection
    Given The URL is set and the page is accessed
    Then The login is performed using "<username>" and "<password>"
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
#    Then The User enters
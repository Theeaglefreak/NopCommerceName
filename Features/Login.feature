Feature: login to nop commerce site

  Scenario: Successfully login with correct credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When User clicks on log out link
    Then page title should be "Your store. Login"
    And close the browser


  Scenario Outline: Log in with data driven
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "<email>" and Password as "<password>"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When User clicks on log out link
    Then page title should be "Your store. Login"
    And close the browser

    Examples:
      | email               | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | admin123 |


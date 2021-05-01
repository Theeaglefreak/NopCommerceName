
  Feature: Customers
    Scenario: Add a Customer
      Given User launch chrome browser
      When User opens URL "https://admin-demo.nopcommerce.com/login"
      And User enters email as "admin@yourstore.com" and Password as "admin"
      And click on login
      Then User can view Dashboard
      When User clicks on Customers menu
      And Clicks on Customer Menu Item
      And click on Add new Button
      Then User can view Add new Customer Page
      When User enter customer info
      And click on save button
      Then User can view Confirmation message "The new customer has been added successfully"
      And close the browser

    Scenario: Search customer by using email id
      Given User launch chrome browser
      When User opens URL "https://admin-demo.nopcommerce.com/login"
      And User enters email as "admin@yourstore.com" and Password as "admin"
      And click on login
      Then User can view Dashboard
      When User clicks on Customers menu
      And Clicks on Customer Menu Item
      And User enters email
      When User click on search button
      Then User should found email in search button
      Then close the browser



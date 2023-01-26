Feature: This is a demoblaze feature file

  @demoblazeCarte
  Scenario: Verify user can purchase successfully
    Given User lunch demoblaze url
    When User clicks on phone and adds to the cart and back to the homepage
    When User clicks on laptops category and  adds a laptop to the cart then back to the homepage
    When User clicks on the monitor category and adds  a monitor to the cart then clicks on the cart link
    Then User clicks on place order button and fills up the necessary info and click on the purchase button
    Then User gets a thank you message and clicks on the ok button
    Then User closes the URL

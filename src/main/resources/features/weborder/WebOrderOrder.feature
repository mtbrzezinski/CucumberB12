Feature: WebOrder page Food Order Functionality

  #Navigate to the website and login successfully
  #Validate the ORDER DETAILS from order page
  #click Group Order box and Click Next button
  #Choose my location is My House
  #Validate the address contains 1844 Empire Blvd
  #Send the word for Note to Invitees part
  #send two gmail for Invitees list
  #click create Group Order
  #Validate View Group Order header
  #Validate total participants
Background:
  Given User navigates to the WebOrder
  And User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
  When User validates the 'ORDER DETAILS - Weborder' from homepage
  And User selects Group Order and clicks Next Button
  Then User sends 'TEST' note for Note To Invitees
  And User sends 'maria@gmail.com' and 'anna@gmail.com' to Invite List

  Scenario: Order Functionality of WebOrder Page
    And User validates the address 'My House' contains '10 Downing St'
    Then User clicks Create Group Order Button
    And User validates 'View Group Order' header
    Then User validates '1' Total Participants number


  Scenario: Order Functionality of WebOrder Page for Office
    And User validates the address 'Office' contains '2012 EMPIRE BLVD'
    Then User clicks Create Group Order Button
    And User validates 'View Group Order' header
    Then User validates '1' Total Participants number


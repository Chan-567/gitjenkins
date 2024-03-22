
    
Feature: HotelApp Login
   
   @tag2
   #Scenario: HotelApp Login
   #Given I want to Register the HotelApp as a new User
   #And After registering it should succesfully register message should be displayed
   #When I Enter The Username "vasuvespag" to the HotelApp Login page
   #And I Enter the password " vasu1234" to the HotelApp Login page
   #And I click the Login button
   #Then I should succesfully login to the hotelapp
   #And Check more features on the hotel page
   
   
   #sir userstory
   Scenario: Login Succesful
   Given I am on HotelApp login page
   When user enters username as "vasuvespag"
   And user enters password as "vasu1234"
   And user clicks Sign in button
   Then user gets login successful message
   When user enter location as "Sydney"
   And user enter Hotels as "Hotel Creek"
   And user enter Room type as "Deluxe"
   And user clicks on Search in button
   Then user gets next select hotel webpage

 
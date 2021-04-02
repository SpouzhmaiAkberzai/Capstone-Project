Feature: CanonReview
@review
Scenario: User add a review to Canon EOS 5D item inDesktops tab
Given User is on Retail website
When User click on Desktops tab 
And User click on Show all desktops 
And User click on Canon EOS 5D item 
And User click on write a review link 
And user fill the review information with below information
|yourName| yourReview| Rating|
|rashida|this is a nice product and recommend it.|good|
And User click on Continue Button 
Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”
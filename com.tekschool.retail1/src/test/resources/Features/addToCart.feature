Feature: addToCart

@addtocart
Scenario: User add HP LP 3065  from Desktops tab to the cart
Given User is on Retail website
When User click on Desktops tab 
And User click on Show all desktops 
And User click ADD TO CARToption on ‘HP LP3065’item 
And User select quantity 1 
And User click add to Cart button 
Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’
Feature: canonEos5D
@canoneos5D
Scenario: User add Canon EOS 5Dfrom Desktops tab to the cart
Given User is on Retail website
When User click on Desktops tab 
And User click on Show all desktops 
And User click ADD TO CARToption on ‘Canon EOS 5D’item 
And User select color from dropdown ‘Red’
And User select quantity 1 
And User click add to Cart button 
Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’
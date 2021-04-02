Feature: Laptop& NoteBooks

@laptop&Notbook
Scenario:

Given User is on Retail website
When User click on Laptop &NoteBooktab 
And User click on Show all Laptop &NoteBookoption 
And User click on MacBook  item 
And User click at add to Cart button 
Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
And User should see ‘1tem(s)-602.00’showed to the cart 
And User click on cart option 
And user click on red X button to remove the item from cart
Then item should be removed and cartshould show ‘0 item(s)’


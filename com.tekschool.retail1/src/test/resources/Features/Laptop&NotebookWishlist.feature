Feature: Laptop&NotebookWishlist

@wishlistTest
Scenario: Adding an item to Wish list
 
Given User is on Retail website
When User click on Laptop &NoteBooktab 
And User click on Show all Laptop &NoteBookoption 
And User click on heart icon to add ‘Sony VaIO’laptop to wish list 
Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’
Feature: Product Comparison 

@comparisonTest
Scenario: Product Comparison 

Given User is on Retail website
When User click on Laptop &NoteBooktab 
And User click on Show all Laptop &NoteBookoption 
And User click on product comparison icon on ‘MacBook’
And User click on product comparison icon on ‘MacBook Air
Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
And User click on Product comparison link 
Then User should see Product Comparison Chart
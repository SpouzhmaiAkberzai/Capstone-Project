Feature: MacbookProPriceValidation

@macBookPrice
Scenario: Validate the price of MacBook Pro is 2000
Given User is on Retail website
When User click on Laptop &NoteBooktab 
And User click on Show all Laptop &NoteBookoption 
And User click on ‘MacBook Pro’item 
Then User should see ‘$2,000.00’price tag is present on UI.

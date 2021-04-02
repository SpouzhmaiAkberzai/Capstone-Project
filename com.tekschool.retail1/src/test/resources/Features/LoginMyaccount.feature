Feature: Login page 

Background:

	Given User is on Retail website 
	When User click on MyAccount 
	And  User click on Login 
	And User enter username 'rash@gmail.com' and password '1234' 
	And User click on Login button 
	Then User should be logged in to MyAccount dashboard 
	
#@ChequePaymentMethod
#Scenario: Register as an Affiliate userwith Cheque Payment Method

#When User click on‘Register for an Affiliate Account’link 
#And User fill affiliate form with below information 
#|company|website|taxID|paymentMethod|Cheque Payee Name|
#|Star|www.star.com|12789|check|omar|
#And User check on About us check box 
#And User click on Continue button 
#Then User should see a success message 



#@BankTransferMethod
#Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer

#When User click on‘Edit your affiliate informationlink
#And user click on Bank Transfer radio button
#And User fill Bank information with below information 
#|bankName|abaNumber|swiftCode|accountName|accountNumber|
#|US Bank|456|1552510|Omar|123456|
#And User Click on Continue Button 
#Then User should see a Success Message 

@EditAccountTest
Scenario: Edit your account Information 

When User click on‘Edit your account information’ link
And User modify below information 
|firstname|lastName|email|telephone|
|Sinin|Ghyasi|sinin@gmail.com|22244555|
And User click on continue button 
Then User should seea message ‘Success: Your account has been successfully updated.’	


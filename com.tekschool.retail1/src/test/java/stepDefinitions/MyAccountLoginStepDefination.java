package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MyAccountLoginPageObj;
import utilities.WebDriverUtility;

public class MyAccountLoginStepDefination extends Base{

	MyAccountLoginPageObj accountObj=new MyAccountLoginPageObj();
	
	
	@When("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		accountObj.clickMyAccount();
		logger.info("User click on My Account");
		WebDriverUtility.screenShot();
	}
	
	//******************************
	
	@When("^User click on‘Register for an Affiliate Account’link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
	   accountObj.clickregisterAccount();
	   logger.info("User click on Register for and Affiliat Account links");
		WebDriverUtility.screenShot();
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable companyInfo) throws Throwable {
		List<Map<String, String>> dataValues = companyInfo.asMaps(String.class, String.class);
	    //retailPage.enterFirstName(dataValues.get(0).get("firstName"));
		accountObj.enterCompanyName(dataValues.get(0).get("company"));
		accountObj.enterWebsiteName(dataValues.get(0).get("website"));
		accountObj.enterTaxNumber(dataValues.get(0).get("taxID"));
		accountObj.clickpaymentMethod();
		accountObj.enterchequePayeeName(dataValues.get(0).get("Cheque Payee Name"));
		
		logger.info("User fill affiliate form with below information");
		WebDriverUtility.screenShot();    
	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
	   accountObj.clickaboutUs();
	   logger.info("User click on About us check box");
		WebDriverUtility.screenShot();
	}

	@And("^User click on Continue buttonx$")
	public void user_click_on_Continue_button() throws Throwable {
	   accountObj.clickContinueBtn();
	   logger.info("User click on continue button");
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		accountObj.successMsg();
		logger.info("User should see success message");
		WebDriverUtility.screenShot();
	}
//*****************************************************************************
	 
	@When("^User click on‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
	   
		accountObj.clickEditLink();
		logger.info("User click on Edit your affiliate information link");
		WebDriverUtility.screenShot();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
	    accountObj.clickPaymentmethod();
	    logger.info("User click on bank transfeer radio button");
		WebDriverUtility.screenShot();
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable BankInfo) throws Throwable {
		List<Map<String, String>> dataValues = BankInfo.asMaps(String.class, String.class);
		accountObj.enterBankName(dataValues.get(0).get("bankName"));
	    accountObj.enterAbaNumebr(dataValues.get(0).get("abaNumber"));
	    accountObj.enterSwiftCod(dataValues.get(0).get("swiftCode"));
	    accountObj.enterAccountName(dataValues.get(0).get("accountName"));
	    accountObj.enterAcountNumber(dataValues.get(0).get("accountNumber")); 
	    
	    logger.info("User fill bank information");
		WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}
	@When("^User Click on Continue Button$")
	public void user_Click_on_Continue_Button() throws Throwable {
	   accountObj.clickContinueButton();
	   logger.info("User click on continue button");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(3000);
	}

	@Then("^User should see a Success Message$")
	public void user_should_see_a_Success_Message() throws Throwable {
		accountObj.SuccessMessage();
		logger.info("User see the message");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(3000);
	}

	//********************************************************************************
	@When("^User click on‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
	    accountObj.clickEditAccountLink();
	    logger.info("User click on edit account information link");
		WebDriverUtility.screenShot();
		//WebDriverUtility.wait(3000);
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable EditInfo) throws Throwable {
		List<Map<String, String>> dataValues = EditInfo.asMaps(String.class, String.class);
		//accountObj.enterBankName(dataValues.get(0).get("bankName"));
		accountObj.enterFirstName(dataValues.get(0).get("firstname"));
		accountObj.enterLastName(dataValues.get(0).get("lastName"));
		accountObj.enterEmailAdd(dataValues.get(0).get("email"));
		accountObj.enterTelphoneNumber(dataValues.get(0).get("telephone"));
		
		logger.info("User modify below information");
		WebDriverUtility.screenShot();
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		accountObj.clickContinueBtnThree();
		logger.info("User click on continue button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should seea message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_seea_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
	    accountObj.showMessage();
	    logger.info("User should see success message");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(3000);
	}
	
	
}
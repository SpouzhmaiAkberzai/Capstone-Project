package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.DesktopsPageObj;
import utilities.WebDriverUtility;

public class DesktopsStepDefiniation extends Base {
	
	DesktopsPageObj desktopspageObj=new DesktopsPageObj();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab( ) {
		desktopspageObj.clickDesktopsBtn();
		logger.info("User click on Desktops");
		WebDriverUtility.screenShot();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() {
		desktopspageObj.clickShowAllDesktopsOption();
		logger.info("User click on Show all desktops");
		WebDriverUtility.screenShot();
	    
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page(){
		
		desktopspageObj.desktopItemIsDisplay();
		
		logger.info("User should see all items are present in Desktop page");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(3000);
	}
/*
	@Given("^User click ADD TO CARToption on ‘HP LP(\\d+)’item$")
	public void user_click_ADD_TO_CARToption_on_HP_LP_item(int arg1){
	    desktopspageObj.clickaddToCartOption();
	   
	}

	@Given("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
	    desktopspageObj.clickaddtQty();
	  
	}

	@Given("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
	    desktopspageObj.clickaddToCartBtn();
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1){
	    
	}*/
	
	
	@When("^User click ADD TO CARToption on ‘HP LP(\\d+)’item$")
	public void user_click_ADD_TO_CARToption_on_HP_LP_item(int arg1) throws Throwable {
	    desktopspageObj.clickaddToCartOption();
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1)  {
	    desktopspageObj.addQty();
		   WebDriverUtility.wait(3000);

	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
	   desktopspageObj.clickaddToCartBtn();
	   WebDriverUtility.wait(3000);
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {
	    Assert.assertTrue("You have added the items", desktopspageObj.addtoCartMsg());
		   WebDriverUtility.wait(3000);

	}
	
	//****************Canon5DAddToCart******************************************************
	
	@When("^User click ADD TO CARToption on ‘Canon EOS (\\d+)D’item$")
	public void user_click_ADD_TO_CARToption_on_Canon_EOS_D_item(int arg1) throws Throwable {
	  desktopspageObj.clickaddToCartOption();
	  WebDriverUtility.wait(3000);
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
	desktopspageObj.selectOption();
	WebDriverUtility.wait(3000);
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
		WebDriverUtility.wait(3000);
	}
	
	
	//**************************** Write Review *********************************************************
	
	
		@When("^User click on Canon EOS (\\d+)D item$")
		public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		   desktopspageObj.clickcanonImag(); 
		   logger.info("User click of Canon image");
		   WebDriverUtility.screenShot();
		}

		@When("^User click on write a review link$")
		public void user_click_on_write_a_review_link() throws Throwable {
		    desktopspageObj.clickreviewLink();
		    logger.info("User click link to write the review");
		    WebDriverUtility.screenShot();
		}

		@When("^user fill the review information with below information$")
		public void user_fill_the_review_information_with_below_information(DataTable addreview) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		    // E,K,V must be a scalar (String, Integer, Date, enum etc)
			List<Map<String, String>> dataValues = addreview.asMaps(String.class, String.class);
//retailPage.enterFirstName(dataValues.get(0).get("firstName"));
			desktopspageObj.enternameField(dataValues.get(0).get("yourName"));
			WebDriverUtility.wait(2000);
			desktopspageObj.writeReviewField(dataValues.get(0).get("yourReview"));
			WebDriverUtility.wait(2000);
			desktopspageObj.Rating();
			WebDriverUtility.wait(5000);
			WebDriverUtility.screenShot();
		}

		@When("^User click on Continue Button$")
		public void user_click_on_Continue_Button() throws Throwable {
		    desktopspageObj.clickcontinueBtn();
		    logger.info("User click on continue button");
		    WebDriverUtility.screenShot();
		    WebDriverUtility.wait(5000);
		}

		@Then("^User should see a message with ‘Thank you for your review\\. It has been submitted to the webmaster for approval\\.”$")
		public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws Throwable {
		    desktopspageObj.thankYouMsg();
		    logger.info("you have submitted your review");
		    WebDriverUtility.screenShot();
		    WebDriverUtility.wait(3000);
		}
	
	
	
	
}

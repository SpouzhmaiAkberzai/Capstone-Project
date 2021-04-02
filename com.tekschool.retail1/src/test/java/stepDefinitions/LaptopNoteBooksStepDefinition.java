package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Laptops_NoteBooksPageObj;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base {
	
	Laptops_NoteBooksPageObj laptops=new Laptops_NoteBooksPageObj();


	@When("^User click on Laptop &NoteBooktab$")
	public void user_click_on_Laptop_NoteBooktab() throws Throwable {
		laptops.clicklaptopNotbooktab();
		logger.info("user click on Laptops and notebook tabs");
	    WebDriverUtility.screenShot();

	}

	@When("^User click on Show all Laptop &NoteBookoption$")
	public void user_click_on_Show_all_Laptop_NoteBookoption() throws Throwable {
	 laptops.clickShowAllLaptopNotebookOpt();
	 logger.info("User click on show all Laptops and Notebooks");
	 WebDriverUtility.screenShot();
	}

	@When("^User click on MacBook  item$")
	public void user_click_on_MacBook_item() throws Throwable {
	    laptops.clickMacbookImg();
	    logger.info("user click on MacBook image");
	    WebDriverUtility.screenShot();
	}

	@When("^User click at add to Cart button$")
	public void user_click_at_add_to_Cart_button() throws Throwable {
	    laptops.clickaddtoCartNotbookBtn();
	    logger.info("user click on at add to cart button");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	    
	}
	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
	    laptops.Msg();
	    logger.info("you have added MacBook to your cart");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User should see ‘(\\d+)tem\\(s\\)-(\\d+)\\.(\\d+)’showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {
	   laptops.showTotalCartItem();
	   logger.info("total cart items");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
	    laptops.clickCartOption();
	    logger.info("user click on cart option");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
	    laptops.clickremoveFromCartBtn();
	    logger.info("user click remove button to remove the item from cart");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^item should be removed and cartshould show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cartshould_show_item_s(int arg1) throws Throwable {
	   laptops.ShowEmptyCart();
	   logger.info("cart should be empty");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}
	
//*********************************** Product Comparison **************************************	
	
	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
	    laptops.clickcomparIcon1();
	    logger.info("User click on Mackbook icon");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
	    laptops.clickcamparIcon2();
	    logger.info("User click on MackbookAir icon");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	    
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws Throwable {
	    laptops.comparisonMsg();
	    logger.info("User Should see message");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
	    laptops.clicktotalCompairLink();
	    logger.info("User click on product comparisan link");
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
	    laptops.compChartPage();
	    WebDriverUtility.wait(3000);
	    WebDriverUtility.screenShot();
	}
	//**********************************************************************
	
	@When("^User click on heart icon to add ‘Sony VaIO’laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
	    laptops.clicksonyVioWishlistIcon();
	    WebDriverUtility.wait(3000);
	    WebDriverUtility.screenShot();
	    
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws Throwable {
	    laptops.sonyVioWishlistMsg();
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}
	
	@When("^User click on ‘MacBook Pro’item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
	    laptops.clickMacbookproImg();
	    WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
	}

	@Then("^User should see ‘\\$(\\d+),(\\d+)\\.(\\d+)’price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {
	
		WebDriverUtility.screenShot();
	    WebDriverUtility.wait(3000);
}
}
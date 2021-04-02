package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObj extends Base {
	
	public DesktopsPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}
	
      @FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
      private WebElement desktopsBtn;
      
	  @FindBy(xpath="//a[(text()='Show All Desktops')]")
	  private WebElement showAllDesktopsOption;
	  
	  @FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]")
	  private WebElement desktopItems;
	
	  
	  
	//a[contains(text(),'Apple Cinema 30\"')]
	//*[@id="content"]/div[4]/div[7]/div/div[2]/div[1]/h4/a
	//body/div[@id='product-category']/div[1]/div[1]/div[4]
	 
	  //**************************************************************************
	  
	 @FindBy(xpath="//*[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	
	 private WebElement addToCartOption;
	 
	 @FindBy(xpath="//*[@id='input-quantity']")
	 private WebElement addQty;
	 
	 @FindBy(xpath="//*[@id=\"button-cart\"]")
	 private WebElement addToCartBtn;
	 
	 @FindBy(xpath="//*[@id=\"product-product\"]/div[1]")              
	 private WebElement successMsg;
	

	 //canon EOS 5D element
	 @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	 private WebElement CanonAddToCartOption;
	 
	@FindBy(xpath="//*[@id=\"input-option226\"]")
	 private WebElement selectOption;
	
	
	 @FindBy(xpath=" //*[@id=\"product-product\"]/div[1]")
	 private WebElement CanonsuccessMsg;
	 
	 
	 //Canon Review elements
	 
	 @FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	 private WebElement canonImag;
	 
	 @FindBy(xpath="//a[contains(text(),'Write a review')]")
	 private WebElement reviewLink;
	 
	 @FindBy(xpath="//input[@id='input-name']")
	 private WebElement nameField;
	 
	 @FindBy(xpath="//textarea[@id='input-review']")
	 private WebElement writeReviewField;
	 
	 @FindBy(xpath="//*[@id=\"form-review\"]/div[4]/div/input[3]")
	 private WebElement Rating;
	
	 
	 @FindBy(xpath="//button[@id='button-review']")
	 private WebElement continueBtn;
	 
	 @FindBy(xpath="//*[@id=\"form-review\"]/div[2]")
	 private WebElement thankYouMsg;
	 
	 
	 //*******************************Show Desktops item *************************************************
	 
	public void clickDesktopsBtn() {
		WebDriverUtility.clickOnElement(desktopsBtn);
	}
	
	public void clickShowAllDesktopsOption() {
		WebDriverUtility.clickOnElement(showAllDesktopsOption);
		
	}
	
	public boolean desktopItemIsDisplay() {
		return desktopItems.isDisplayed();
		 
	}
	
    //********************** HP ADD TO CART **************************************************

	
	public void addToCartOption() {
		WebDriverUtility.clickOnElement(addToCartOption);
	}
	
	public void addQty() {
		WebDriverUtility.clickOnElement(addQty);
	}
	

    //********************** CANON ADD TO CART **************************************************
	
	
	public void clickaddToCartOption() {
		WebDriverUtility.clickOnElement(CanonAddToCartOption);
	}
	
	
	public void selectOption() {
		WebDriverUtility.selectByIndex(selectOption, 1);
	}
	
	public void clickaddToCartBtn() {
		WebDriverUtility.clickOnElement(addToCartBtn);
	}
	
	public boolean addtoCartMsg() {

		boolean addtoCartMsg = successMsg.isDisplayed();
		return addtoCartMsg;
		
	}
    //********************** Write Review for CANON **************************************************

	
    public void clickcanonImag() {
	   WebDriverUtility.clickOnElement(canonImag);
}
	public void clickreviewLink() {
		WebDriverUtility.clickOnElement(reviewLink);
	} 
	
	public void enternameField(String name) {
		WebDriverUtility.enterValue(nameField, name);
	}
	public void writeReviewField(String review) {
		WebDriverUtility.enterValue(writeReviewField, review);
	}
	
	public void Rating() {
		WebDriverUtility.clickOnElement(Rating);
	}
	
	public void rating() {
		Rating.click();
	}
		
	@FindBy(css = "button#button-review")
	private WebElement continueButton;
	
	public void clickcontinueBtn() {
		WebDriverUtility.clickOnElement(continueBtn);
	}
	
	public boolean thankYouMsg() {
		boolean Msg=thankYouMsg.isDisplayed();
		return Msg;
	}
	
}

package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Laptops_NoteBooksPageObj extends Base {
	
	public  Laptops_NoteBooksPageObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	      private WebElement laptopNotbooktab;
	
	//@FindBy(xpath="//a[contains(text(),'Macs (0)')]")
	//private WebElement MacsOpt;
	
	//@FindBy(xpath="//a[contains(text(),'Windows (0)')]")
	//private WebElement windowsOpt;
	
	@FindBy(xpath="//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement ShowAllLaptopNotebookOpt;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
	private WebElement MacbookImg;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	private WebElement addtoCartNotebookBtn;
	
	@FindBy(xpath="//*[@id=\"product-product\"]/div[1]")
	private WebElement Msg;
	
	@FindBy(xpath="//*[@id=\"cart-total\"]")
	private WebElement TotalCartItem;
	
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	private WebElement CartOption;
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	private WebElement removeFromCartBtn;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement ShowEmptyCart;
	
	//Product Camparison 
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement comparIcon1;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement camparIcon2;
	
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
	private WebElement comparisonMsg;
	
	@FindBy(xpath="//*[@id=\"compare-total\"]")
	private WebElement totalCompairLink;
	
	@FindBy(xpath="//*[@id=\"product-compare\"]/ul/li[2]/a")
	private WebElement compChartPage;
	
	
	//This will scroll the web page till end.		
    //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	//*********************************************
	//js.executeScript("window.scrollBy(0,1000)");
	
	
	//Sony Vio wishlist
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement sonyVioWishlistIcon;
	
	
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
	private WebElement sonyVioWishlistMsg;
	
	////*Macbook Pro Price *******************************
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[1]/a/img")
	private WebElement MacbookProImage;
	
	@FindBy(xpath="//h2[contains(text(),'$2,000.00')]")
	private WebElement MacbookProPrice ;
	
    /////***********
	
	
	//*******************************************************************************

	 
	public void clicklaptopNotbooktab() {
		WebDriverUtility.clickOnElement(laptopNotbooktab);
	}
	
	public void clickShowAllLaptopNotebookOpt() {
		WebDriverUtility.clickOnElement(ShowAllLaptopNotebookOpt);
	}
	
	public void clickMacbookImg() {
		WebDriverUtility.clickOnElement(MacbookImg);
	}
	
	public void clickaddtoCartNotbookBtn() {
		WebDriverUtility.clickOnElement(addtoCartNotebookBtn);
	}
	public boolean Msg() {
		boolean addTocartMsg=Msg.isDisplayed();
				return addTocartMsg;
	}
	
	public String showTotalCartItem() {
		return WebDriverUtility.getText(TotalCartItem);
	}
	
	public void clickCartOption() {
		WebDriverUtility.clickOnElement(CartOption);
	}
	
	public void clickremoveFromCartBtn() {
		WebDriverUtility.clickOnElement(removeFromCartBtn);
	}
	
	public String ShowEmptyCart() {
		return WebDriverUtility.getText(ShowEmptyCart);
	}
	
	//*************************** Product Comparison **********************************
	
	public void clickcomparIcon1() {
		WebDriverUtility.clickOnElement(comparIcon1);
	} 
	
	public void clickcamparIcon2() {
		WebDriverUtility.clickOnElement(camparIcon2);
	}
	
	public boolean comparisonMsg() {
		boolean comparison= comparisonMsg.isDisplayed();
		return comparison;
	}
	//public void comparisonMsg() {
		//WebDriverUtility.acceptAlert();;
	//}
	
	public void clicktotalCompairLink() {
		WebDriverUtility.clickOnElement(totalCompairLink);
	}
	
	public void compChartPage() {
		//WebDriverUtility.scrollPageDownWithJS();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	//****************** SONY VIO WISHLIST *********************************
	
	public void clicksonyVioWishlistIcon() {
		WebDriverUtility.clickOnElement(sonyVioWishlistIcon);
	}
	
	public boolean sonyVioWishlistMsg() {
		boolean addToWishlishMsg= sonyVioWishlistMsg.isDisplayed();
		return addToWishlishMsg;
	}
	
	//***********************MacBookPro Price
	
	public void clickMacbookproImg() {
		WebDriverUtility.clickOnElement(MacbookProImage);
	}
	
	public boolean macbookProPrice() {
	    boolean macbookproPrice= MacbookProPrice.isDisplayed();
	    return macbookproPrice;
	}
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconSonyVaio;
	
	public void clickOnheartIconSonyVaio() {
		
	}
	
	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookProItem;
	
	public void clickOnmacBookProItem() {
		macBookProItem.click();
	
	
}
}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class MyAccountLoginPageObj extends Base {

	
public  MyAccountLoginPageObj() {
	
	PageFactory.initElements(driver, this);	
}

@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
private WebElement myAccountOption;

@FindBy(xpath="//*[@id=\\\"top-links\\\"]/ul/li[2]/ul/li[2]/a")
private WebElement loginOption;

@FindBy(xpath="//input[@id='input-email']")
private WebElement email;

@FindBy(xpath="//input[@id='input-password']")
private WebElement password;

@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
private WebElement loginBtn;

//*************************** Affiliate account ***********************

@FindBy(xpath="//a[contains(text(),'Register for an affiliate account')]")	
private WebElement registerAccount;

@FindBy(xpath="//input[@id='input-company']")	
private WebElement companyField;

@FindBy(xpath="//*[@id=\"input-website\"]")	
private WebElement websiteField;

@FindBy(xpath="//input[@id='input-tax']")	
private WebElement taxField;

@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]/label/input")
private WebElement paymentMethod;

@FindBy(xpath="//input[@id='input-cheque']")
private WebElement chequePayeeName;

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
private WebElement aboutUsCheckBox;

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
private WebElement ContinueBtn;

@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
private WebElement Msg;

//*************************** Bank Transfer *******************************

@FindBy(xpath="//a[contains(text(),'Edit your affiliate information')]")
private WebElement editInfoLink;

@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label/input")
private WebElement bankpaymentMethod;

@FindBy(xpath="//input[@id='input-bank-name']")
private WebElement bankNameField;

@FindBy(xpath="//input[@id='input-bank-branch-number']")
private WebElement ABANum;

@FindBy(xpath="//input[@id='input-bank-swift-code']")
private WebElement swiftCode;

@FindBy(xpath="//input[@id='input-bank-account-name']")
private WebElement accountName;

@FindBy(xpath="//input[@id='input-bank-account-number']")
private WebElement accountNumber;

@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
private WebElement ContinueBtnTwo;

@FindBy(xpath="//body/div[@id='account-account']/div[1]")
private WebElement SuccessMsgTwo;


//*************************Edit Account Information *******************************


@FindBy(xpath="//a[contains(text(),'Edit your account information')]")
private WebElement editAccountLink;

@FindBy(xpath="//input[@id='input-firstname']")
private WebElement EditFName;

@FindBy(xpath="//input[@id='input-lastname']")
private WebElement editLName;

@FindBy(xpath="//input[@id='input-email']")
private WebElement editEmail;

@FindBy(xpath="//input[@id='input-telephone']")
private WebElement editTelNum;

@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
private WebElement contiueBtnThree;

@FindBy(xpath="//*[@id=\"account-account\"]/div[1]")
private WebElement ShowMessage;


//*************************** Login My Account Method ***********************

public void clickMyAccount() {
	WebDriverUtility.clickOnElement(myAccountOption);
}
 public void clickLoginOption() {
	 WebDriverUtility.clickOnElement(loginBtn);
 }  
public void enterEmail(String emailAdd) {
	WebDriverUtility.enterValue(email, emailAdd);
}

public void clickLoginBtn() {
	WebDriverUtility.clickOnElement(loginBtn);
}
 
  //***************************** Edit affiliat account Method *********************************
    
    public void clickregisterAccount() {
    	WebDriverUtility.clickOnElement(registerAccount);
    	//registerAccount.click();
    }
    
    public void enterCompanyName(String CompanyName) {
    	WebDriverUtility.enterValue(companyField, CompanyName);
    	//companyField.sendKeys("company");
    }
    
    public void enterWebsiteName(String Website) {
    	WebDriverUtility.enterValue(websiteField, Website);
    	//websiteField.click();
    	//websiteField.sendKeys("Website Name");
    }
    
    public void enterTaxNumber(String taxNum) {
    	WebDriverUtility.enterValue(taxField, taxNum);
    }
    public void clickpaymentMethod() {
    	WebDriverUtility.clickOnElement(paymentMethod);
    }
    public void enterchequePayeeName(String PayeeName) {
    	WebDriverUtility.enterValue(chequePayeeName, PayeeName);
    }
    
    public void clickaboutUs() {
    	WebDriverUtility.clickOnElement(aboutUsCheckBox);
    }
    
    public void clickContinueBtn() {
    	WebDriverUtility.clickOnElement(ContinueBtn);
    }
    
    public boolean successMsg() {
    	boolean accountCreationMsg=Msg.isDisplayed();
    			return accountCreationMsg;
    }
   
   //*************************** Bank Transfer Method ***********************************
    
    
    public void clickEditLink() {
    	WebDriverUtility.clickOnElement(editInfoLink);
    }
    
    public void clickPaymentmethod() {
    	WebDriverUtility.clickOnElement(bankpaymentMethod);
    }
    
    
    public void enterBankName(String bankName) {
    	WebDriverUtility.enterValue(bankNameField, bankName);
    }
    
    public void enterAbaNumebr(String AbaNum) {
    	WebDriverUtility.enterValue(ABANum, AbaNum);
    }
    
    public void enterSwiftCod(String SwiftCode) {
    	WebDriverUtility.enterValue(swiftCode, SwiftCode);
    }
    public void enterAccountName(String AcName) {
    	WebDriverUtility.enterValue(accountName, AcName);
    }
    
    public void enterAcountNumber(String AcNumber) {
    	WebDriverUtility.enterValue(accountNumber, AcNumber);
    }
    
    public void clickContinueButton() {
    	WebDriverUtility.clickOnElement(ContinueBtnTwo);
    }
    public boolean SuccessMessage() {
    	boolean MsgTwo= SuccessMsgTwo.isDisplayed();
    	return MsgTwo;
    	
    //******************* Edit Account Information Method ***************************************	
    	
    }
    public void clickEditAccountLink() {
    	WebDriverUtility.clickOnElement(editAccountLink);
    }
    public void enterFirstName(String fName) {
    	WebDriverUtility.clearText(EditFName);
    	WebDriverUtility.enterValue(EditFName, fName);
    }
    
    public void enterLastName(String lName) {
    	WebDriverUtility.clearText(editLName);
    	WebDriverUtility.enterValue(editLName, lName);
    }
    
    public void enterEmailAdd(String email) {
    	WebDriverUtility.clearText(editEmail);
    	WebDriverUtility.enterValue(editEmail, email);
    }
    
    public void enterTelphoneNumber(String telNumber) {
    	WebDriverUtility.clearText(editTelNum);
    	WebDriverUtility.enterValue(editTelNum, telNumber);
    }
    
    public void clickContinueBtnThree() {
    	WebDriverUtility.clickOnElement(contiueBtnThree);
    }
    public boolean showMessage() {
    	boolean editAccountMsg= ShowMessage.isDisplayed();
    	return editAccountMsg;
    }
}



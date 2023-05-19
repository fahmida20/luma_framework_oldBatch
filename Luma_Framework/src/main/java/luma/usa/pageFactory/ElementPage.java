package luma.usa.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import luma.usa.basepage.SuperClass;
import luma.usa.genericCode.CommonUtility;
import luma.usa.genericCode.WaitHelper;

public class ElementPage extends SuperClass{
	public ElementPage(){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy (linkText = "Sign In")                              //(//xpath="(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jb2xsZWN0aW9ucy95b2dhLW5ldy5odG1s/'])[1]")  
	@CacheLookup
	private WebElement clickSignIn;

	public WebElement getclickSignIn() {
		return clickSignIn;
	}
	
	
	
	@FindBy (id="email")                             
	@CacheLookup
	private WebElement userName;

	public WebElement getuserName() {
		return userName;
		
	}
	@FindBy (id="pass")                             
	@CacheLookup
	private WebElement password;

	public WebElement getpassword() {
		return password;
		
	}
	
	@FindBy (xpath="(//*[text()='Sign In'])[1]")                             
	@CacheLookup
	private WebElement signInbtn;

	public WebElement getsignInbtn() {
		return signInbtn;
		
	}
	
	
	
	@FindBy (xpath="(//*[@class='logged-in'])[1]")                              
	@CacheLookup
	private WebElement varifyUserInfo;

	public WebElement getvarifyUserInfo() {
		return varifyUserInfo;
		
	}


    @FindBy (xpath="//*[text()='Men']")                              
	@CacheLookup
	private WebElement mouseHoverMen;

	public WebElement getmouseHoverMen() {
		return mouseHoverMen;
	}
	
	
		@FindBy (id="ui-id-17")
		
		@CacheLookup
		private WebElement mouseHoverTops;

		public WebElement getmouseHoverTops() {
			return mouseHoverTops;
		}
		
		@FindBy (xpath="(//*[text()='Jackets'])[2]")
		@CacheLookup
		private WebElement selectJackets;

		public WebElement getselectJackets() {
			return selectJackets;
			
		}
		
       @FindBy (xpath="(//a[@class= 'product-item-link'])[3]")
	   @CacheLookup
		private WebElement clickOnJupitarJackets;

		public WebElement getclickOnJupitarJackets() {
			return clickOnJupitarJackets;
			
		}
		
		
		
      @FindBy (xpath="//*[@data-ui-id='page-title-wrapper']")
 		@CacheLookup
	private WebElement varifyJupiterJacket;

		public WebElement getvarifyJupiterJacket() {
		return varifyJupiterJacket;
		}
		
		
		 @FindBy (xpath="(//*[@index='2'])[1]")
	 		@CacheLookup
		private WebElement selectSize;

			public WebElement getSelectSize() {
				return selectSize;
				}
	
	
	     @FindBy (xpath= "(//*[@index='0'])[2]")
		 @CacheLookup
			private WebElement selectColor;

				public WebElement getSelectColor() {
					return selectColor;
					}
		
		@FindBy (xpath="//*[@id='qty']")
		 @CacheLookup
		private WebElement selectQuantity;

		public WebElement getSelectQuantity() {
		return selectQuantity;
			}	
	
		@FindBy (xpath="//*[text()='Add to Cart']")
		 @CacheLookup
		private WebElement clickAddToCart;

		public WebElement getClickAddToCart() {
		return clickAddToCart;
			}	
		
		@FindBy (xpath="//*[text()='shopping cart']")
		 @CacheLookup
		private WebElement clickShoppingCart;

		public WebElement getClickShoppingCart() {
		return  clickShoppingCart;
			}	
	
		@FindBy (xpath="(//*[text()='Proceed to Checkout'])[2]")
		 @CacheLookup
		private WebElement proceedToCheckOut;

		public WebElement getProceedToCheckOut() {
		return   proceedToCheckOut;
			}	
		
		
		
		
		/// New Address detail elements

	@FindBy (xpath="//*[text()='New Address']")
	 @CacheLookup	
	 private WebElement clickOnNewAdress;
	public WebElement getclickOnNewAdress() {
		return    clickOnNewAdress;    
		}	
		                          

	
	    @FindBy (xpath="(//*[@type = 'text'])[2]")
		 @CacheLookup
		private WebElement enterFirstName;

		public WebElement getenterFirstName() {
		return    enterFirstName;
			}	
		
		
		@FindBy (xpath="(//*[@type = 'text'])[3]")
		 @CacheLookup
		private WebElement enterlastName;

		public WebElement getenterlastName() {
		return    enterlastName;
			}	
		
		@FindBy (xpath="(//*[@type = 'text'])[4]")
		 @CacheLookup
		private WebElement enterCompanyName;

		public WebElement getenterCompanyName() {
		return   enterCompanyName;
			}	
		
		@FindBy (xpath="(//*[@type = 'text'])[5]")
		 @CacheLookup
		private WebElement enterStreetAdress;

		public WebElement getenterStreetAdress() {
		return  enterStreetAdress;
			}	
		
		@FindBy (xpath="(//*[@type = 'text'])[8]")
		 @CacheLookup
		private WebElement selectCity;

		public WebElement getselectCity() {
		return   selectCity;
			}	
		
		@FindBy (xpath="(//*[@class='select'])[1]")
		 @CacheLookup
		private WebElement selectState;

		public WebElement getselectState() {
		return   selectState;
			}	
		
		@FindBy (xpath="(//*[@type='text'])[10]")
		 @CacheLookup
		private WebElement enterZip;

		public WebElement getenterZip() {
		return   enterZip;
			}	
		@FindBy (xpath="(//*[@class='select'])[2]")
		 @CacheLookup
		private WebElement selectCountry;

		public WebElement getselectCountry() {
		return   selectCountry;
			}	
		
		
		@FindBy (xpath="(//*[@type='text'])[11]")
		 @CacheLookup
		private WebElement enterPhoneNumber;

		public WebElement getenterPhoneNumber() {
		return   enterPhoneNumber;
			}	
		
		@FindBy (xpath="//*[text()='Ship here']")
		 @CacheLookup
		private WebElement clickOnShipHere;

		public WebElement getclickOnShipHere() {
		return    clickOnShipHere;
			}	
		

		@FindBy (xpath="(//*[@type='radio'])[1]")
		 @CacheLookup
		private WebElement enterShippingMethod;

		public WebElement getenterShippingMethod() {
		return enterShippingMethod;
			}	
		
		
		
		
		@FindBy (xpath="//*[text()='Next']")
		 @CacheLookup
		private WebElement ClickNext;

		public WebElement getClickNext() {
		return   ClickNext;
			}	
		
		@FindBy (xpath="//*[text()='Place Order']")
		 @CacheLookup
		private WebElement clickOnPlaceOrder;

		public WebElement getclickOnPlaceOrder() {
		return  clickOnPlaceOrder;
			}	
		
		@FindBy (xpath="//*[text()='Your order number is: ']")
		 @CacheLookup
		private WebElement orderNumber;

		public WebElement getorderNumber() {
		return  orderNumber;
			}	
		
		@FindBy (xpath="//*[text()='Thank you for your purchase!']")
		 @CacheLookup
		private WebElement varifyOrderConfirmationText;

		public WebElement getvarifyOrderConfirmationText() {
		return  varifyOrderConfirmationText;
			}
		

	public void getLogin() {
		log.info(">>>>>>>>>>>>>user able to login click on in sign in button <<<<<<<<<<<");
		getclickSignIn().click();
		log.info(">>>>>>>>>>>>>user able to enter the userName <<<<<<<<<<<");
		getuserName().sendKeys(prop.getProperty("userName"));
		log.info(">>>>>>>>>>>>>user able to enter the password <<<<<<<<<<<");
		getpassword().sendKeys(prop.getProperty("textPassword"));
		log.info(">>>>>>>>>>>>>user able to login the application <<<<<<<<<<<");
		getsignInbtn().click();
	}
	
	public void getNewAddressDetails() {
	
		log.info(">>>>>>>>>>>>>user able to enter FirstName <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getenterFirstName(), 20);
	 getenterFirstName().clear();
	 getenterFirstName().sendKeys(CommonUtility.getRandomStringValue());
		
	log.info(">>>>>>>>>>>>>user able to enter LastName <<<<<<<<<<<");
	WaitHelper.getSeleniumWait(getenterlastName(), 20);
	getenterlastName().clear();
	getenterlastName().sendKeys(CommonUtility.getRandomStringValue());
		
		log.info(">>>>>>>>>>>>>user able to enter company name as orange <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getenterCompanyName(), 20);
		getenterCompanyName().clear();
    	getenterCompanyName().sendKeys(CommonUtility.getRandomStringValue());
		
		log.info(">>>>>>>>>>>>>user able to enter street Address <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getenterStreetAdress(), 20);
		getenterStreetAdress().clear();
		getenterStreetAdress().sendKeys("43rd wall" +CommonUtility.getRandomStringValue());
		
		log.info(">>>>>>>>>>>>>user able to select city name <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getselectCity(), 20);
		getselectCity().clear();
		getselectCity().sendKeys("QUEENS"+CommonUtility.getRandomStringValue());
		
		//Select selectState = new Select(driver.findElement(By.xpath("(//*[@class='select'])[1]")));
		//selectState.selectByVisibleText("New York");
		//or selectState.selectByIndex(41);
		//selectState.selectByValue("43");
		

	    log.info(">>>>>>>>>>>>>user able to select State name as New York <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getselectState(), 20);
		CommonUtility.getSelectValues(getselectState(),"New York");
		
		
		log.info(">>>>>>>>>>>>>user able to enter ZipCode name <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getenterZip(), 20);
		getenterZip().clear();
		getenterZip().sendKeys("11219");
		

	    log.info(">>>>>>>>>>>>>user able to select Country name  <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getselectCountry(), 20);
    	CommonUtility.getSelectValues(getselectCountry(),"United States");
		
		
		
		log.info(">>>>>>>>>>>>>user able to enter shipper phone number <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(getenterPhoneNumber(), 20);
		getenterPhoneNumber().clear();
		getenterPhoneNumber().sendKeys(CommonUtility.getRandomNumericValue());
		
		
			}
}





	


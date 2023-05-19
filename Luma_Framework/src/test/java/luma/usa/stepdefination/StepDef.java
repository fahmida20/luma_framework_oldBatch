package luma.usa.stepdefination;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.usa.basepage.SuperClass;
import luma.usa.genericCode.CommonUtility;
import luma.usa.genericCode.WaitHelper;
import luma.usa.pageFactory.ElementPage;



public class StepDef extends SuperClass {
	
	ElementPage page;
	
	
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() throws InterruptedException {
	
		page= PageFactory.initElements(driver,ElementPage.class );
		log.info(">>>>>>>>>>>>>user already logged in the application <<<<<<<<<<<");
		page.getLogin();
		
//		log.info(">>>>>>>>>>>>>user varify the user information on screen <<<<<<<<<<<");
//		Thread.sleep(3000);
//		String expected = "Welcome, kazi akhter!";
//		String actual = page.getvarifyUserInfo().getText();
//		Assert.assertEquals(actual, expected);
//		
		
		}
	@When("User should be able to select {string} jacket from men module")
	public void user_should_be_able_to_select_jacket_from_men_module(String string) {
		
		log.info(">>>>>>>>>>>>>user able to mousehover the men module <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getmouseHoverMen(), 20);
		CommonUtility.getMouseHover(page.getmouseHoverMen());
	    
		
		log.info(">>>>>>>>>>>>>user able to mousehover the tops module <<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getmouseHoverTops(),20);
		CommonUtility.getMouseHover(page.getmouseHoverTops());
	    
	    
		log.info(">>>>>>>>>>>>>user able to click on jackets module<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getselectJackets(),20);
		CommonUtility.getActionClick(page.getselectJackets());
	    
		log.info(">>>>>>>>>>>>>user able to click on jupitarJacket module<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getclickOnJupitarJackets(),20);
		CommonUtility.getActionClick(page.getclickOnJupitarJackets());
		
	
	}
	
	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String string) throws InterruptedException {
		
		log.info(">>>>>>>>>>>>>user varify the jacket name on screen <<<<<<<<<<<");
		Thread.sleep(3000);
		String expected = "Jupiter All-Weather Trainer";
		String actual= page.getvarifyJupiterJacket().getText();
		Assert.assertEquals(actual,expected);	
	  
	    
	    
	}
	@When("User should be able to select the {string} and {string} and \"{int}\"then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String getSize, String getColor, Integer getQuantity) {
	
		log.info(">>>>>>>>>>>>>user able to select the jacket size<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getSelectSize(),20);
		CommonUtility.getJsClik(page.getSelectSize());
	    
		log.info(">>>>>>>>>>>>>user able to select the jacket color<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getSelectColor(),20);
		CommonUtility.getJsClik(page.getSelectColor());
		
		log.info(">>>>>>>>>>>>>user able to select the jacket quantity<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getSelectQuantity(),20);
		page.getSelectQuantity().clear();
		page.getSelectQuantity().sendKeys("1");
		
		log.info(">>>>>>>>>>>>>user able to click on add to cart<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getClickAddToCart(),20);
		CommonUtility.getActionClick(page.getClickAddToCart()); 
	    
		
	}
	@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {
	    
		log.info(">>>>>>>>>>>>>user able to click on shopping cart<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getClickShoppingCart(), 20);
		CommonUtility.getJsClik(page.getClickShoppingCart());  
	    
		
		log.info(">>>>>>>>>>>>>user able to click on proceed to check out<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getProceedToCheckOut(), 20);
		CommonUtility.getActionClick(page.getProceedToCheckOut());  
	    
	}
	
	     
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		
		log.info(">>>>>>>>>>>>>user able to click on shipping adress<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getclickOnNewAdress(), 20);
	    CommonUtility.getJsClik(page.getclickOnNewAdress());  
   
	    page.getNewAddressDetails();
		
	    log.info(">>>>>>>>>>>>>user able to click on shipping adress<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getclickOnShipHere(), 20);
	    CommonUtility.getJsClik(page.getclickOnShipHere());
	   
	    log.info(">>>>>>>>>>>>>user able to enter shipping method<<<<<<<<<<<");
		driver.navigate().refresh();
	    CommonUtility.waitThenClick(page.getenterShippingMethod(), driver);

		log.info(">>>>>>>>>>>>>user able to click next<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getClickNext(), 20);
	    CommonUtility.getJsClik(page.getClickNext());
	    
	    
	   }
	
	
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
		
		log.info(">>>>>>>>>>>>>user able to click on place order<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getclickOnPlaceOrder(), 20);
		CommonUtility.getJsClik(page.getclickOnPlaceOrder());
		
		
		
	log.info(">>>>>>>>>>>>>user able to varify order number<<<<<<<<<<<");
	WaitHelper.getSeleniumWait(page.getorderNumber(), 20);
	String actual= page.getorderNumber().getText();
	log.info("This is the new order number"+ actual);
	
}

	
	
	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String expected) {
	    
		
	    CommonUtility.getcaptureScreenshot(driver, "VarifyOrderNumber");
		log.info(">>>>>>>>>>>>>user able to varify order number confirmation<<<<<<<<<<<");
		WaitHelper.getSeleniumWait(page.getvarifyOrderConfirmationText(), 20);
	   String actual= page.getvarifyOrderConfirmationText().getText();
		log.info("This is the new order varification number"+ actual);
        Assert.assertEquals(actual,expected);
    
	    
	}


	

}

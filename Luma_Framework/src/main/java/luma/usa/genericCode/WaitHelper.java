package luma.usa.genericCode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.usa.basepage.SuperClass;

public class WaitHelper extends SuperClass {
	
	public static void getSeleniumWait(WebElement ele, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}

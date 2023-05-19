package luma.usa.genericCode;

import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import luma.usa.basepage.SuperClass;

public class CommonUtility extends SuperClass{
	
	public static void getMouseHover(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).build().perform();
		
		}
	
	public static void getActionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}

	public static void getJsClik(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",ele);
		
			}
	
	public static void getContinuouslyClickUntilElementFound(String xpath) {
		WebElement buttonClick = driver.findElement(By.xpath(xpath));
		for(int i = 0; i<=299; i++) {
		buttonClick.click(); 
		break;
		}
	}
	
//	public static void getAssertion(String actual,String expected) {
//	   Assert.assertEquals(actual, expected);  //create testNg library on project
//	log.info("*******Verified Text********" + expected);
//	   }
	
	public static void getSelectValues(WebElement ele, String Text) {
		Select select = new Select(ele);
		select.selectByVisibleText(Text);
	}

	
	
	
	
	public static Actions getAction() {
		Actions ac = new Actions(driver);
		return ac;
	}
		
	
	public static void waitThenClick(WebElement ele, WebDriver driver) {
		
		try {
				Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class);
				fluentWait.until(ExpectedConditions.elementToBeClickable(ele));
				if (ele.isDisplayed() && ele.isEnabled()) {
					getAction().moveToElement(ele);
					getAction().click(ele).build().perform();
				}
			} catch (TimeoutException toe) {
				log.log(Level.WARN, " Interrupted! ", toe);
				Thread.currentThread().interrupt();
			} catch (Exception e) {
				log.log(Level.WARN, "Interrupted!", e);
				Thread.currentThread().interrupt();
	}
	}
		
          public static String getRandomStringValue() {
        	 String name= RandomStringUtils.randomAlphabetic(5);
        	 System.out.println(name);
			return name;
        	  
          }
          
          public static String getRandomNumericValue() {
        	  String num= RandomStringUtils.randomNumeric(10); 
        	  System.out.println(num);
			return num;
        	  
          }

          public static void getcaptureScreenshot(WebDriver driver, String screenshotName) {
      		try {
      			TakesScreenshot ts = (TakesScreenshot) driver;
      			File source = ts.getScreenshotAs(OutputType.FILE);
      			FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
      			System.out.println("Screenshot taken");
      		} catch (Exception e) {
      			System.out.println("Exception while taking screenshot " + e.getMessage());
      		}
      	}

}
	
	


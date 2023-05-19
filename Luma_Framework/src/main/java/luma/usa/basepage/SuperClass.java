package luma.usa.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass {
	public static Logger log;
	public static WebDriver driver;
	public static Properties prop;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public SuperClass() {
			log = Logger.getLogger("Automation Engineer: Fahmida");
			PropertyConfigurator.configure("log4j.properties");       //copy log4j file name and paste
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/luma/usa/config/Config.properties");   //copy config properties properties
				prop.load(ip);
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally { // Must executed
				System.out.println("The finally statement is executed file is found");
			}
	}
		
	
	
	public static void getInitialization() { 
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with Chrome browser <<<<<<<<<<<");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		} else if (browserName.equalsIgnoreCase("safari")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with Safari browser <<<<<<<<<<<");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		
			
		} else if (browserName.equalsIgnoreCase("edge")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with edge browser <<<<<<<<<<<");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		
		} else if (browserName.equalsIgnoreCase("firefox")) {
			log.info(">>>>>>>>>>>>>Automation Statrs with firefox browser <<<<<<<<<<<");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	
				}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
	}

	
		
	}





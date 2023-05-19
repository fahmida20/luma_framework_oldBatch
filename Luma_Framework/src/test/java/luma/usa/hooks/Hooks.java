package luma.usa.hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import luma.usa.basepage.SuperClass;
import luma.usa.genericCode.CommonUtility;

public class Hooks extends SuperClass  {
	
	@Before
	public void getStartAutomation()  {
		
		log.info(">>>>>>>>>>START AUTOMATION<<<<<<<<<<<<<");
		SuperClass.getInitialization();
		}

	@After
	public void getEndAutomation(Scenario scenario) {
		log.info(">>>>>>>>>>>END AUTOMATION<<<<<<<<<<<<<<");
		if (scenario.isFailed()) {
			CommonUtility.getcaptureScreenshot(driver, "Failed Test");
		}
		driver.quit();
		
		
	}


}

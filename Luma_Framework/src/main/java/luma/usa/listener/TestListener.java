package luma.usa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import luma.usa.basepage.SuperClass;
import luma.usa.genericCode.CommonUtility;

public class TestListener extends SuperClass implements ITestListener {
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Starts" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success"+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		CommonUtility.getcaptureScreenshot(driver, "Failed Test");
		System.out.println("On Test Failure" + result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName());
		
	}

}

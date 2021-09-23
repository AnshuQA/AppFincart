package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.DataUtil;
import utilities.ScreenshotUtil;


public class CustomListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {

		ScreenshotUtil.captureScreenshot();
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href="+DataUtil.fileName+" target=\"_blank\">Capture Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a href="+DataUtil.fileName+" target=\"_blank\"><img src="+DataUtil.fileName+" height=200 width=200></a>");

	
	
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

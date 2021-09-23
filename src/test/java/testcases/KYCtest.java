package testcases;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BestSaver;
import pages.DashBoard;
import pages.DeleteAllGoals;
import pages.Goals;
import pages.KYCandKAF;
import pages.LoginRegister;
import pages.QuickSip;
import utilities.DataUtil;

public class KYCtest extends BaseTest {
public static KYCandKAF kyctest = new KYCandKAF();
public static LoginRegister login = new LoginRegister();


@Test(priority=1, dataProviderClass = DataUtil.class, dataProvider="dp",groups ="high")
public void websiteRegistarion(String email,String name,String mobile,String password) throws InterruptedException, AWTException {
	login.websiteRegistarion(email, name, mobile, password);
	
	Reporter.log("WebSite Registarion Done Successfully");
} 


@Test(priority=2, dataProviderClass = DataUtil.class, dataProvider="dp")
public void allreadyKyc(String pan) throws InterruptedException, AWTException {
	kyctest.allreadyKyc(pan);
	//login.logOut();
}
}

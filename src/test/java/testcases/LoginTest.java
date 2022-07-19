package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginRegister;

public class LoginTest extends BaseTest {
	public static LoginRegister userlogin = new LoginRegister();

	public void doRegister() throws InterruptedException {
		userlogin.websiteRegistarion(null, null, null, null);
		Reporter.log("New User Register Sucessfull !!!!");

	}

	@Test(priority = 1)
	public void doLogin() throws InterruptedException {
		userlogin.paymentGetway();
		Reporter.log("Login Sucessfull");

	}

}

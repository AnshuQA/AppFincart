package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CASuplaod;
import pages.LoginRegister;

public class CASuploadTest extends BaseTest {
	public static CASuplaod cas = new CASuplaod();
	public static LoginRegister login = new LoginRegister();

	@Test
	public void casUploadTest() throws InterruptedException, AWTException {
		// login.editProfileLogin();
		// cas.casBtn();
		// cas.uploadLatestCAS();

	}

}

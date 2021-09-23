package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.EditProfile;
import pages.LoginRegister;

public class EditProfileTest extends BaseTest {
	public static LoginRegister login = new LoginRegister();
	public static EditProfile profile = new EditProfile();


@Test(priority=1)
public void addressRequestTest() throws InterruptedException, AWTException {
	login.editProfileLogin();
	profile.profileButton();
	profile.editProfileButton(); 
	profile.editBasicDetails();
	profile.addressRequest();
	login.dashBoardLogOut();
	login.OperationLogin();
	profile.operationRequestBtn();
	profile.operationAddresBtn();
	login.operationLogout();
}
@Test(priority=2)
public void bankRequestTest() throws InterruptedException, AWTException {
	login.editProfileLogin();
	profile.profileButton();
	profile.editProfileButton();
   profile.bankRequestBtn();
	login.dashBoardLogOut();
	login.OperationLogin();
	profile.operationRequestBtn();
	profile.operationBankRequest();
	login.operationLogout();
}
}
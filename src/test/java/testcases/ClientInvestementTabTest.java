package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ClientInvesmetTab;
import pages.Goals;
import pages.LoginRegister;

public class ClientInvestementTabTest extends BaseTest {
	public static LoginRegister login = new LoginRegister();
	public static Goals goal = new Goals();
	public static ClientInvesmetTab invest = new ClientInvesmetTab();
	@Test(priority=1)
	public void investmentTab() throws InterruptedException {
		
		login.additionalPurchaseLogin();
		goal.goalButton();
		Reporter.log("Goal investment open Successfully");
		invest.goalinvestment();
		Reporter.log("Goal investment open Successfully");
		invest.totalinvestment();
		Reporter.log("Client All Investment open Successfully");
		invest.investmentAct();
		Reporter.log("Client All Investment Account open  Successfully");
		invest.passbook();
		Reporter.log("Passbook Open  Successfully");
		
		
		
	}
	

}

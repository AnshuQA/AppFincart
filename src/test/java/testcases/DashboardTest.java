package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashBoard;
import pages.LoginRegister;

public class DashboardTest extends BaseTest{
	public static DashBoard dashboard = new DashBoard();
	public static LoginRegister lp= new LoginRegister();
	
	@Test
	public void dashboardTest() throws InterruptedException {
		lp.additionalPurchaseLogin();
		dashboard.dashBoardButton();
		dashboard.investShortSummery();
		Reporter.log("Client Short summery open Successfully");
		dashboard.dashBoardButton();
		dashboard.allocationSummery();
		Reporter.log("Client Full Allocation open Successfully");
		dashboard.dashBoardButton();
		dashboard.dashboardQuickSIP();
		Reporter.log("Client Quick SIP Button clickable Successfully");
		dashboard.dashBoardButton();
		dashboard.myCurrentGoalBtn();
		Reporter.log("Client current goal investment open Successfully");
		dashboard.dashBoardButton();
		dashboard.systamicRemainderBtn();
		Reporter.log("Client Systamic Remainder open Successfully");
		dashboard.dashBoardButton();
		dashboard.startInvestmentBtn();
		Reporter.log("Client start to investment open Successfully");
		dashboard.dashBoardButton();
		
	}

}

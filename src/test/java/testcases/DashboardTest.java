package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashBoard;
import pages.LoginRegister;

public class DashboardTest extends BaseTest {
	public static DashBoard dashboard = new DashBoard();
	public static LoginRegister lp = new LoginRegister();

	@Test(priority = 1)
	public void allMemAndAllMFTest() throws InterruptedException {
		lp.additionalPurchaseLogin();

		dashboard.allMutualFundExtendsBtn();
		Reporter.log("All Member and All MFMutual FundsExtensButton Open Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemOneTime();
		Reporter.log("All Member and All MFMutual One time add to cart Successfully ");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemSell();
		Reporter.log("All Member and All MFMutual sell Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemSwitch();
		Reporter.log("All Member and All MFMutual Swith Successfully");

	}

	@Test(priority = 2)
	public void allMemAndActiveMFTest() throws InterruptedException { // lp.additionalPurchaseLogin();
		dashboard.mfActiveinvestmentsBtn();
		Reporter.log("All Member and Active MFMutual FundsExtensButton Open Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemOneTime();
		Reporter.log("All Member and Active MF Mutual One time add to cart Successfully ");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemSell();
		Reporter.log("All Member and Active MF Mutual sell Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemSwitch();
		Reporter.log("All Member and Active MF Mutual Swith Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allmemActiveSchemeMonthly();
		Reporter.log("All Member and Active MF Monthly Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemActiveSchemeSTP();
		Reporter.log("All Member and Active MF STP Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.allMemActiveSchemeSWP();
		Reporter.log("All Member and Active MF SWP Successfully");

	}

	@Test(priority = 3)
	public void mfInvestmentDetails() throws InterruptedException {
		dashboard.viewMFtotalinvestmentsummary();
		Reporter.log("View MF total Investment Summary Open successfull");
		dashboard.viewMFassetallocationsummary();
		Reporter.log("All Member and Active MF Monthly Successfully");
		dashboard.viewMFinvestmentdetails();
		Reporter.log("All Member and Active MF Monthly Successfully");

	}

	@Test(priority = 4)
	public void ulipTest() throws InterruptedException {
		dashboard.ulip();
		Reporter.log("Ulip Test  Successfully");

	}

	@Test(priority = 5)
	public void otherInsuranceTest() throws InterruptedException {
		dashboard.otherInsurance();
		Reporter.log("OtherInsurance Test  Successfully");

	}

	@Test(priority = 6)
	public void liquiloanTest() throws InterruptedException {
		dashboard.liquiLoan();
		Reporter.log("liquiloan Test  Successfully");

	}

	@Test(priority = 7)
	public void pmsTest() throws InterruptedException {
		dashboard.pms();
		Reporter.log("PMS Test  Successfully");

	}

	@Test(priority = 8)
	public void protectionTest() throws InterruptedException {
		dashboard.protection();
		Reporter.log("protectionTest Test  Successfully");

	}

	@Test(priority = 9)
	public void memberwiseMFTest() throws InterruptedException {
		dashboard.memberwiseBtn();

		dashboard.mfActiveinvestmentsBtn();
		Reporter.log(" MemberWise and Active MFMutual FundsExtensButton Open Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.memWiseOneTime();
		Reporter.log("MemberWise and Active MF Mutual One time add to cart Successfully ");
		dashboard.additionalPurchaseBtn();
		dashboard.memwiseSell();
		Reporter.log("MemberWise and Active MF Mutual sell Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.memwiseSwitch();
		Reporter.log("MemberWise and Active MF Mutual Swith Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.memWiseMonthly();
		Reporter.log("MemberWise and Active MF Monthly Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.memwiseSTP();
		Reporter.log("MemberWise and Active MF STP Successfully");
		dashboard.additionalPurchaseBtn();
		dashboard.memWiseSWP();
		Reporter.log("MemberWise and Active MF SWP Successfully");

	}

	@Test(priority = 10)
	public void memberUlipTest() throws InterruptedException {
		dashboard.ulip();
		Reporter.log("Member Ulip Test  Successfully");

	}

	@Test(priority = 11)
	public void memberOtherInsuranceTest() throws InterruptedException {
		dashboard.otherInsurance();
		Reporter.log(" Member OtherInsurance Test  Successfully");

	}

	/*
	 * @Test(priority = 12) public void liquiloanTest() throws InterruptedException
	 * { dashboard.liquiLoan();
	 * Reporter.log(" Member liquiloan Test  Successfully");
	 * 
	 * }
	 * 
	 * @Test(priority = 13) public void pmsTest() throws InterruptedException {
	 * dashboard.pms(); Reporter.log(" Member PMS Test  Successfully");
	 * }
	 */

	@Test(priority = 14)
	public void memberProtectionTest() throws InterruptedException {
		dashboard.protection();
		Reporter.log(" Member protectionTest Test  Successfully");

	}

	@Test(priority = 15)
	public void goalWiseInvestmentTest() throws InterruptedException {
		lp.goalwiseInvestLogin();
		dashboard.viewProgressInGoalsBtn();
		dashboard.goalwisemfActiveinvestmentsBtn();
		Reporter.log("goalwise MF Active Investments Btn Open Successfully");
		dashboard.goalwiseUlip();
		Reporter.log("Goal wise Ulip Test  Successfully");

		dashboard.goalwisePMS();
		Reporter.log("Goal wise PMS Test  Successfully");

	}

}

package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AdditionalPurchase;
import pages.DeleteAllGoals;
import pages.LoginRegister;

public class AdditonalPurchaseTest extends BaseTest {
	public static LoginRegister login = new LoginRegister();
	public static DeleteAllGoals gaols = new DeleteAllGoals();
	public static AdditionalPurchase additional = new AdditionalPurchase();
	public static LoginRegister userlogin = new LoginRegister();

	@Test(priority = 1)
	public void gaolButton() throws InterruptedException {
		userlogin.additionalPurchaseLogin();

		gaols.goalButton();

	}

	@Test(priority = 2)
	public void additinalPurchaseTest() throws InterruptedException {
		additional.investButton();
		additional.additinalPurchase();
		Reporter.log("Additional Purchase Test Successfull");

	}

	@Test(priority = 3)
	public void insuranceTest() throws InterruptedException {
		userlogin.insuranceLogin();
		additional.insuranceBtn();
		additional.insurancePage();
		Reporter.log("Insurance Test Successfull");
	}

	@Test(priority = 4)
	public void liquiLoanTest() throws InterruptedException {
		userlogin.liquiLoanLogin();
		additional.liquiLoanBtn();
		additional.liquiLoanPage();
		Reporter.log("LiquiLoan Test Successfull");
	}

	@Test(priority = 5)
	public void pmsTest() throws InterruptedException {
		userlogin.pmsLogin();
		additional.pmsBtn();
		additional.pmsPage();
		Reporter.log("PMS Test Successfull");
	}

}

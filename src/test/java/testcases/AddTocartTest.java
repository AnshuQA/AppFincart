package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BestSaver;
import pages.Goals;
import pages.LoginRegister;
import pages.QuickSip;
import pages.TaxPlanning;

public class AddTocartTest extends BaseTest{
	public static LoginRegister  ligin= new LoginRegister();
	public static Goals goal = new Goals();
	public static QuickSip sip= new QuickSip();
	public static BestSaver saver = new BestSaver();
	public static TaxPlanning tax = new TaxPlanning();
	@Test(priority=1)
	public void addGoalCart() throws InterruptedException {
		ligin.exitingUser();
		goal.goalButton();
		goal.investButton();
		goal.monthlyAddinCart();
		goal.makePaymentBtn();
		Reporter.log("Goal added in Cart Suceesfully");
	}
	
	
	@Test(priority=2)
	public void addQuickSIpCart() throws InterruptedException {
		//ligin.exitingUser();
		sip.quickSipButton();
		sip.investButton();
		sip.monthlyAddinCart();
		sip.makePaymentBtn();
		
		Reporter.log("Quick Sip added in Cart Suceesfully");
		
		
		
	}
	@Test(priority=3)
	public void addTaxPlanningCart() throws InterruptedException {
		
		tax.taxPlanningButton();
		tax.investTaxSaving();
		tax.makePaymentBtn();
		Reporter.log("Tax Saving added in Cart Suceesfully");
	}
	
	@Test(priority=4)
	public void addBestSaverCart() throws InterruptedException {
		ligin.logOut();
		ligin.additionalPurchaseLogin();
		saver.bestSaverButton();
		saver.addBestSaver();
		
		Reporter.log("Best Saver added in Cart Suceesfully");
		
	}
	

}

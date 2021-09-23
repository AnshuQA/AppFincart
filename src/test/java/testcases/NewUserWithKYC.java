package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BestSaver;
import pages.GoalAddCart;
import pages.Goals;
import pages.KYCandKAF;
import pages.LoginRegister;
import pages.QuickSip;
import pages.SIPaddCart;
import pages.TaxPlanning;


public class NewUserWithKYC extends BaseTest{
	public static LoginRegister login = new LoginRegister();
	public static Goals gaol = new Goals();
	public static GoalAddCart gaolcart = new GoalAddCart();
    public static QuickSip qsip = new QuickSip();
    public static SIPaddCart sipcart = new SIPaddCart();
    public static TaxPlanning taxpl = new TaxPlanning();
    public static BestSaver saver = new BestSaver();
    public static KYCandKAF kyctest = new KYCandKAF();
	@Test(priority=1)
	public void goalAddtocartTest() throws InterruptedException {
		login.newUserwithKYC();
		
		  gaol.setNewGoalButton(); 
		  
		  gaol.addReatirmentgoal(); Reporter.log("Goal add Successfully");
		  gaolcart.goalInvestBtn(); gaolcart.recomOneTime();
		  Reporter.log("Recommended Scheme one Time add Successfully");
		  gaolcart.addMoreSchemeBtn(); gaolcart.recoMonthly();
		  Reporter.log("Recommended Scheme Monthly add Successfully");
		  gaolcart.addMoreSchemeBtn(); gaolcart.searchSchemeButton();
		  gaolcart.selectScheme(); gaolcart.searchSchMonthly();
		  Reporter.log("Search Scheme Monthly add Successfully");
		  gaolcart.addMoreSchemeBtn(); gaolcart.searchShmOneTime();
		  Reporter.log("Search Scheme OneTime add Successfully"); gaol.goalButton();
		  gaol.removeOneGoal();
		 
	}
	@Test(priority=2)
	public void sipAddtocartTest() throws InterruptedException {
		qsip.quickSipButton();
		Reporter.log("Quci SIP add Successfully");
		qsip.sipPage();
		sipcart.sipInvestBtn();
		sipcart.reccSchemAddToCart();
		Reporter.log("Recommended Scheme Monthly add Successfully");
		sipcart.serachSchemeBtn();
		sipcart.searchSchemAddToCart();
		Reporter.log("Search Scheme Monthly add Successfully");
		qsip.quickSipButton();
		qsip.removeSip();
	}
	@Test(priority=3)
	public void taxPlanningaddtoCart() throws InterruptedException {
		//login.newUserwithKYC();
		taxpl.taxPlanningButton();
		taxpl.addTaxPlanning();
		Reporter.log("Tax Planning added Successfully");
		taxpl.investTaxSaving();
		Reporter.log("Tax Planning Add to cart Successfully");
		taxpl.taxPlanningButton();
		taxpl.removeTaxPlanning();
		Reporter.log("Tax Planning remove Successfully");
		login.newlogOut();
		
		
	
		
	}
	/*@Test(priority=4)
	public void bestSaverAddtoCart() throws InterruptedException {
		login.launchNewTab();
		login.additionalPurchaseLogin();
		saver.bestSaverButton();
		saver.addBestSaver();
		Reporter.log("Best saver add Successfully");
		login.logOut();
		System.out.println("end11111");
	
	}*/
		
	
}

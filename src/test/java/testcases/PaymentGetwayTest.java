package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginRegister;
import pages.PaymentGetway;

public class PaymentGetwayTest extends BaseTest{
	public static PaymentGetway payment = new PaymentGetway();
	public static LoginRegister login = new LoginRegister();
	@Test
	public void paymentGetwayTest() throws InterruptedException {
		payment.cartBtn();
		payment.paymentContinueBtn();
		payment.netBanking();
		Reporter.log("Net Banking Working Fine");
		payment.paymentContinueBtn();
		payment.otherCard();
		Reporter.log("Other Card working fine");
		/*payment.paymentContinueBtn();
		payment.masterDebitCard();
		Reporter.log("Master card working fine");
		payment.paymentContinueBtn();
		payment.visaDebitCart();
		Reporter.log("Visa Debit card working fine");*/
		payment.paymentContinueBtn();
		payment.upi();
		Reporter.log("UPI working fine");
		login.dashBoardLogOut();
		
	}

}

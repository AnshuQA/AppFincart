package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Mandate;

public class MandateTest extends BaseTest {

	public static Mandate mandate = new Mandate();
	@Test
	public void mandateTest() throws InterruptedException {
		mandate.mandateBtn();
		mandate.addMandateBtn();
		mandate.netbanking();
		Reporter.log("Netbanking Mandate working Successfully");
		mandate.debitCart();
		//mandate.addMandateBtn();
		Reporter.log("Debit cart Mandate working Successfully");
	}
}

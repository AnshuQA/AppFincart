package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.QuickSip;

public class AddSIPtest extends BaseTest {
	public static QuickSip sip = new QuickSip();
	
	@Test
	public void addSIP() throws InterruptedException {
		sip.sipButton();
		sip.sipPage();
		
	}

}

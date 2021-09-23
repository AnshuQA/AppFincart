package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FincartHomePage;
import utilities.DataUtil;

public class FincartHomePageTest  extends BaseTest{
  public static FincartHomePage fHome= new FincartHomePage();
  @Test(priority=1)
  public void homePageTest() throws InterruptedException {
	      fHome.fincartHome();
		 fHome.aboutUsPage();
		 fHome.homePageGoal();
		 fHome.award();
		 fHome.socialMedia();
		 
  }

  @Test(priority=2, dataProviderClass = DataUtil.class, dataProvider="dp")
 public void joinUs(String name,String email,String mobile,String password) throws InterruptedException {
	 
	 fHome.joinUs(name, email, mobile, password);
	 
 }
  @Test(priority=3,dataProviderClass = DataUtil.class, dataProvider="dp")	
  public void retirementplanning(String name,String email,String mobile,String password) throws InterruptedException {
	  fHome.retirementplanning(name, email, mobile, password);
  }
}
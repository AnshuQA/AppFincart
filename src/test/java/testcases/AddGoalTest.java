package testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Goals;
import pages.LoginRegister;

public class AddGoalTest extends BaseTest {
	public static Goals goal = new Goals();
	public static LoginRegister login = new LoginRegister();

	
	@Test(priority=1)
   public void testHomeGoal() throws InterruptedException {
		login.newuserLogin();
		goal.setNewGoalButton();
		goal.addHomeGoal();
		Reporter.log("Home Goal Added Successfully");
	}

}

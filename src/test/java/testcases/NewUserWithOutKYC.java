package testcases;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BestSaver;
import pages.DashBoard;
import pages.DeleteAllGoals;
import pages.EditGoal;
import pages.Goals;
import pages.KYCandKAF;
import pages.LoginRegister;
import pages.QuickSip;

public class NewUserWithOutKYC extends BaseTest {
	public static KYCandKAF kyctest = new KYCandKAF();
	public static LoginRegister login = new LoginRegister();
	public static Goals gaol = new Goals();
	public static DeleteAllGoals dgoal = new DeleteAllGoals();
	public static QuickSip sip = new QuickSip();
	public static BestSaver saver = new BestSaver();
	public static DashBoard dash = new DashBoard();
	public static EditGoal egoal = new EditGoal();
	public static DeleteAllGoals deletegoal = new DeleteAllGoals();
	public static DashBoard DashBoard = new DashBoard();
	
 /*  @Test(priority=1)
	public void kyctest() throws InterruptedException, AWTException {
		login.newuserLogin();
		//DashBoard.dashBoardButton();
		kyctest.dashboardKYC();
		kyctest.dashBoardbutton();
		kyctest.dashBoardKycButton();
		kyctest.resetKYC();
		Reporter.log("KYC Done Successfull");
		//login.logOut();
	}//
*/	
	@Test(priority=2)
	public void goaltest() throws InterruptedException, AWTException {
		login.newuserLogin();
		gaol.setNewGoalButton();
		gaol.addHomeGoal();
		Reporter.log("Goal add Successfully");
		egoal.goalButton();
		
		egoal.editHouseGoal();;
		Reporter.log("Goal updated Successfully");
		gaol.completeProfileButton();
		gaol.goalButton();
		deletegoal.removeOneGoal();
    	Reporter.log("Goal deleted Successfull");
       //login.logOut();
	}
	@Test(priority=3)
	public void quickSIPtest() throws InterruptedException, AWTException {
		//login.newuserLogin();
		sip.quickSipButton();
		sip.sipPage();
		Reporter.log("QucikSIP add Successfully");
		sip.editSIP();
		Reporter.log("QucikSIP Updated Successfully");
		sip.completeProfileButton();
		sip.quickSipButton();
		sip.removeSip();
		Reporter.log("QucikSIP Deleted Successfully");
		login.logOut();
		
	}
}



package testcases;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.EditGoal;

public class EditGoalTest extends BaseTest{
	public static EditGoal egoal = new EditGoal();
	@Test
	public void editGoalButton() throws InterruptedException {
		egoal.goalButton();
		Reporter.log(" Goal button click Successful");
		
	}
	@Test(priority=1)
  public void editHouseGoalTest() throws InterruptedException {
		
		egoal.editHouseGoal();
		Reporter.log("Home Goal updated Successfully");
  }
	@Test(priority=2)
	  public void editCarGoalTest() throws InterruptedException {
		egoal.editCarGoal();
		Reporter.log("Car Goal updated Successfully");
	  }
	@Test(priority=3)
	  public void editChildWeddingGoalTest() throws InterruptedException {
		egoal.editChildWedding();
		Reporter.log("Child Wedding Goal updated Successfully");
	  }
	@Test(priority=4)
	  public void editBikeGoalTest() throws InterruptedException {
		egoal.editBikeGoal();
		Reporter.log("Bike Goal updated Successfully");
	  }
	@Test(priority=5)
	  public void editYourWeddingGoalTest() throws InterruptedException {
		egoal.editYourWeddingGoal();
		Reporter.log("Your Wedding Goal updated Successfully");
	  }
	@Test(priority=6)
	  public void editFamilyPlanningGoalTest() throws InterruptedException {
		egoal.editFamilyPlanningGoal();
		Reporter.log("FamilyPlanning Goal updated Successfully");
	  }
	@Test(priority=7)
	  public void editSabbaticalGoalTest() throws InterruptedException {
		egoal.editSabbaticalGoal();
		Reporter.log("Home Goal updated Successfully");
	  }
	@Test(priority=8)
	  public void editRetairmentGoalTest() throws InterruptedException {
		egoal.editRetairment();
		Reporter.log("Retairment Goal updated Successfully");
	  }
	@Test(priority=9)
	  public void editBusinessGoalTest() throws InterruptedException {
		egoal.editBusinessGoal();
		Reporter.log("Business Goal updated Successfully");
	  }
	@Test(priority=10)
	  public void editWealthGoalTest() throws InterruptedException {
		egoal.editWealthGoal();
		Reporter.log("Wealth Goal updated Successfully");
	  }
	@Test(priority=11)
	  public void editYourStudyGoalTest() throws InterruptedException {
		egoal.editYourStudyGoal();
		Reporter.log("Your Study Goal updated Successfully");
	  }
	@Test(priority=12)
	  public void editTravellGoalTest() throws InterruptedException {
		egoal.editTravellGoal();
		Reporter.log("Travell Goal updated Successfully");
	  }
	@Test(priority=13)
	  public void editChildStudyGoalTest() throws InterruptedException {
		egoal.editChildStudyGoal();
		Reporter.log("Child Study Goal updated Successfully");
	  }
	@Test(priority=14)
	  public void editOtherGoalTest() throws InterruptedException {
		egoal.editOtherGoal();
		Reporter.log("Other Goal updated Successfully");
	  }
	
}

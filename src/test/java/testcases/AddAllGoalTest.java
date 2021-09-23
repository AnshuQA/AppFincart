package testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Goals;
import pages.LoginRegister;


public class AddAllGoalTest extends BaseTest {
	public static Goals goal = new Goals();
	public static LoginRegister login = new LoginRegister();

	
	@AfterMethod
	public void addCustomer() throws InterruptedException  {
		goal.setNewGoalButton();
		
		}
	@Test(priority=1)
   public void testHomeGoal() throws InterruptedException {
		login.newuserLogin();
		goal.setNewGoalButton();
		goal.addHomeGoal();
		Reporter.log("Home Goal Added Successfully");
	}
	@Test(priority=2)
   public void testChildEducationGoal() throws InterruptedException {
		goal.addChildEducationGoal();
		Reporter.log("Child Education Goal Added Successfully");
	}
	@Test(priority=3)
   public void testYourEducationGoal() throws InterruptedException {
		goal.addYourEducationGoal();
		Reporter.log("Your Education Goal Added Successfully");
	}
	@Test(priority=4)
	public void testCar() throws InterruptedException {
		goal.addCargoal();
		Reporter.log("Car Goal Added Successfully");
		
	}
  
	@Test(priority=5)
   public void testTravellPlan() throws InterruptedException {
		goal.addTravellPlanGaol();
		Reporter.log("Travell Goal Added Successfully");
	}
	@Test(priority=6)
   public void testChildWedding() throws InterruptedException {
		goal.addChildWeddingGoal();
		Reporter.log("Child Wedding Goal Added Successfully");
	}
	@Test(priority=7)
	 public void testBikeGoal() throws InterruptedException {
		goal.addBikeGoal();
		Reporter.log("Bike Goal Added Successfully");
	}
   
	@Test(priority=8)
   public void testYourWedding() throws InterruptedException {
		goal.addYourWeddingGoal();
		Reporter.log("Your Wedding Goal Added Successfully");
	}
	@Test(priority=9)
   public void testFamilyPlaning() throws InterruptedException {
		goal.addFamilyPlanningGaol();
		Reporter.log("Family Planning Goal Added Successfully");
	}
	@Test(priority=10)
   public void testSabbatical() throws InterruptedException {
		goal.addSabbatialGaol();
		Reporter.log("Sabbatical Goal Added Successfully");
	}
	@Test(priority=11)
   public void testRetairment() throws InterruptedException {
		goal.addReatirmentgoal();
		Reporter.log("Retairment Goal Added Successfully");
	}
	@Test(priority=12)
   public void testNewBusiness() throws InterruptedException {
		goal.addNewBusiness();
		Reporter.log("Business Goal Added Successfully");
	}
	@Test(priority=13)
   public void testOtherGoal() throws InterruptedException {
		goal.addOtherGaol();
		Reporter.log("Other Goal Added Successfully");
	}
	@Test(priority=14)
   public void testWealthCreation() throws InterruptedException {
		goal.addHealthCreation();
		Reporter.log("Wealth Goal Added Successfully");
	}
	/*@Test(priority=15)
	   public void testDeleteAllGoals() throws InterruptedException {
			goal.removeAllGoal();
			Reporter.log("Delete all Goal Successfully");
		}*/
	
}

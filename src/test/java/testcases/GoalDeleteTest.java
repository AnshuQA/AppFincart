package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DeleteAllGoals;

public class GoalDeleteTest extends BaseTest {
    public static DeleteAllGoals deletegoal = new DeleteAllGoals();
    @Test
    public void deleteAllGoals() throws InterruptedException {
    	deletegoal.goalButton();
    	deletegoal.removeAllGoal();
    	Reporter.log("All Goal Are deleted Successfull");
    }
    
}

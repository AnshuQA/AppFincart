package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import base.BaseTest;

public class DashBoard extends BaseTest {
   public void dashBoardButton() throws InterruptedException {
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
   }
   public void investShortSummery() throws InterruptedException {
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/a/img")).click();
   }
   public void allocationSummery() throws InterruptedException {
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div[2]/a/img")).click();
   }
   public void dashboardQuickSIP() throws InterruptedException {
	  Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[4]/div/div[3]/div[2]/a/img")).click();	    
   }
   public void myCurrentGoalBtn() throws InterruptedException {
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div[6]/slick/div/div/div/div/div[3]/div[2]/a/img")).click();
   }
   public void systamicRemainderBtn() throws InterruptedException {
	   Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"navbarDropdownMenuLink\"]/i")).click();
   }
   public void startInvestmentBtn() throws InterruptedException {
	  Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[5]/div[4]/slick/div/div/div[5]/div/div[3]/div[2]/a/img")).click();
   }
}

package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class CASuplaod extends BaseTest{
	public void casBtn() throws InterruptedException {
		 Thread.sleep(9000);
		    JavascriptExecutor je1 = (JavascriptExecutor) driver;
			WebElement element1 = driver.findElement(By.linkText("Upload CAS"));
			je1.executeScript("arguments[0].scrollIntoView(true);",element1);
			element1.click();
	}
    public void uploadLatestCAS() throws AWTException, InterruptedException {
    	Robot robot = new Robot();
    	Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[contains(text(),'Upload Latest CAS')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"casfilediv\"]/div")).click();
		 StringSelection sel1 = new StringSelection("E:\\SeleniumCodeFile\\CASupload.pdf");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1,null);
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);

		    robot.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(3000);
			driver.findElement(By.id("input_15")).sendKeys("123456");
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/button/span")).click();
    	
    }
}

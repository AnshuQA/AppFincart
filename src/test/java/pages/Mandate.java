package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class Mandate extends BaseTest{
	public void mandateBtn() throws InterruptedException {
		 Thread.sleep(9000);
		    JavascriptExecutor je1 = (JavascriptExecutor) driver;
			WebElement element1 = driver.findElement(By.xpath("//p[contains(text(),\"SIP Mandate's\")]"));
			je1.executeScript("arguments[0].scrollIntoView(true);",element1);
			element1.click();
	}
	public void addMandateBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ng-scope']")).click();

	}
	public void netbanking() throws InterruptedException {
		//proceed button
				Thread.sleep(8000);
				driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
				
				Thread.sleep(15000);
				driver.findElement(By.xpath("//div[@id='consent']")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id='inptButton']")).click();
				
				((JavascriptExecutor) driver).executeScript("window.open()");
			    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(1));
			    driver.get("https://app.fincart.com/dashboard/mandate");
			    Thread.sleep(4000);
			    driver.navigate(). refresh();	
	}
   public void debitCart() throws InterruptedException {
	   //Mandate
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("//span[@class='ng-scope']")).click();

  	 Thread.sleep(3000);
  	 
  	 List <WebElement> list3=driver.findElements(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/md-content/div/div/div[2]/div[6]/div[2]/md-input-container/md-select/md-select-value/span[1]/div"));
	    list3.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"select_option_94\"]/div")).click();
	  //proceed button
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='consent']")).click();
		((JavascriptExecutor) driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://app.fincart.com/dashboard/mandate");
	    Thread.sleep(4000);
	    driver.navigate(). refresh();
   }
}

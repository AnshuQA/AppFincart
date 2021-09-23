package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ClientInvesmetTab extends BaseTest{
	public void goalinvestment() throws InterruptedException {
		 Thread.sleep(5000);
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/h4[1]")).click();
	}
	public void totalinvestment() throws InterruptedException {
		Thread.sleep(9000);
	    JavascriptExecutor je2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.linkText("Investments"));
		je2.executeScript("arguments[0].scrollIntoView(true);",element2);
		element2.click();
	}
	public void investmentAct() throws InterruptedException {
		 Thread.sleep(9000);
		    JavascriptExecutor je3 = (JavascriptExecutor) driver;
			WebElement element3 = driver.findElement(By.linkText("Investment Account"));
			je3.executeScript("arguments[0].scrollIntoView(true);",element3);
			element3.click();
	}
	public void passbook() throws InterruptedException {
		 Thread.sleep(9000);
		    JavascriptExecutor je4 = (JavascriptExecutor) driver;
			WebElement element4 = driver.findElement(By.linkText("Passbook"));
			je4.executeScript("arguments[0].scrollIntoView(true);",element4);
			element4.click();
			 Thread.sleep(5000);
			WebElement family=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[2]/md-input-container/md-datepicker/div[1]/input"));
		    family.click();
		    family.clear();
		    family.sendKeys("2015-02-06");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[4]/button")).click();
		    Thread.sleep(10000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    Thread.sleep(10000);
		    driver.navigate().refresh();
	}
	//public void goalinvestment() {}

}

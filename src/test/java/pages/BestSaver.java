package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class BestSaver extends BaseTest {
	
	public void bestSaverButton() throws InterruptedException {
		 Thread.sleep(9000);
		    JavascriptExecutor je = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.linkText("Best Saver Account"));
			je.executeScript("arguments[0].scrollIntoView(true);",element);
			element.click();

	}
	public void addBestSaver() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/a[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-content[1]/div[1]/md-input-container[1]/input[1]")).sendKeys("2200");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Deposit Money')]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
	    }
	public void completeProfileButton() throws InterruptedException {
		 Thread.sleep(3000);
		    driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();;
	}
	public void removeBestSaverinCart() throws InterruptedException {
		 Thread.sleep(4000);
		    driver.findElement(By.xpath("//i[contains(text(),'delete')]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}
	

}

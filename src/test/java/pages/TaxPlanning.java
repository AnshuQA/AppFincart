package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class TaxPlanning extends BaseTest {
	public void taxPlanningButton() throws InterruptedException {
		Thread.sleep(9000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("Tax Saving"));
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

	public void addTaxPlanning() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[3]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20000");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[5]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20000");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[7]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20000");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[9]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void completeProfileButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[3]/a/h4"))
				.click();
	}

	public void removeTaxPlanning() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h4[contains(text(),'Remove')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
		Thread.sleep(8000);

	}

	public void investTaxSaving() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/h4[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/div/div/slick/div/div/div[3]/div/md-card/md-card-actions/button"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[8]/md-input-container/input"))
				.sendKeys("5850");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[2]/button[2]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
//Make Payment
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[3]/a")).click();
	}

	public void makePaymentBtn() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[3]/a")).click();
	}
}

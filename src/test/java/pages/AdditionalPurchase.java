package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;

public class AdditionalPurchase extends BaseTest {
	public void investButton() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/h4[1]"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//md-icon[@class='ng-scope material-icons']")).click();
	}

	public void additinalPurchase() throws InterruptedException {

		// One Time
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[contains(text(),'OneTime')]")).click();
		driver.findElement(By.xpath(
				"/html/body/div[4]/md-dialog/md-dialog-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/md-content/div/div[1]/md-input-container/input"))
				.sendKeys("1000");

//Sell  
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[4]/md-dialog/md-dialog-content/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_23\"]")).sendKeys("1");

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id=\"tab-content-12\"]/div/md-content/div/div[2]/md-input-container/md-checkbox/div[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@id=\"tab-content-12\"]/div/md-content/div/div[2]/md-input-container/md-checkbox/div[1]"))
				.click();
//Swith
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tab-item-13\"]/span")).click();
		Thread.sleep(3000);
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@id=\"select_value_label_24\"]/span[1]/div"));
		list1.get(0).click();
		driver.findElement(By.cssSelector("#select_option_211")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_30\"]")).sendKeys("1");

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//*[@id=\"tab-content-13\"]/div/md-content/div[2]/div[2]/md-input-container/md-checkbox/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"tab-content-13\"]/div/md-content/div[2]/div[2]/md-input-container/md-checkbox/div[1]"))
				.click();

//Monthly

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tab-item-14\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_34\"]")).sendKeys("101");
		Thread.sleep(3000);
		List<WebElement> list01 = driver.findElements(By.xpath("//*[@id=\"select_value_label_31\"]"));
		list01.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"select_option_100\"]")).click();
		Thread.sleep(3000);
		List<WebElement> list02 = driver.findElements(By.xpath("//*[@id=\"select_value_label_32\"]"));
		list02.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[3]")).click();
		Thread.sleep(5000);

//STP	 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dialogContent_18\"]/md-tabs/md-tabs-wrapper/md-next-button/md-icon"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tab-item-15\"]/span")).click();

		driver.findElement(By.xpath("//*[@id=\"select_value_label_41\"]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[8]/md-select-menu/md-content/md-option[2]/div")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"select_value_label_42\"]")).click();
		Thread.sleep(3000);
		List<WebElement> list4 = driver
				.findElements(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[4]"));
		list4.get(0).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"select_value_label_44\"]")).click();
		Thread.sleep(3000);
		List<WebElement> list6 = driver.findElements(By.xpath("//*[@id=\"select_option_164\"]"));
		list6.get(0).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_53\"]")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"tab-content-15\"]/div/md-content/div[3]/div[2]/md-input-container/md-checkbox/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"tab-content-15\"]/div/md-content/div[3]/div[2]/md-input-container/md-checkbox/div[1]"))
				.click();

//SWP
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"tab-item-16\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"select_value_label_54\"]")).click();

		Thread.sleep(3000);
		List<WebElement> list7 = driver
				.findElements(By.xpath("/html/body/div[11]/md-select-menu/md-content/md-option[3]/div[1]"));
		Thread.sleep(3000);
		list7.get(0).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"select_value_label_55\"]/span[1]/div")).click();
		Thread.sleep(3000);
		List<WebElement> list07 = driver.findElements(By.cssSelector("#select_option_189"));
		Thread.sleep(3000);
		list07.get(0).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_60\"]")).sendKeys("200");

//Cancel Button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
	}

	public void insuranceBtn() throws InterruptedException {

		Thread.sleep(9000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.linkText("Insurance"));
		je2.executeScript("arguments[0].scrollIntoView(true);", element2);
		element2.click();
	}

	public void insurancePage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-header/md-card-header-media/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-content/div/div/div[1]/div[5]/md-input-container/button/span"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-content/div/div/div[3]/div[8]/div[1]/button"))
				.click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-content/div/div/div[3]/div[8]/div[2]/button/span"))
				.click();
		Thread.sleep(3000);
		// Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
	}

	public void liquiLoanBtn() throws InterruptedException {

		Thread.sleep(9000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.linkText("Liquiloan"));
		je2.executeScript("arguments[0].scrollIntoView(true);", element2);
		element2.click();
	}

	public void liquiLoanPage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-header/md-card-header-media/div/button/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-content/div/div[2]/div[1]/md-input-container/button"))
				.click();
		Thread.sleep(12000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-content/div/div[2]/div[2]/md-input-container/button"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/md-card/md-card-content/div/div[2]/div[3]/md-input-container/button/span"))
				.click();

	}

	public void pmsBtn() throws InterruptedException {

		Thread.sleep(9000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.linkText("PMS"));
		je2.executeScript("arguments[0].scrollIntoView(true);", element2);
		element2.click();
	}

	public void pmsPage() throws InterruptedException {
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[contains(text(),'Check Performance')]")).click();
		Thread.sleep(10000);

	}

}

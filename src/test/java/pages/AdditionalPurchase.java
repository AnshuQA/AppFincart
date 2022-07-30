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
		Thread.sleep(80000);
		driver.findElement(By.xpath("//md-icon[@class='ng-scope material-icons']")).click();
	}

	public void additinalPurchase() throws InterruptedException {

		// One Time
		Thread.sleep(5000);
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
		driver.findElement(By.xpath("//input[@id='input_44']")).sendKeys("1");

		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//md-content[@ng-show=\"isRedAllow=='Y'\"]//div[@class='md-container md-ink-ripple']"))
				.click();

//Swith
		Thread.sleep(5000);
		driver.findElement(By.xpath("//md-tab-item[@id='tab-item-34']")).click();
		Thread.sleep(5000);
		List<WebElement> list1 = driver.findElements(By.xpath(
				"//md-select-value[@id='select_value_label_45']//div[@class='md-text ng-binding'][normalize-space()='Debt']"));
		list1.get(0).click();
		driver.findElement(By.cssSelector("md-option[id='select_option_233'] div[class='md-text ng-binding']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input_51']")).sendKeys("1");

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//md-content[@ng-show=\"isSwitchAllow=='Y'\"]//div[@class='md-container md-ink-ripple']"))
				.click();

//Monthly

		Thread.sleep(5000);
		driver.findElement(By.xpath("//md-tab-item[@id='tab-item-35']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input_55']")).sendKeys("101");
		Thread.sleep(3000);
		List<WebElement> list01 = driver.findElements(By.xpath(
				"//md-select-value[@id='select_value_label_52']//div[@class='md-text ng-binding'][normalize-space()='1 Year']"));
		list01.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='20 Years']")).click();
		Thread.sleep(3000);
		List<WebElement> list02 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list02.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"))
				.click();
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
		Thread.sleep(40000);
		driver.findElement(By.xpath("//span[contains(text(),'Check Performance')]")).click();
		Thread.sleep(10000);

	}

}

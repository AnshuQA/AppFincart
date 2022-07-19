package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;

public class DashBoard extends BaseTest {
	public void dashBoardButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
	}

	public void allMutualFundExtendsBtn() throws InterruptedException {
		// Mutual Fund
		// All investments
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();

	}

	public void additionalPurchaseBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click();
	}

	public void allMemOneTime() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'OneTime')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]")).click();
	}

	public void allMemSell() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sell')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]")).click();
	}

	public void allMemSwitch() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Switch')]")).click();
		Thread.sleep(3000);
		List<WebElement> list1 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list1.get(0).click();
		driver.findElement(By.xpath("/html/body/div[5]/md-select-menu/md-content/md-option[3]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("1");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"))
				.click();
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions[2]/button[1]/span")).click();
	}

	public void mfActiveinvestmentsBtn() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/md-radio-group[1]/md-radio-button[1]/div[1]/div[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();

	}

	public void allmemActiveSchemeMonthly() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("101");
		Thread.sleep(3000);
		List<WebElement> list01 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"));
		list01.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[19]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list02 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list02.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[2]/div[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]/span[1]"))
				.click();
	}

	public void allMemActiveSchemeSTP() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'STP')]")).click();

		Thread.sleep(3000);
		List<WebElement> list4 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list4.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[2]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list5 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list5.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list6 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list6.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[1]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[3]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[3]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();

	}

	public void allMemActiveSchemeSWP() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'SWP')]")).click();

		Thread.sleep(3000);
		List<WebElement> list7 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		Thread.sleep(3000);
		list7.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list07 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		Thread.sleep(3000);
		list07.get(0).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]"))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();

	}

	public void memWiseOneTime() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'OneTime')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[5]/md-dialog/md-dialog-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/md-content[2]/div/div[1]/md-input-container/input"))
				.sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
	}

	public void memwiseSell() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sell')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[5]/md-dialog/md-dialog-content/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/md-content[2]/div/div[1]/md-input-container/input"))
				.sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
	}

	public void memwiseSwitch() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Switch')]")).click();
		Thread.sleep(3000);
		List<WebElement> list1 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"));
		list1.get(0).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("1");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
	}

	public void memWiseMonthly() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Monthly')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("101");
		Thread.sleep(3000);
		List<WebElement> list01 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]"));
		list01.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'10 Years')]")).click();
		Thread.sleep(3000);
		List<WebElement> list02 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list02.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
	}

	public void memwiseSTP() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'STP')]")).click();

		Thread.sleep(3000);
		List<WebElement> list4 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"));
		list4.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[2]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list5 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list5.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list6 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[2]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list6.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[8]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[3]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[3]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();

	}

	public void memWiseSWP() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'SWP')]")).click();

		Thread.sleep(3000);
		List<WebElement> list7 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		Thread.sleep(3000);
		list7.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"))
				.click();
		Thread.sleep(3000);
		List<WebElement> list07 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		Thread.sleep(3000);
		list07.get(0).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[4]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"))
				.sendKeys("200");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();

	}

	public void viewMFtotalinvestmentsummary() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		driver.findElement(By.linkText("View MF total investment summary")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void viewMFassetallocationsummary() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		driver.findElement(By.linkText("View MF asset allocation summary")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void viewMFinvestmentdetails() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		driver.findElement(By.linkText("View MF investment details")).click();
		Thread.sleep(12000);
		driver.navigate().back();
	}

	public void ulip() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click(); // Transaction details
		driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		// Fund details
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Fund Details')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		// Fund details
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();

		// More details
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'More Details')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

	public void otherInsurance() throws InterruptedException {

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();

	}

	public void liquiLoan() throws InterruptedException {

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[4]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/md-content/table/tbody[1]/tr[4]/td/table/tbody/tr[1]/td[10]/a/i"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/md-content/table/tbody[1]/tr[4]/td/table/tbody/tr[1]/td[10]/a/i"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).click();
		if (driver.findElement(By.xpath("//button[contains(text(),'OK')]")).isDisplayed()) {
			driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		}
		driver.findElement(By.xpath("//body/div[4]/md-dialog[1]/md-dialog-actions[1]/button[1]/span[1]")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/md-content/table/tbody[1]/tr[4]/td/table/tbody/tr[1]/td[10]/a/i"))
				.click();
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

	public void pms() throws InterruptedException {

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[5]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click();
		driver.findElement(By.xpath("//body/div[5]/md-dialog[1]/md-dialog-actions[1]/button[1]")).click();

	}

	public void protection() throws InterruptedException {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[6]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"))
				.click();
		driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public void memberwiseBtn() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"))
				.click();
		Actions actions1 = new Actions(driver);
		Thread.sleep(3000);
		actions1.sendKeys(Keys.ARROW_DOWN);
		actions1.sendKeys(Keys.ENTER);
		actions1.build().perform();
	}

	public void viewProgressInGoalsBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-radio-group[1]/md-radio-button[2]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/span[1]"))
				.click();
	}

	public void goalwisemfActiveinvestmentsBtn() throws InterruptedException {

		Thread.sleep(7000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/md-content/table/tbody[1]/tr[2]/td/table/tbody/tr[1]/td[8]/a[1]/i"))
				.click();

	}

	public void goalwiseUlip() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/span"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id=\"tab-content-24\"]/div/md-content/table/tbody[1]/tr[1]/td[9]/a[1]/i"))
				.click();

	}

	public void goalwisePMS() throws InterruptedException {

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[5]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/md-tabs/md-tabs-content-wrapper/md-tab-content[5]/div/md-content/table/tbody/tr[1]/td[9]/a[1]/i"))
				.click();

	}
}
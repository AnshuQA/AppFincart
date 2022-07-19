package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class KYCandKAF extends BaseTest {
	@Test(priority = 1, dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void allreadyKyc(String pan) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Robot robot = new Robot();
		// New KYC
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[contains(@class,'col-md-4')]//div[5]//div[2]//a[1]//img[1]")).click();
		Thread.sleep(3000);
		if (driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a"))
				.isDisplayed()) {
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a"))
					.click();

			driver.findElement(By.xpath("//*[@id=\"dialogContent_186\"]/md-dialog-actions/button[2]")).click();

			driver.navigate().back();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(@class,'col-md-4')]//div[5]//div[2]//a[1]//img[1]")).click();

		}

		// Basic Details

		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[3]/div[2]/a")).click();

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/td/md-input-container/input"))
				.sendKeys(pan);
		driver.findElement(By.xpath("//a[contains(text(),'Check your KYC status')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();

		WebElement mobilenumber = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div/div[2]/table/tbody/tr[2]/td[2]/md-input-container/input"));
		mobilenumber.clear();
		mobilenumber.sendKeys("8368264851");
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div/div[3]/div[2]/a[2]")).click();

		// upload Pan

		driver.findElement(By.id("panfilediv")).click();
		robot.setAutoDelay(3000);
		StringSelection sel = new StringSelection("E:\\SeleniumCodeFile\\testPan.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[4]/div/div/div[3]/div[2]/a"))
				.click();

		WebElement panName = driver.findElement(By.xpath(
				"/html/body/div[4]/md-dialog/md-dialog-content/md-content/div[1]/div[2]/md-input-container/input"));
		panName.clear();
		panName.sendKeys("Test Auto Pan Name");

		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();

		// Upload Aadhar

		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/img[1]")).click();
		robot.setAutoDelay(3000);
		StringSelection sel02 = new StringSelection("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel02, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/img[1]")).click();
		robot.setAutoDelay(3000);
		StringSelection sel01 = new StringSelection("E:\\SeleniumCodeFile\\adharBack.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel01, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[5]/div/div/div[3]/div[2]/a"))
				.click();

		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();

		// Personal Details

		List<WebElement> list1 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[1]/td[1]/md-input-container/md-select"));
		list1.get(0).click();

		driver.findElement(By.xpath("/html/body/div[4]/md-select-menu/md-content/md-option[1]/div")).click();

		List<WebElement> list2 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[1]/td[2]/md-input-container/md-select"));
		Thread.sleep(3000);
		list2.get(0).click();

		driver.findElement(By.xpath("/html/body/div[5]/md-select-menu/md-content/md-option[2]/div")).click();

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[2]/td/md-input-container/input"))
				.sendKeys("test Mother");
		List<WebElement> list3 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[3]/td[1]/md-input-container/md-select"));
		list3.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[2]")).click();

		List<WebElement> list4 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[3]/td[2]/md-input-container/md-select"));
		list4.get(0).click();

		driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[1]/div")).click();

		List<WebElement> list5 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/md-select"));
		list5.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[8]/md-select-menu/md-content/md-option[3]")).click();
		Thread.sleep(3000);
		List<WebElement> list6 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[4]/td[2]/md-input-container/md-select"));
		list6.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[1]/div")).click();

		// Nominee
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[5]/td/md-checkbox/div[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[7]/td[1]/md-input-container/input"))
				.sendKeys("Test Nominee");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[7]/td[2]/md-input-container/input"))
				.sendKeys("Test Relation");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[8]/td[1]/md-input-container/input"))
				.sendKeys("10/06/1997");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[8]/td[2]/md-input-container/input"))
				.sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[3]/div[2]/a"))
				.click();

		// Bank Account

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[1]/td[1]/md-input-container/input"))
				.sendKeys("HDFC0001069");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[1]/td[2]/md-input-container/input"))
				.sendKeys("50100370135211");

		List<WebElement> lista = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[2]/td[1]/md-input-container/md-select"));
		lista.get(0).click();

		driver.findElement(By.xpath("/html/body/div[11]/md-select-menu/md-content/md-option[1]/div")).click();

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[3]/td[1]/md-input-container/input"))
				.sendKeys("Sandeep");

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[5]/div[2]/a"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[12]/md-dialog/md-dialog-actions/button[2]")).click();

		Thread.sleep(3000);

		double val1 = 1.00;

		for (int i = 0; i < 13; i++) {
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[6]/table/tbody/tr/td/md-input-container/input"))
					.sendKeys(String.valueOf(val1));
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[7]/div[2]/a"))
					.click();
			Thread.sleep(3000);
			try {
				if (driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/button")).isDisplayed())

				{
					driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/button")).click();
					driver.findElement(By.xpath(
							"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[6]/table/tbody/tr/td/md-input-container/input"))
							.clear();

					val1 = val1 + 0.01;
				} else {
					System.out.print("Mahdev");
					break;
				}
			} catch (Exception e) {
				System.out.print("Mahdev");
				break;

			}

		}
		// Upload Sign
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div[9]/div/div/div[2]/table/tbody/tr/td/div/div/img"))
				.click();
		robot.setAutoDelay(2000);
		StringSelection sel8 = new StringSelection("E:\\SeleniumCodeFile\\sign.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel8, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[9]/div/div/div[4]/div[2]/a"))
				.click();
		Thread.sleep(15000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[10]/div/div/div[3]/div[2]/a[3]"))
				.sendKeys(Keys.DOWN);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[10]/div/div/div[3]/div[2]/a[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[11]/div/div/div[3]/div[2]/a"))
				.click();

	}

	public void goalKYC() throws InterruptedException, AWTException {
		Robot robot = new Robot();

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[1]"))
				.click();
		;

		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("TNEPT9117A");
		driver.findElement(By.xpath("//a[contains(text(),'Check your KYC status')]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/md-input-container[1]/input[1]"))
				.sendKeys("Test User Pan ");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/a[1]"))
				.click();

		Thread.sleep(5000);
		WebElement addressa = driver.findElement(
				By.xpath("//div[@class='pull-right']//h4[contains(@class,'card-title')][contains(text(),'Add')]"));
		if (addressa.isDisplayed()) {

			addressa.click();
		} else {

			/*
			 * driver.findElement(By.xpath("//input[@id='input_10']")).sendKeys("TNEPT9457Q"
			 * );
			 * driver.findElement(By.xpath("//a[contains(text(),'Check your KYC status')]"))
			 * .click(); Thread.sleep(15000);
			 * driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
			 * 
			 * driver.findElement(By.xpath("//input[@id='input_12']")).
			 * sendKeys("Test User Pan "); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/a[1]"
			 * )).click();
			 */

			// Address Verification
			// driver.findElement(By.xpath("//tr[2]//td[2]//div[2]//a[1]//h4[1]")).click();

			driver.findElement(By.id("panfilediv")).click();
			robot.setAutoDelay(3000);
			StringSelection sel = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\testPan.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			List<WebElement> list = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/md-select[1]"));
			list.get(0).click();

			driver.findElement(By.xpath("//div[contains(text(),'AADHAR CARD')]")).click();

			driver.findElement(By.id("addFrontfilediv")).click();
			robot.setAutoDelay(3000);
			StringSelection sel1 = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\adharFront.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.id("addBackfilediv")).click();
			robot.setAutoDelay(3000);
			StringSelection sel2 = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\adharBack.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[4]/div/div/div[3]/div[2]/a"))
					.click();
			Thread.sleep(70000);
			// driver.findElement(By.xpath("//*[@id=\"dialogContent_162\"]/md-dialog-actions/button[2]/span")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-actions[1]/button[2]/span[1]"))
					.click();

			// Verify your Information
			// driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]/table/tbody/tr[3]/td[2]/div[2]/a/h4")).click();

			Thread.sleep(3000);

			List<WebElement> list1 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/md-input-container[1]/md-select[1]"));
			list1.get(0).click();

			driver.findElement(By.xpath("//div[contains(text(),'Female')]")).click();
			Thread.sleep(3000);

			List<WebElement> list2 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/md-input-container[1]/md-select[1]"));
			list2.get(0).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'Un-Married')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("test Mother");
			List<WebElement> list3 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/md-input-container[1]/md-select[1]"));
			list3.get(0).click();

			driver.findElement(By.xpath("//div[contains(text(),'Private Sector')]")).click();
			Thread.sleep(3000);

			List<WebElement> list4 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/md-input-container[1]/md-select[1]"));
			list4.get(0).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'Registered office')]")).click();
			Thread.sleep(3000);

			List<WebElement> list5 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/md-select[1]"));
			list5.get(0).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'2500000-10000000')]")).click();
			Thread.sleep(3000);

			List<WebElement> list6 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/md-input-container[1]/md-select[1]"));
			list6.get(0).click();

			driver.findElement(By.xpath("//div[contains(text(),'Salary')]")).click();
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]/a[1]"))
					.click();
			// Nominee
			/*
			 * driver.findElement(By.xpath("//div[@class='md-container md-ink-ripple']")).
			 * click(); Thread.sleep(3000); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/md-input-container[1]/input[1]"
			 * )).sendKeys("Test Nominee"); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[2]/md-input-container[1]/input[1]"
			 * )).sendKeys("Test Relation"); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"
			 * )).click(); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"
			 * )).sendKeys(Keys.CONTROL+"a"); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"
			 * )).clear(); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"
			 * )).sendKeys("1995-01-18"); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[2]/md-input-container[1]/input[1]"
			 * )).sendKeys("100");
			 * 
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[2]/a[1]"
			 * )).click(); WebDriverWait wait=new WebDriverWait(driver, 20); Alert alert =
			 * wait.until(ExpectedConditions.alertIsPresent());
			 * Assert.assertTrue(alert.getText().
			 * contains("Please enter first nominee valid DOB!")); alert.accept();
			 */
			// In-Person Verification
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[3]/div[2]/a[1]"))
					.click();
			driver.findElement(By.xpath("//div[@id='phototfilediv']//div//img")).click();
			robot.setAutoDelay(3000);
			StringSelection sel7 = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\adharBack.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel7, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[5]/div[2]/a[1]"))
					.click();
			Thread.sleep(40000);
			driver.findElement(By.xpath("//*[@id=\"btn-start-recording\"]")).click();
			robot.delay(5000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10000);

			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[7]/div[2]/button[1]"))
					.click();

			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[7]/div[2]/a[1]"))
					.click();

			// Bank Details
			// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/div[2]/a[1]/h4[1]")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id=\"input_45\"]")).sendKeys("HDFC0000271");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/md-input-container[1]/input[1]"))
					.sendKeys("50100303980481");
			Thread.sleep(3000);

			List<WebElement> lista = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/md-select[1]"));
			lista.get(0).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//*[@id=\"select_option_96\"]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("Anshuman Singh");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/div[3]/div[2]/a[1]"))
					.click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();

			// Signature
			driver.findElement(By.xpath("//div[@id='signfilediv']//div")).click();
			robot.setAutoDelay(3000);
			StringSelection sel8 = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\adharBack.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel8, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
		}
	}
//DashBoard Button	

	public void dashBoardbutton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dashboard")).click();

	}

	public void resetKYC() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='table']//div[@class='ng-scope']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
	}

	public void dashBoardKycButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/img[1]"))
				.click();
	}
}

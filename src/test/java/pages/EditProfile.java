package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;

public class EditProfile extends BaseTest {

	public void profileButton() throws InterruptedException {
		Thread.sleep(9000);
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Profile"));
		je1.executeScript("arguments[0].scrollIntoView(true);", element1);
		element1.click();
	}

	public void editProfileButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/a/i"))
				.click();
	}

	public void editBasicDetails() throws InterruptedException, AWTException {
		Robot robot = new Robot();

		// View Pan
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/table/tbody/tr[1]/td[3]/a[1]"))
				.click();

		// View Sign
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[3]/a[1]"))
				.click();

		// Three Dot btn
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon"))
				.click();
		// edit basic details
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions[1]/button[8]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

		// Three Dot btn
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon"))
				.click();
		// Update mobile number
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[44]/div[1]/md-input-container/input"))
				.sendKeys("8368264851");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[9]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[1]/span")).click();

		// Three Dot btn
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon"))
				.click();
		// Update Eamil
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[44]/div[2]/md-input-container/input"))
				.sendKeys("anshuman@fincart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[9]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[1]/span")).click();
		// Upload Pan

		// Three Dot btn
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[4]/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("panfilediv")).click();
		StringSelection sel1 = new StringSelection("E:\\SeleniumCodeFile\\testPan.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[6]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		// Upload Sign
		// Three Dot btn
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("signfilediv")).click();
		StringSelection sel001 = new StringSelection("E:\\SeleniumCodeFile\\sign.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel001, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[7]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addressRequest() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/h4/span/button/md-icon"))
				.click();
//Change Request
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/button/span")).click();
		/*
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html/body/div[3]/div/div/div/div[1]/button/span")).click();
		 */
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.id("input_7661"));
		address.clear();
		address.sendKeys("B-22, New Ashok Nagar");
		Thread.sleep(3000);
		WebElement pincode = driver.findElement(By.id("input_7662"));
		pincode.clear();
		pincode.sendKeys("110066");
		Thread.sleep(3000);
		List<WebElement> list1 = driver.findElements(
				By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[4]/md-input-container/md-select"));
		list1.get(0).click();
		driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[10]/md-input-container/input"))
				.sendKeys("Test Automation Change Address");
		robot.setAutoDelay(3000);
		driver.findElement(By.xpath("//*[@id=\"addFrontfilediv\"]/div")).click();
		StringSelection sel1 = new StringSelection("E:\\SeleniumCodeFile\\adharFront.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[3]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

//Address Details
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/h4/span/button/md-icon"))
				.click();
//Address Details
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button/span")).click();

	}

	public void operationAddresBtn() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://workpoint.fincart.com/request/Address-request");
		Thread.sleep(5000);
		driver.findElement(By.id("SearchByEmail")).click();
		driver.findElement(By.id("client_Search")).sendKeys("Test15feb4@gmail.com");
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[1]/form/div/div/div[2]/div[5]/input"))
				.click();
		Thread.sleep(3000);
		String text = "B-22, New Ashok Nagar";
		String bodyText = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText.contains(text));
//Action Button	
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/table/tbody/tr/td[5]/div/button"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/ng-component/div[1]/div[2]/div/div/div/table/tbody/tr/td[5]/div/div/a[1]"))
				.click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
	}

	public void bankRequestBtn() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[1]/h4/span/button/md-icon"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/button/span")).click();
		Thread.sleep(3000);
		WebElement car = driver.findElement(
				By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[11]/div[1]/md-input-container/input"));

		car.click();
		car.clear();
		car.sendKeys("PUNB0776300");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div/button")).click();

		Thread.sleep(3000);
		WebElement car1 = driver.findElement(
				By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[14]/div[2]/md-input-container/input"));

		car1.click();
		car1.clear();
		car1.sendKeys("7063000100030105");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[15]/div[1]/md-input-container/input"))
				.sendKeys("Anshuman Singh");
		Thread.sleep(3000);
		List<WebElement> list2 = driver.findElements(
				By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[16]/div[1]/md-input-container/md-select"));
		list2.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"chequefilediv\"]/div")).click();
		robot.setAutoDelay(3000);
		StringSelection sel2 = new StringSelection("E:\\SeleniumCodeFile\\CancelCheque.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[17]/div/md-input-container/input"))
				.sendKeys("Test Automation Change Bank Request");
//Submit  button
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void operationBankRequest() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://workpoint.fincart.com/request/Bank-request");
		Thread.sleep(3000);
		driver.findElement(By.id("SearchByEmail")).click();
		driver.findElement(By.id("client_Search")).sendKeys("Test15feb4@gmail.com");
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/app-bank-request/div[1]/div[1]/form/div/div/div[2]/div[6]/input"))
				.click();
		Thread.sleep(3000);
		String text = "Punjab National Bank";
		String bodyText = driver.findElement(By.tagName("body")).getText();

		Assert.assertTrue(bodyText.contains(text));
//Action Button	
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/app-bank-request/div[1]/div[2]/div/div/div/table/tbody/tr/td[5]/div/button"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"DynamicUserViewPanel\"]/div/div[1]/div[2]/app-bank-request/div[1]/div[2]/div/div/div/table/tbody/tr/td[5]/div/div/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
	}
}

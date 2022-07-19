package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class FincartHomePage extends BaseTest {
	public void fincartHome() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://www.fincart.com/");
		driver.findElement(By.xpath("//a[contains(text(),'& Team')]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}

	public void aboutUsPage() throws InterruptedException {
		// About Us(Who We Are)
		List<WebElement> list1 = driver.findElements(By.xpath("//a[contains(text(),'About Company')]"));
		list1.get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(5000);
		driver.navigate().back();
		// About Us(CEO Message)
		List<WebElement> list2 = driver.findElements(By.xpath("//a[contains(text(),'About Company')]"));
		list2.get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'CEO Message')]")).click();
		// JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(5000);
		driver.navigate().back();
		// About Us(Our Team)
		List<WebElement> list3 = driver.findElements(By.xpath("//a[contains(text(),'About Company')]"));
		list3.get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'Our Team')]")).click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	public void homePageGoal() throws InterruptedException {
		// Goal
		driver.findElement(By.xpath("//a[contains(text(),'Goals')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
//Retairment Goal	    
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/section[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("40");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("10000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dialogContent_20\"]/div/div/div[3]/div[1]/h3[1]/i")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void award() throws InterruptedException {
//		Awards
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Award')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		// Discover
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Discover')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		// Join Us
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

	public void socialMedia() throws InterruptedException {
		// Facebook
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='fixed-social']/div[1]/a[1]/i[1]")).click();
		Thread.sleep(10000);
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(1));
		driver.close();
		driver.switchTo().window(tabs4.get(0));

		// Linkdin
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='fixed-social']/div[2]/a[1]/i[1]")).click();
		Thread.sleep(10000);
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		driver.close();
		driver.switchTo().window(tabs3.get(0));
		// You Tube
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='fixed-social']/div[3]/a[1]")).click();
		Thread.sleep(10000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		// Twitter
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='fixed-social']/div[4]/a[1]/i[1]")).click();
		Thread.sleep(10000);
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		driver.close();
		driver.switchTo().window(tabs1.get(0));

	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void joinUs(String name, String email, String mobile, String password) throws InterruptedException {
		// Join Us
		driver.findElement(By.linkText("Join Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='txtemail']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='txtmobile']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@id='txtpass']")).sendKeys(password);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		/*
		 * //OTP verify Thread.sleep(5000);
		 * driver.findElement(By.id("txtotp")).sendKeys("9918");
		 * driver.findElement(By.xpath("//*[@id=\"btnotpvalidate\"]")).click();
		 */
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void retirementplanning(String name, String email, String mobile, String password)
			throws InterruptedException {
		driver.get("https://www.fincart.com/retirementplanning");

		Thread.sleep(3000);
		driver.findElement(By.id("txtname")).sendKeys(name);
		driver.findElement(By.id("txtemail")).sendKeys(email);
		driver.findElement(By.id("txtmobile")).sendKeys(mobile);
		driver.findElement(By.id("txtpass")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='btntxt']")).click();
		Thread.sleep(15000);

	}
}

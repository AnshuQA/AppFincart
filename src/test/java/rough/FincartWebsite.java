package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FincartWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.fincart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'& Team')]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//About Us(Who We Are)		
		List<WebElement> list1 = driver.findElements(By.xpath("//a[contains(text(),'About Company')]"));
		Thread.sleep(3000);
		list1.get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'& Team')]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.navigate().back();
//About Us(CEO Message)	    
		List<WebElement> list2 = driver.findElements(By.xpath("//a[contains(text(),'About Company')]"));
		list2.get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'CEO Message')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'& Team')]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.navigate().back();
//About Us(Our Team)	    
		List<WebElement> list3 = driver.findElements(By.xpath("//a[contains(text(),'About Company')]"));
		list3.get(0).click();
		driver.findElement(By.xpath("//a[contains(text(),'Our Team')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'& Team')]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(5000);
		driver.navigate().back();

		// Goal
		driver.findElement(By.xpath("//a[contains(text(),'Goals')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		// Retairment Goal
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
		driver.findElement(By.xpath("//a[contains(text(),'& Team')]")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.navigate().back();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//	Awards

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Award')]")).click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", ""); // Discover
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Discover')]")).click();
		Thread.sleep(3000);
		driver.navigate().back(); // Join Us Thread.sleep(3000);
		driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();

//**************************************************************************************************
//Join Us
		driver.findElement(By.linkText("Join Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtname']")).sendKeys("Test Anshuman Join us");
		driver.findElement(By.xpath("//input[@id='txtemail']")).sendKeys("testjoinus12jun21@gmail.com");
		driver.findElement(By.xpath("//input[@id='txtmobile']")).sendKeys("8368264851");
		driver.findElement(By.xpath("//input[@id='txtpass']")).sendKeys("12345678");
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
//OTP verify
		Thread.sleep(5000);
		driver.findElement(By.id("txtotp")).sendKeys("9918");
		driver.findElement(By.xpath("//*[@id=\"btnotpvalidate\"]")).click();

	}

}

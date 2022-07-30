package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DailyBaseValueMatched {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//Dashboard MF 
		/*
		 * driver.get(
		 * "https://app.fincart.com/user/login/raADVYqtYt3VthSXDjgavTq-1zjrgFCgtULvkgVy9VuqPrXLORPc3w=="
		 * );
		 * 
		 * Thread.sleep(3000); String mf = driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]"
		 * )) .getText(); System.out.println(mf); Thread.sleep(3000);
		 * driver.get("https://app.fincart.com/dashboard/allinvestments");
		 * Thread.sleep(5000); String name = mf; String bodyName =
		 * driver.findElement(By.tagName("body")).getText();
		 * Assert.assertTrue(bodyName.contains(name));
		 */
//Dashboard Ulip+HDFC
		/*
		 * driver.get(
		 * "https://app.fincart.com/user/login/CV9g-M66kF_y7VAO0HE7wTq-1zjrgFCgP_CMk9jHV33pXxEsGqzsBw=="
		 * );
		 * 
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]/span[1]"
		 * )) .click(); Thread.sleep(5000); String mf1 = driver .findElement(By.xpath(
		 * "//*[@id=\"tab-content-14\"]/div/md-content/table/tbody/tr[1]/td[3]/a"))
		 * .getText(); Thread.sleep(3000); System.out.println(mf1); Thread.sleep(5000);
		 * driver.get("https://app.fincart.com/dashboard/insurance");
		 * Thread.sleep(5000); driver.findElement(By.
		 * xpath("//button[@class='md-primary md-button md-ink-ripple']")).click();
		 * driver.findElement(By.
		 * xpath("//button[@class='btn btn-success btn-sm md-button md-ink-ripple']")).
		 * click(); Thread.sleep(5000); String name1 = "CHANDER PRAKASH [Father]";
		 * String bodyName1 = driver.findElement(By.className("_md")).getText();
		 * Assert.assertTrue(bodyName1.contains(name1));
		 */

//Dashboard PMS-Motilal
		driver.get("https://app.fincart.com/user/login/qrZaYrv9pgiJKeFJKCQ9gVR-a0ztH281pAvVxOrtWN6HhbhTBnUQtA==");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[5]/span[1]"))
				.click();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		String mf1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]"))
				.getText();
		Thread.sleep(3000);
		System.out.println(mf1);

		driver.get("https://app.fincart.com/dashboard/pms");
		Thread.sleep(25000);
		String name = mf1;
		String bodyName = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(bodyName.contains(name));

	}

}

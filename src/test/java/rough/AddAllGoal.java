package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddAllGoal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login/");
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/input[1]"))
				.sendKeys("testweb16may22@gmail.com");
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[1]/input[1]"))
				.sendKeys("12345678");
		driver.findElement(By.xpath("//div[contains(text(),'Lets Go')]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();

		Thread.sleep(12000);

		JavascriptExecutor newgoal = (JavascriptExecutor) driver;
		WebElement setgoal = driver.findElement(By.linkText("Set New Goals"));
		newgoal.executeScript("arguments[0].scrollIntoView(true);", setgoal);
		setgoal.click();
		Thread.sleep(5000);

//Home
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/a")).click();
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("18000000");
			Thread.sleep(3000);
			/*
			 * driver.findElement(By.xpath(
			 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table[1]/tbody/tr[20]/td/md-input-container/md-datepicker/button"
			 * )) .click();
			 */
			Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[@id=\"md-3-year-2023-11-1\"]/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

//Your Education
		// Add New Goal Button
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[2]/a"))
				.isDisplayed()) {

			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[2]/a")).click();
			Thread.sleep(3000);
			List<WebElement> list2 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/md-select[1]"));
			list2.get(0).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'INDIA')]")).click();

			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/a[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[6]/md-dialog/md-dialog-actions/button[3]	")).click();
			Thread.sleep(4000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);

		}

// Bike Goal
		if (driver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]"))
				.isDisplayed()) {

			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("125000");
			Thread.sleep(5000);
			// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/button[1]")).click();

			WebElement drop = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			drop.click();
			drop.clear();
			drop.sendKeys("2022-02-06");
			Thread.sleep(5000);

			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/a[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/button[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);

		}

//TRAVEL PLANS
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[5]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[5]/div/div[2]/a")).click();
			Thread.sleep(3000);
			List<WebElement> list3 = driver.findElements(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/md-select[1]"));
			list3.get(0).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'INDIA')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[12]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("8");
			Thread.sleep(5000);
			WebElement travell = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			travell.click();
			travell.clear();
			travell.sendKeys("2030-02-06");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);

		}

// Car
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[7]/div/div[2]/a"))
				.isDisplayed()) {
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[7]/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("7500000");
			Thread.sleep(3000);
			WebElement car = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			car.click();
			car.clear();
			car.sendKeys("2030-02-06");
			Thread.sleep(4000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

//Your Wedding

		if (driver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/a[1]"))
				.isDisplayed()) {
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/a[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("1300000");
			Thread.sleep(3000);
			WebElement ourwedding = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			ourwedding.click();
			ourwedding.clear();
			ourwedding.sendKeys("2030-02-06");
			Thread.sleep(4000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

// Family Planning
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[9]/div/div[2]/a"))
				.isDisplayed()) {
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[9]/div/div[2]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("2500000");
			Thread.sleep(3000);
			WebElement family = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			family.click();
			family.clear();
			family.sendKeys("2030-02-06");
			Thread.sleep(4000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

// SABBATICAL
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[10]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[10]/div/div[2]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("20000");
			Thread.sleep(3000);
			WebElement sub = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[18]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			sub.click();
			sub.clear();
			sub.sendKeys("2022-02-06");
			Thread.sleep(3000);
			WebElement sab = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			sab.click();
			sab.clear();
			sab.sendKeys("2030-02-06");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			;
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();

			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

// Retairment
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[11]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[11]/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("20");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("40");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("3000000");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(5000);

			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

//New Business
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[12]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[12]/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("10000000");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("500000");
			Thread.sleep(3000);
			WebElement business = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			business.click();
			business.clear();
			business.sendKeys("2022-02-06");
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

// Other Goal
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[13]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[13]/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("Test Other11");
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("850000");
			Thread.sleep(3000);
			Thread.sleep(3000);
			WebElement other = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			other.click();
			other.clear();
			other.sendKeys("2022-02-06");

			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

// Wealth Creation
		if (driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[14]/div/div[2]/a"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[14]/div/div[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
					.sendKeys("1450000");
			Thread.sleep(3000);
			WebElement other = driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
			other.click();
			other.clear();
			other.sendKeys("2022-02-06");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(5000);
		}

		// Child Education

		// Thread.sleep(5000);
		if (driver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]"))
				.isDisplayed()) {
			Thread.sleep(5000);
			driver.findElement(By.linkText("Set New Goals")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]"))
					.click();
			Thread.sleep(3000);
			List<WebElement> list1 = driver.findElements(By.xpath("//md-select[@id='select_5']"));
			list1.get(0).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'INDIA')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table[1]/tbody/tr[6]/td/md-input-container/input"))
					.sendKeys("Chota Tester");
			Thread.sleep(4000);

			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/a[1]")).click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(
					"body > div.md-dialog-container.ng-scope > md-dialog > md-dialog-actions > button:nth-child(4)"))
					.click();
			Thread.sleep(4000);
			System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());

		}

	}

}

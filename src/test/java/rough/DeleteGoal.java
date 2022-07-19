package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteGoal {
	public static void main(String[] args) throws InterruptedException {
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/input[1]"))
				.sendKeys("testweb16may22@gmail.com");
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[1]/input[1]"))
				.sendKeys("12345678");
		driver.findElement(By.xpath("//div[contains(text(),'Lets Go')]")).click();
		Thread.sleep(9000);
		driver.findElement(By.linkText("Goals")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		for (int i = 0; i < 12; i++) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		}

	}
}

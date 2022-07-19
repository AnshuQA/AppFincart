package practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTextAndCompare {

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
		Thread.sleep(3000);

		driver.findElement(By.linkText("Goals")).click();
		Thread.sleep(3000);
		WebElement textDemo = driver
				.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/div[4]/h3"));

		if (textDemo.isDisplayed()) {
			System.out.println("Element found using text");
		}

		else
			System.out.println("Element not found");

	}

}

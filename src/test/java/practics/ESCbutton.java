package practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ESCbutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.fincart.com/user/login/CV9g-M66kF_y7VAO0HE7wTq-1zjrgFCgP_CMk9jHV33pXxEsGqzsBw==");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();

	}

}

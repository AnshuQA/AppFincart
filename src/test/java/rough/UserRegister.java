package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegister {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.fincart.com/#/user/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[3]/div/div[2]/div[1]/div/input")).sendKeys("test5marA@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[3]/div/div[2]/div[2]/div/input")).sendKeys("anshuman Singh");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[3]/div/div[2]/div[3]/div/input")).sendKeys("9718205589");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[3]/div/div[2]/div[4]/div/input")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[3]/div/div[2]/div[6]/div")).click();

	}

}

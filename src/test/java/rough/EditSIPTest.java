package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditSIPTest {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.fincart.com/user/login");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("test16mar@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.linkText("Quick SIP")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	   Thread.sleep(4000);
		WebElement house=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]"));
		house.clear();
		house.sendKeys("Test Automation Quick SIP");
		Thread.sleep(4000);
		WebElement house1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		house1.clear();
		house1.sendKeys("2000");
		Thread.sleep(3000);
	    WebElement houseg=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
	    houseg.click();
	    houseg.clear();
	    houseg.sendKeys("2023-02-06");
		
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Update & Transact')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();

	}

}

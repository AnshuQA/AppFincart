package practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAccept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://dev-app.fincart.com/#/user/login");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("testgoal@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.linkText("Set New Goals")).click();
	    
	   Thread.sleep(4000);
//Home
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/a")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]")).sendKeys("18000000");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table[1]/tbody/tr[20]/td/md-input-container/md-datepicker/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"md-0-year-2022-11-1\"]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	    Thread.sleep(5000);
	   driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[3]/span")).click();
	   Thread.sleep(7000);
	  Alert alrt= driver.switchTo().alert();
	  alrt.getText();
		
		
		Assert.fail("Add Customer Test failed");

	}

}

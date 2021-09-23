package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteSIP {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.fincart.com/user/login");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("test16mar@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	    Thread.sleep(9000);
	    driver.findElement(By.linkText("Quick SIP")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//h4[contains(text(),'Remove')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm md-button md-ink-ripple']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

	}

}

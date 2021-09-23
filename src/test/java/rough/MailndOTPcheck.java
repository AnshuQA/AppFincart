package rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MailndOTPcheck {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "E:/Importent Softwares/Chrome Driver/chromedriver_2.37.exe");
        driver = new ChromeDriver(options);
	
		
	  // WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login");
//Forgot Pasword
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'FORGOT PASSWORD?')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[1]/div[1]/div/input")).sendKeys("fincarttesting@gmail.com");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[contains(text(),'Send OTP')]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://accounts.google.com/");
//Gmail login
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("fincarttesting@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();

	}
	

}

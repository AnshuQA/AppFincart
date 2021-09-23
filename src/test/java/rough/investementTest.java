package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class investementTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 //driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://dev-app.fincart.com/#/user/login");
		driver.get("https://app.fincart.com/user/login");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("singh@111");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
//Goal Investment	    
	    Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Goals"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
	   
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/h4[1]")).click();
//Investemet
	    Thread.sleep(9000);
	    JavascriptExecutor je2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(By.linkText("Investments"));
		je2.executeScript("arguments[0].scrollIntoView(true);",element2);
		element2.click();
		
//Investemet Account
	    Thread.sleep(9000);
	    JavascriptExecutor je3 = (JavascriptExecutor) driver;
		WebElement element3 = driver.findElement(By.linkText("Investment Account"));
		je3.executeScript("arguments[0].scrollIntoView(true);",element3);
		element3.click();
//Investemet Passbook
	    Thread.sleep(9000);
	    JavascriptExecutor je4 = (JavascriptExecutor) driver;
		WebElement element4 = driver.findElement(By.linkText("Passbook"));
		je4.executeScript("arguments[0].scrollIntoView(true);",element4);
		element4.click();
		 Thread.sleep(5000);
		WebElement family=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[2]/md-input-container/md-datepicker/div[1]/input"));
	    family.click();
	    family.clear();
	    family.sendKeys("2015-02-06");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[4]/button")).click();
	    Thread.sleep(10000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    

	}

}

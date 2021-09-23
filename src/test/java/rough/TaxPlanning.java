package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaxPlanning {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://app.fincart.com/user/login");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("test16jun@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	    
	    Thread.sleep(9000);
	    JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("Tax Saving"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
			    
	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[3]/td[1]/md-input-container[1]/input[1]")).sendKeys("20000");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[5]/td[1]/md-input-container[1]/input[1]")).sendKeys("20000");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[7]/td[1]/md-input-container[1]/input[1]")).sendKeys("20000");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[2]/tbody[1]/tr[9]/td[1]/md-input-container[1]/input[1]")).sendKeys("20000");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[3]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	    
/*//Complete Profile
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[3]/a/h4")).click();*/
	    
//Remove Tax Planning
	    Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Tax Saving"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
		
/*//investTaxSaving() 
	
		Thread.sleep(3000);
       driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/h4[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div/div/div/slick/div/div/div[3]/div/md-card/md-card-actions/button")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("850");
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[2]/span")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
  //Make Payment
       Thread.sleep(4000);
       driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[2]/a")).click();*/
	}


	
	

}

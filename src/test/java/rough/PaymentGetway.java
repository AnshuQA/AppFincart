package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentGetway {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login/raADVYqtYt3VthSXDjgavTq-1zjrgFCgni6Ag1yJUhyNr-c5c-V10Q==");
		/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("81277681");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
//Cart button    
	    Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Cart"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
		
//continue button
		Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/md-toolbar[1]/div/button")).click();	
		
//Net Banking	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[1]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
	    Thread.sleep(10000);
	    driver.get("https://app.fincart.com/dashboard/cart");
	    
//continue button
	  		Thread.sleep(4000);
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/md-toolbar[1]/div/button")).click();	    
//Other Card	    
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[2]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
		    Thread.sleep(10000);
		    driver.get("https://app.fincart.com/dashboard/cart");
		    
//continue button
	  		Thread.sleep(4000);
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/md-toolbar[1]/div/button")).click();	    
//Master Debit Card	    
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[3]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
		    Thread.sleep(10000);
		    driver.get("https://app.fincart.com/dashboard/cart");
//continue button
	  		Thread.sleep(4000);
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/md-toolbar[1]/div/button")).click();	    
//visa Debit Card	    
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[4]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
		    Thread.sleep(10000);
		    driver.get("https://app.fincart.com/dashboard/cart");
		    
//continue button
	  		Thread.sleep(4000);
	  	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/md-toolbar[1]/div/button")).click();
// UPI 
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[5]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
		    Thread.sleep(10000);
		    driver.get("https://app.fincart.com/dashboard/cart");    

	    
	    }
}

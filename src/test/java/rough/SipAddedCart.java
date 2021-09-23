package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SipAddedCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("test16jun@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	    
	    Thread.sleep(10000);
	    JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("Quick SIP"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		element.click();
	   
	    
//Invest button
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/h4[1]")).click();
//Recommended Scheme 
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/md-card/md-card-actions/button[1]")).click();

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> list3=driver.findElements(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value/span[1]/div"));
		    list3.get(0).click();
		   
		    driver.findElement(By.xpath("/html/body/div[5]/md-select-menu/md-content/md-option[2]/div")).click();
		   
		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> list4=driver.findElements(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value/span[2]"));
			    list4.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[5]/div")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1222");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[2]/button[2]/span")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div/button")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions[2]/button/span")).click();
	    
//Search scheme button	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[4]/div/md-card/md-card-content/md-card-title/md-card-title-text/a")).click();
//Search Scheme
	    Thread.sleep(3000);
      	 
      	 List <WebElement> list=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]"));
   	    list.get(0).click();
   	 Thread.sleep(3000);
   	    driver.findElement(By.xpath("//*[@id=\"select_option_149\"]")).click();
   	 Thread.sleep(3000);
   	 
   	 List <WebElement> list1=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/md-select[1]"));
	    list1.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"select_option_170\"]/div")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	    
//Monthly Added in cart
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]")).click();
	    

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> list5=driver.findElements(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value/span[2]"));
		    list5.get(0).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[8]/md-select-menu/md-content/md-option[4]")).click();
		   
		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> list6=driver.findElements(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value/span[2]"));
			    list6.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[19]/div")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("2222");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[7]/md-dialog/md-dialog-actions[1]/button[2]/span")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[7]/md-dialog/md-dialog-actions[2]/a")).click();
	}

}

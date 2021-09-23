package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuickSIP {
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
	    
	    
	    WebElement newuser =driver.findElement(By.xpath("//a[@class='btn btn-success']"));
      if(newuser.isDisplayed()) {
			
    	  newuser.click();
		}
	   
	  else {
		  Thread.sleep(5000);
		  //driver.findElement(By.linkText("click here to add quick SIP")).click();
	    driver.findElement(By.xpath("//a[contains(@class,'btn btn-warning')]")).click();
	  }
	    Thread.sleep(4000);
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]")).sendKeys("AutoMation Quick Sip");
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]")).sendKeys("50000");
	   Thread.sleep(4000);
	   Thread.sleep(3000);
	    WebElement car=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
	    
	    car.click();
	    car.clear();
	    car.sendKeys("2040-02-06");
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Save & Transact')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
	    
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/button[1]")).click();
//Invest
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[contains(@class,'row')]//div[1]//div[1]//div[5]//div[2]//a[1]//h4[1]")).click();
//Recomeded scheme	    
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]")).click();
//Search Scheme
	    Thread.sleep(3000);
      	 
      	 List <WebElement> list=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]"));
   	    list.get(0).click();
   	 Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/md-select-menu[1]/md-content[1]/md-option[14]/div[1]")).click();
   	 Thread.sleep(3000);
   	 
   	 List <WebElement> list1=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/md-select[1]"));
	    list1.get(0).click();
	   
	    driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[2]")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	    
//Monthly Added in cart
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]")).click();
	    

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> list3=driver.findElements(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-content[1]/div[5]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"));
		    list3.get(0).click();
		   
		    driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[3]")).click();
		   
		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> list4=driver.findElements(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-content[1]/div[6]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
			    list4.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[8]/md-select-menu[1]/md-content[1]/md-option[9]/div[1]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-content[1]/div[8]/md-input-container[1]/input[1]")).sendKeys("1200");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-actions[1]/button[2]/span[1]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/button")).click();
			    
//			    
}
}

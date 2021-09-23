package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoalAddedCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.get("https://app.fincart.com/user/login/kQksSFOuTKk6vtc464BQoK6rAhKi4eyV_7q7EdvvE0c=");
	    Thread.sleep(9000);
	    driver.findElement(By.linkText("Goals")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[5]/div[2]/a/h4")).click();
	    Thread.sleep(4000);
	    
//Recomeded scheme	  
	    
//One Time
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/md-card/md-card-actions/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1100");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
	    
	    
//Add More schemeButton	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Add More Scheme')]")).click();
//Monthly
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/md-card/md-card-actions/button[1]")).click();

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> list3=driver.findElements(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value/span[2]"));
		    list3.get(0).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[2]/div[1]")).click();
		   
		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> list4=driver.findElements(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value/span[2]"));
			    list4.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[9]/div")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1200");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[2]/button[2]/span")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			    
//Add More schemeButton	
			    
			    driver.findElement(By.xpath("//span[contains(text(),'Add More Scheme')]")).click();	
/*//Goal Button			    
			    Thread.sleep(5000);
			    driver.findElement(By.linkText("Goals")).click();
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[5]/div[2]/a/h4")).click();*/
			    
//Search Scheme button
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[4]/div/md-card/md-card-content/md-card-title/md-card-title-text/a")).click();
	    Thread.sleep(3000);
      	 
      	 List <WebElement> list=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]"));
   	    list.get(0).click();
   	 Thread.sleep(3000);
   	    driver.findElement(By.xpath("//div[contains(text(),'Kotak Mutual Fund')]")).click();
   	 Thread.sleep(3000);
   	 
   	 List <WebElement> list1=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/md-select[1]"));
	    list1.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[2]/div")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();

	    
	    
	    
//Monthly Added in cart
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]")).click();
	    

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> lista=driver.findElements(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value/span[1]/div"));
		    lista.get(0).click();
		   
		    driver.findElement(By.xpath("/html/body/div[8]/md-select-menu/md-content/md-option[2]")).click();
		   
		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> listb=driver.findElements(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value/span[2]"));
			    listb.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[9]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1200");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
 //Add More schemeButton	
			    
			    driver.findElement(By.xpath("//span[contains(text(),'Add More Scheme')]")).click();	
			    
//One Time 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/md-card/md-card-actions/button[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[7]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1110");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
//Make Payment 
			    driver.findElement(By.xpath("/html/body/div[7]/md-dialog/md-dialog-actions[2]/a")).click();
			    
	}

	

}

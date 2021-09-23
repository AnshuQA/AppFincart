package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdditionPurchase {
	public static WebDriver driver;
	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			
			return true;
		} catch (Throwable t) {

			return false;
		}

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login/raADVYqtYt3VthSXDjgavTq-1zjrgFCgtULvkgVy9VvpXxEsGqzsBw%3D%3D");
		
	    Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Goals"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
	   
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/h4[1]")).click();
	    driver.findElement(By.xpath("//md-icon[@class='ng-scope material-icons']")).click();
	  //  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
//One Time 	    
	   Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'OneTime')]")).click();
	    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/md-content/div/div[1]/md-input-container/input")).sendKeys("1000");
	    
	    

//Sell  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"tab-item-12\"]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"input_23\"]")).sendKeys("1");
	   
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tab-content-12\"]/div/md-content/div/div[2]/md-input-container/md-checkbox/div[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"tab-content-12\"]/div/md-content/div/div[2]/md-input-container/md-checkbox/div[1]")).click();
//Swith
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"tab-item-13\"]/span")).click();
	    Thread.sleep(3000);
      	List <WebElement> list1=driver.findElements(By.xpath("//*[@id=\"select_value_label_24\"]/span[1]/div"));
   	    list1.get(0).click();
   	    driver.findElement(By.cssSelector("#select_option_211")).click();
   	   Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"input_30\"]")).sendKeys("1");
	  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"tab-content-13\"]/div/md-content/div[2]/div[2]/md-input-container/md-checkbox/div[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tab-content-13\"]/div/md-content/div[2]/div[2]/md-input-container/md-checkbox/div[1]")).click();
   	   
//Monthly
	
	  
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tab-item-14\"]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"input_34\"]")).sendKeys("101");
	    Thread.sleep(3000);
     	 List <WebElement> list01=driver.findElements(By.xpath("//*[@id=\"select_value_label_31\"]"));
  	    list01.get(0).click();
  	    Thread.sleep(3000);
  	    driver.findElement(By.xpath("//*[@id=\"select_option_100\"]")).click();
  	    Thread.sleep(3000);
  	    List <WebElement> list02=driver.findElements(By.xpath("//*[@id=\"select_value_label_32\"]"));
	    list02.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[3]")).click();
	    Thread.sleep(5000);
	    
//STP	 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"dialogContent_18\"]/md-tabs/md-tabs-wrapper/md-next-button/md-icon")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"tab-item-15\"]/span")).click();
	   
	    driver.findElement(By.xpath("//*[@id=\"select_value_label_41\"]")).click();
	    Thread.sleep(5000);
	    
    	 driver.findElement(By.xpath("/html/body/div[8]/md-select-menu/md-content/md-option[2]/div")).click();
    	 
 	    Thread.sleep(3000);
 	    driver.findElement(By.xpath("//*[@id=\"select_value_label_42\"]")).click();
 	   Thread.sleep(3000);
   	 List <WebElement> list4=driver.findElements(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[4]"));
	    list4.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"select_value_label_43\"]")).click();
	    Thread.sleep(3000);
    	 List <WebElement> list5=driver.findElements(By.cssSelector("#select_option_265 > div"));
 	    list5.get(0).click();
 	    Thread.sleep(3000);
 	    driver.findElement(By.xpath("//*[@id=\"select_value_label_44\"]")).click();
 	   Thread.sleep(3000);
   	 List <WebElement> list6=driver.findElements(By.xpath("//*[@id=\"select_option_164\"]"));
	    list6.get(0).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"input_53\"]")).sendKeys("1");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tab-content-15\"]/div/md-content/div[3]/div[2]/md-input-container/md-checkbox/div[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tab-content-15\"]/div/md-content/div[3]/div[2]/md-input-container/md-checkbox/div[1]")).click();
	 
	    
//SWP
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath("//*[@id=\"tab-item-16\"]")).click();
	  
	    Thread.sleep(3000);
	    
   	   driver.findElement(By.xpath("//*[@id=\"select_value_label_54\"]")).click();
	    
   	   Thread.sleep(3000);
	    List <WebElement> list7=driver.findElements(By.xpath("/html/body/div[12]/md-select-menu/md-content/md-option[4]"));
	   	 Thread.sleep(3000);
		    list7.get(0).click();
		    Thread.sleep(3000);
		    
		   	   driver.findElement(By.xpath("//*[@id=\"select_value_label_55\"]/span[1]/div")).click();
		    Thread.sleep(3000);
		    List <WebElement> list07=driver.findElements(By.cssSelector("#select_option_189"));
		   	 Thread.sleep(3000);
		   	list07.get(0).click();
		   
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"input_60\"]")).sendKeys("200");
		  
		   
	    
	    
	    
	    

	}

}

package rough;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MandateTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("singh@111");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
//SIP Mandate button    
	    Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.xpath("//p[contains(text(),\"SIP Mandate's\")]"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
		
//Mandate
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
		
//NetBanking
		//proceed button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@id='consent']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='inptButton']")).click();
		
		((JavascriptExecutor) driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://app.fincart.com/dashboard/mandate");
	    Thread.sleep(4000);
	    driver.navigate(). refresh();	
//debit cart
	  //Mandate
	  		Thread.sleep(5000);
	  		driver.findElement(By.xpath("//span[@class='ng-scope']")).click();

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> list3=driver.findElements(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/md-content/div/div/div[2]/div[6]/div[2]/md-input-container/md-select/md-select-value/span[1]/div"));
		    list3.get(0).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"select_option_94\"]/div")).click();
		  //proceed button
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@id='consent']")).click();
			
			
        
	   

	}

}

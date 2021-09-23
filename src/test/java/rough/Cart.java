package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		driver.get("https://app.fincart.com/user/login/kQksSFOuTKk6vtc464BQoK6rAhKi4eyV_7q7EdvvE0c=");
	    Thread.sleep(10000);
	    driver.findElement(By.linkText("Cart")).click();
	    Thread.sleep(4000);
//Delete
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/md-card/md-card-header/md-card-header-media/div/i")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	    Thread.sleep(3000);
	    for(int i=0;i<30;i++)
	    {
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/md-card/md-card-header/md-card-header-media/div/i")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	    }
	    

	}

}

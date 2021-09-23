package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteGoal {
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://dev-app.fincart.com/#/user/login");
		driver.get("https://app.fincart.com/user/login/F09UtKsz85EG7ZaCfcy2kxMEHIkyZYklYTIdVQRh3dBTdkt8tQl4Ww==");
		/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("test16mar@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
	    Thread.sleep(9000);
	    driver.findElement(By.linkText("Goals")).click();
	    

	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[2]/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	    for(int i=0;i<20;i++)
	    {
	    	Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	    }
	    

	    
	    
}
}

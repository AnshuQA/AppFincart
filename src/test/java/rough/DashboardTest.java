package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.fincart.com/user/login/raADVYqtYt3VthSXDjgavTq-1zjrgFCgtULvkgVy9VvpXxEsGqzsBw==");
		/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("singh@111");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
//Investeshort Summery	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/a/img")).click();
	    
//DashboardButton	    
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
//Allocation Summery	    
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[3]/div/div[2]/div[2]/a/img")).click();
//DashboardButton	    
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
	    
//DashboardQuickSIPButton	    
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div[4]/div/div[3]/div[2]/a/img")).click();	    
//DashboardButton	    
	   // Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
//MycurrentGoalButton	    
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div[6]/slick/div/div/div/div/div[3]/div[2]/a/img")).click();
//DashboardButton	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
//Systmatics Remainder	    
	   // Thread.sleep(8000);
	    driver.findElement(By.xpath("//*[@id=\"navbarDropdownMenuLink\"]/i")).click();
//DashboardButton	    
	   // Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
//Start Investment	    
	   // Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[5]/div[4]/slick/div/div/div[5]/div/div[3]/div[2]/a/img")).click();
//DashboardButton	    
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a/p")).click();
	    
	}

}

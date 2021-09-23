package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestSaverAccount {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.fincart.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("singh@111");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	    Thread.sleep(9000);
	    JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("Best Saver Account"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
	    
/*//Complete Profile	    
	    Thread.sleep(3000);
	    WebElement saver=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
	    if(saver.isDisplayed()) {
	    	saver.click();
	    }else {*/
//Deposit
	   /* Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/a[1]")).click();
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-content[1]/div[1]/md-input-container[1]/input[1]")).sendKeys("2200");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Deposit Money')]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();*/
	    
	    
//Remove Best Saver Account
	   Thread.sleep(4000);
	    driver.findElement(By.xpath("//i[contains(text(),'delete')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

}
}	

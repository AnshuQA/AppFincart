package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class SIPaddCart extends BaseTest {
	public void sipInvestBtn() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/a[1]/h4[1]")).click();
	}
	public void reccSchemAddToCart() throws InterruptedException
	{
		 Thread.sleep(3000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/md-card/md-card-actions/button[1]")).click();

		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> list3=driver.findElements(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value"));
			    list3.get(0).click();
			   
			    driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[3]")).click();
			   
			   	 Thread.sleep(3000);
			   	 
			   	 List <WebElement> list4=driver.findElements(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value"));
				    list4.get(0).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[19]/div")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1222");
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[2]/button[2]/span")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//span[contains(text(),'Add More Scheme')]")).click();
	}
	public void serachSchemeBtn() throws InterruptedException {
//Search scheme button	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[4]/div/md-card/md-card-content/md-card-title/md-card-title-text/a")).click();
//Search Scheme
	    Thread.sleep(3000);
      	 
      	 List <WebElement> list=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]"));
   	    list.get(0).click();
   	 Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html/body/div[5]/md-select-menu/md-content/md-option[2]/div")).click();
   	 Thread.sleep(3000);
   	 
   	 List <WebElement> list1=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/md-select[1]"));
	    list1.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[3]")).click();
	    List <WebElement> list001=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/md-input-container[1]/md-select[1]"));
	    list001.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[1]/div[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]")).click();
	}
	public void searchSchemAddToCart() throws InterruptedException
	{
		 Thread.sleep(5000);
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]")).click();
		    

		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> list5=driver.findElements(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value/span[1]/div"));
			    list5.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[2]")).click();
			   
			   	 Thread.sleep(3000);
			   	 
			   	 List <WebElement> list6=driver.findElements(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value/span[1]/div"));
				    list6.get(0).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[10]/md-select-menu/md-content/md-option[19]/div")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("2222");
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
				    Thread.sleep(5000);
				    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("/html/body/div[8]/md-dialog/md-dialog-actions[3]/a")).click();
	}

}

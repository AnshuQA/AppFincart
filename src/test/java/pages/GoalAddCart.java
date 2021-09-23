package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class GoalAddCart extends BaseTest{
	public void goalInvestBtn() throws InterruptedException {
		 Thread.sleep(4000);
		    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[5]/div[2]/a/h4")).click();
	}
	public void recomOneTime() throws InterruptedException {
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/md-card/md-card-actions/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1100");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
	}
	public void addMoreSchemeBtn() throws InterruptedException {
		 Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[contains(text(),'Add More Scheme')]")).click();
	}
	public void recoMonthly() throws InterruptedException {
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
	
		
	}
   public void searchSchemeButton() throws InterruptedException{
	   Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[4]/div/md-card/md-card-content/md-card-title/md-card-title-text/a")).click();
   }
   public void selectScheme() throws InterruptedException {
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
	    List <WebElement> list001=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/md-input-container[1]/md-select[1]"));
	    list001.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]")).click();
   }
   public void searchSchMonthly() throws InterruptedException {
	   Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]")).click();
	    

	   	 Thread.sleep(3000);
	   	 
	   	 List <WebElement> lista=driver.findElements(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[5]/md-input-container/md-select/md-select-value"));
		    lista.get(0).click();
		   
		    driver.findElement(By.xpath("/html/body/div[9]/md-select-menu/md-content/md-option[3]")).click();
		   
		   	 Thread.sleep(3000);
		   	 
		   	 List <WebElement> listb=driver.findElements(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[6]/md-input-container/md-select/md-select-value"));
			    listb.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[10]/md-select-menu/md-content/md-option[39]/div")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1200");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	
   }
   public void searchShmOneTime() throws InterruptedException {
	   Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/md-card/md-card-actions/button[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[8]/md-dialog/md-dialog-content/div[8]/md-input-container/input")).sendKeys("1110");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	    
//Make Payment 
	    Thread.sleep(5000);
			    driver.findElement(By.xpath("/html/body/div[8]/md-dialog/md-dialog-actions[3]/a")).click();
   }
}

package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import rough.QuickSIP;

public class QuickSip extends BaseTest{
	public void sipButton() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[5]/a/p")).click();
	}
	
	public void quickSipButton() throws InterruptedException {
		   Thread.sleep(10000);
		    JavascriptExecutor je = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.linkText("Quick SIP"));
			je.executeScript("arguments[0].scrollIntoView(true);",element);
			
			element.click();
	}
	public void sipPage() throws InterruptedException {
		   Thread.sleep(4000);
		    
		    
		    WebElement newuser =driver.findElement(By.xpath("//a[@class='btn btn-success']"));
	      if(newuser.isDisplayed()) {
				
	    	  newuser.click();
			}
		   
		  else {
			  Thread.sleep(4000);
			  //driver.findElement(By.linkText("click here to add quick SIP")).click();
		    driver.findElement(By.xpath("//a[contains(@class,'btn btn-warning')]")).click();
		  }
		    Thread.sleep(4000);
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]")).sendKeys("AutoMation Quick Sip");
		   Thread.sleep(4000);
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]")).sendKeys("50000");
		   
		   /*Thread.sleep(3000);
		    WebElement car=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		    
		    car.click();
		    car.clear();
		    car.sendKeys("2040-02-06");*/
		    
		    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[contains(text(),'Save & Transact')]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
	}
  public void completeProfileButton() throws InterruptedException {
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//h4[contains(text(),'Complete profile')]")).click();
	 
	 
	 
 }
  public void editSIP() throws InterruptedException {
	  Thread.sleep(4000);
	   driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	   Thread.sleep(4000);
		WebElement house=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]"));
		house.clear();
		house.sendKeys("Test Automation Quick SIP");
		Thread.sleep(4000);
		WebElement house1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		house1.clear();
		house1.sendKeys("2000");
		Thread.sleep(3000);
	    WebElement houseg=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
	    houseg.click();
	    houseg.clear();
	    houseg.sendKeys("2023-02-06");
		
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Update & Transact')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(@class,'swal-button swal-button--confirm')]")).click();
  }
  public void removeSip() throws InterruptedException {
	  Thread.sleep(3000);
	    driver.findElement(By.xpath("//h4[contains(text(),'Remove')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
  }
  public void investButton() throws InterruptedException {
	  Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[contains(@class,'row')]//div[1]//div[1]//div[5]//div[2]//a[1]//h4[1]")).click();
	   
//Recomeded scheme	    
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]")).click();
//Search Scheme
	    Thread.sleep(3000);
      	 
      	 List <WebElement> list=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]"));
   	    list.get(0).click();
   	 Thread.sleep(3000);
   	    driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[14]/div[1]")).click();
   	 Thread.sleep(3000);
   	 
   	 List <WebElement> list1=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/md-select[1]"));
	    list1.get(0).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[2]")).click();
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
  }
  public void monthlyAddinCart() throws InterruptedException {

	  
	  Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]")).click();
	    

	   	 Thread.sleep(3000);
	   	 
	   	/* List <WebElement> liste=driver.findElements(By.xpath("/html[1]/body[1]/div[7]/md-dialog[1]/md-dialog-content[1]/div[5]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"));
		    liste.get(0).click();
		   
		    driver.findElement(By.xpath("/html[1]/body[1]/div[8]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]")).click();
		   
		   	 Thread.sleep(3000);*/
		   	 
		   	/* List <WebElement> listh=driver.findElements(By.xpath("/html[1]/body[1]/div[7]/md-dialog[1]/md-dialog-content[1]/div[6]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
			    listh.get(0).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[9]/md-select-menu[1]/md-content[1]/md-option[3]")).click();*/
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-dialog[1]/md-dialog-content[1]/div[8]/md-input-container[1]/input[1]")).sendKeys("1200");
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-dialog[1]/md-dialog-actions[1]/button[2]/span[1]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/button[1]")).click();
	  
  }
  public void oneTimeAddincart() throws InterruptedException {
	  Thread.sleep(5000);
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"input_116\"]")).sendKeys("1100");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[6]/md-dialog/md-dialog-actions[1]/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div/button")).click();
  }
  public void makePaymentBtn() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-dialog[1]/md-dialog-actions[2]/a[1]")).click();
  }
  
}

package rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserProfile {
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.fincart.com/user/login/zQBjJ09w02aJS5PZHADvCnTLuQAd4da3yQBuKsZruv0TwrBhniuQGQ==");
		/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("singh@111");
	    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
//User Profile button    
	    Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Profile"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
		
//Profile
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/a/i")).click();
		
// Basic Details
		
	//View Pan
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/table/tbody/tr[1]/td[3]/a[1]")).click();
		
		/* NOT required Chrome automatic download
		 * 
		 * Thread.sleep(14000); ArrayList<String> tabs = new ArrayList<String>
		 * (driver.getWindowHandles()); driver.switchTo().window(tabs.get(1));
		 * driver.close(); driver.switchTo().window(tabs.get(0));
		 */
     //View Sign
      		Thread.sleep(5000);
      		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[3]/a[1]")).click();
			/*NOT required Chrome automatic download
			 * 
			 * Thread.sleep(14000); ArrayList<String> tabs1 = new ArrayList<String>
			 * (driver.getWindowHandles()); driver.switchTo().window(tabs1.get(1));
			 * driver.close(); driver.switchTo().window(tabs1.get(0));
			 */
//Three Dot btn
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon")).click();
	//edit basic details
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions[1]/button[8]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		
	//Three Dot btn
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon")).click();	
	//Update mobile number
	     Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/button/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[44]/div[1]/md-input-container/input")).sendKeys("8368264851");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[9]/span")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[1]/span")).click();
		
	//Three Dot btn
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon")).click();
	//Update Eamil
			     Thread.sleep(3000);
				 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-content/div[44]/div[2]/md-input-container/input")).sendKeys("anshuman@fincart.com");
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[9]/span")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[1]/span")).click();
	//Upload Pan
					
	//Three Dot btn
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon")).click();
		        Thread.sleep(3000);
		         driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[4]/button/span")).click();
		         Thread.sleep(5000);
		      driver.findElement(By.id("panfilediv")).click();
		      StringSelection sel1 = new StringSelection("E:\\SeleniumCodeFile\\testPan.png");
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1,null);
			    robot.setAutoDelay(2000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_V);
			    
			    robot.setAutoDelay(2000);
			    robot.keyPress(KeyEvent.VK_ENTER);

			    robot.keyRelease(KeyEvent.VK_ENTER);
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[6]")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	//Upload Sign
			  //Three Dot btn
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[1]/h4/span/button/md-icon")).click();
			    Thread.sleep(3000);
		         driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[5]/button/span")).click();
		         Thread.sleep(5000);
		      driver.findElement(By.id("signfilediv")).click();
		      StringSelection sel001 = new StringSelection("E:\\SeleniumCodeFile\\sign.jpg");
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel001,null);
			    robot.setAutoDelay(2000);
			    robot.keyPress(KeyEvent.VK_CONTROL);
			    robot.keyPress(KeyEvent.VK_V);
			    
			    robot.keyRelease(KeyEvent.VK_CONTROL);
			    robot.keyRelease(KeyEvent.VK_V);
			    
			    robot.setAutoDelay(2000);
			    robot.keyPress(KeyEvent.VK_ENTER);

			    robot.keyRelease(KeyEvent.VK_ENTER);
			    Thread.sleep(4000);
			    driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions[1]/button[7]")).click();
			    Thread.sleep(10000);
			    driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			    
		
		
		
		
//Address Details
      //View AadharFront
		Thread.sleep(5000);
  		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/a[3]")).click();
  		Thread.sleep(8000);
  		ArrayList<String> tabs001 = new ArrayList<String> (driver.getWindowHandles());
          driver.switchTo().window(tabs001.get(1));
          driver.close();
          driver.switchTo().window(tabs001.get(0));
      //View AdharBack
          Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/a[4]")).click();
    		Thread.sleep(8000);
    		ArrayList<String> tabsa1 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabsa1.get(1));
            driver.close();
            driver.switchTo().window(tabsa1.get(0));

 
		Thread.sleep(3000);
				driver.findElement(By.xpath("//h4[contains(text(),'Address Details')]")).click();
//Change Request
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/h4/span/button/md-icon")).click();
				 Thread.sleep(3000);
		       	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/button/span")).click();
		       	    Thread.sleep(3000);
		       	   WebElement address= driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[2]/md-input-container/div[1]/textarea"));
		       	address.clear();
		       	address.sendKeys("B-22, New Ashok Nagar");
		        Thread.sleep(3000);
		       	   WebElement pincode= driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[3]/md-input-container[1]/input"));
		       	pincode.clear();
		       	pincode.sendKeys("110066");
		       	Thread.sleep(3000);
		       	 List <WebElement> list1=driver.findElements(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[4]/md-input-container/md-select"));
		    	 list1.get(0).click();
		    	 driver.findElement(By.xpath("/html/body/div[5]/md-select-menu/md-content/md-option[1]")).click();
		       	Thread.sleep(3000);
		       	driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[10]/md-input-container/input")).sendKeys("Test Automation Change Address");
				 robot.setAutoDelay(3000);
				 driver.findElement(By.xpath("//*[@id=\"addFrontfilediv\"]/div")).click();
				    StringSelection sela1 = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\adharFront.jpg");
				    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sela1,null);
				    robot.setAutoDelay(2000);
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_V);
				    
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				    robot.keyRelease(KeyEvent.VK_V);
				    
				    robot.setAutoDelay(2000);
				    robot.keyPress(KeyEvent.VK_ENTER);

				    robot.keyRelease(KeyEvent.VK_ENTER);
				    
						driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[3]/span")).click();
						 Thread.sleep(6000);
					driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
					
//Address Details
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/h4/span/button/md-icon")).click();
//Address Details
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button/span")).click();
		

//LogOut
						Thread.sleep(6000);
						driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
						driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
						
						
//Opertaion Login
						Thread.sleep(6000);
						driver.get("https://workpoint.fincart.com/Login/Login");
						driver.findElement(By.xpath("//input[@id='Planner_UserID']")).sendKeys("testoperations@fincart.com");
						driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("fincart@123");
						driver.findElement(By.xpath("//input[@class='btn btn-block bg-pink waves-effect']")).click();
						
//Request
						
						JavascriptExecutor je = (JavascriptExecutor) driver;
						WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Request')]"));
						je.executeScript("arguments[0].scrollIntoView(true);",element);
						
						element.click();
						
//Address Request		
						Thread.sleep(5000);
				    	driver.findElement(By.xpath("//a[contains(text(),'Address Request')]")).click();	
				    	Thread.sleep(12000);
				    	driver.findElement(By.xpath("//body/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")).sendKeys("test19apr212@gmail.com");
				    	Thread.sleep(3000);
						String text= "B-22, New Ashok Nagar";
						String bodyText = driver.findElement(By.tagName("body")).getText();
						
						Assert.assertTrue(bodyText.contains(text));
						
//Operation logout
						
						Thread.sleep(3000);
						driver.findElement(By.xpath("//i[contains(text(),'keyboard_arrow_down')]")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//body/section[1]/aside[1]/div[1]/div[2]/div[3]/ul[1]/li[5]/a[1]")).click();
						
		
//Bank Details
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[1]/h4/span/button/md-icon")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/button/span")).click();
		Thread.sleep(3000);
	    WebElement car=driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[11]/div[1]/md-input-container/input"));
	    
	    car.click();
	    car.clear();
	    car.sendKeys("PUNB0776300");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div/button")).click();
		Thread.sleep(3000);
      	 List <WebElement> lista1=driver.findElements(By.xpath("//*[@id=\"select_44\"]"));
   	 lista1.get(0).click();
   	 driver.findElement(By.xpath("/html/body/div[6]/md-select-menu/md-content/md-option[1]/div")).click();
		Thread.sleep(3000);
	    WebElement car1=driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[14]/div[2]/md-input-container/input"));
	    
	    car1.click();
	    car1.clear();
	    car1.sendKeys("7063000100030105");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[15]/div[1]/md-input-container/input")).sendKeys("Anshuman Singh");
		Thread.sleep(3000);
     	 List <WebElement> list2=driver.findElements(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[16]/div[1]/md-input-container/md-select"));
  	 list2.get(0).click();
  	 driver.findElement(By.xpath("/html/body/div[7]/md-select-menu/md-content/md-option[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"chequefilediv\"]/div")).click();
		 robot.setAutoDelay(3000);
		    StringSelection sel2 = new StringSelection("C:\\Users\\SINGH\\Downloads\\Document\\client document\\cheque.jpg");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2, null);
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    
		    robot.setAutoDelay(2000);
		    robot.keyPress(KeyEvent.VK_ENTER);

		    robot.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(3000);
	       	driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-content/div[17]/div/md-input-container/input")).sendKeys("Test Automation Change Bank Request");
//Submit  button
		    Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[4]/span")).click();
			 Thread.sleep(6000);
				driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
			
//LogOut
				Thread.sleep(6000);
				driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
				
				
//Opertaion Login
				Thread.sleep(6000);
				driver.get("https://workpoint.fincart.com/Login/Login");
				driver.findElement(By.xpath("//input[@id='Planner_UserID']")).sendKeys("testoperations@fincart.com");
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("fincart@123");
				driver.findElement(By.xpath("//input[@class='btn btn-block bg-pink waves-effect']")).click();
				
//Request
				
				JavascriptExecutor jea1 = (JavascriptExecutor) driver;
				WebElement elementa1 = driver.findElement(By.xpath("//span[contains(text(),'Request')]"));
				jea1.executeScript("arguments[0].scrollIntoView(true);",elementa1);
				
				element.click();
				
//Bank Request		
				Thread.sleep(5000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Bank Request')]")).click();	
		    	Thread.sleep(12000);
		    	driver.findElement(By.xpath("//body/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")).sendKeys("test19apr212@gmail.com");
		    	Thread.sleep(3000);
				String texta1= "Punjab National Bank";
				String bodyTexta1= driver.findElement(By.tagName("body")).getText();
				
				Assert.assertTrue(bodyTexta1.contains(texta1));
	}

}

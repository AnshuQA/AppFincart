package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class PaymentGetway extends BaseTest {
public void paymentContinueBtn() throws InterruptedException {
	Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/md-toolbar[1]/div/button")).click();	
}
public void netBanking() throws InterruptedException {
	 Thread.sleep(4000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[1]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
	    Thread.sleep(10000);
	    driver.get("https://app.fincart.com/dashboard/cart");
}
public void otherCard() throws InterruptedException {
	 Thread.sleep(4000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[2]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
	    Thread.sleep(10000);
	    driver.get("https://app.fincart.com/dashboard/cart");
}
public void masterDebitCard() throws InterruptedException {
	 Thread.sleep(4000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[3]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
	    Thread.sleep(10000);
	    driver.get("https://app.fincart.com/dashboard/cart");
}
public void visaDebitCart() throws InterruptedException {
	Thread.sleep(4000);
    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[4]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
    Thread.sleep(10000);
    driver.get("https://app.fincart.com/dashboard/cart");
}
public void upi() throws InterruptedException {
	   Thread.sleep(4000);
	    driver.findElement(By.xpath("//body/md-bottom-sheet[1]/div[2]/md-list[1]/md-list-item[3]/div[1]/div[1]/md-checkbox[1]/div[1]")).click();	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html[1]/body[1]/md-bottom-sheet[1]/div[3]/button[1]")).click();
	    Thread.sleep(10000);
	    driver.get("https://app.fincart.com/dashboard/cart");
	
	
}
public void cartBtn() throws InterruptedException {
	 Thread.sleep(9000);
	    JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Cart"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		element1.click();
}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class LoginRegister  extends BaseTest{
	public void dashBoardLogOut() throws InterruptedException {

		Thread.sleep(6000);
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	}
	public void OperationLogin() throws InterruptedException {

		Thread.sleep(6000);
		driver.get("https://old-workpoint.fincart.com/Login/Login");
		driver.findElement(By.xpath("//input[@id='Planner_UserID']")).sendKeys("testoperations@fincart.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("fincart@123");
		driver.findElement(By.xpath("//input[@class='btn btn-block bg-pink waves-effect']")).click();
	}
	public void operationLogout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[contains(text(),'keyboard_arrow_down')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/section[1]/aside[1]/div[1]/div[2]/div[3]/ul[1]/li[5]/a[1]")).click();
	}
	public void editProfileLogin() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("https://app.fincart.com/user/login/zQBjJ09w02aJS5PZHADvCnTLuQAd4da3yQBuKsZruv0TwrBhniuQGQ==");
	}	
public void newuserLogin() throws InterruptedException {
	Thread.sleep(5000);
	driver.get("https://app.fincart.com/user/login/F_kn9A6dyCUE0uGvF3JsouAM8hAjbzyYmm1wyajaecaTMkj8HA0O1A%3D%3D");
	/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("testautoreff22feb@gmail.com");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("fincart@123");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
}
public void additionalPurchaseLogin() {
	driver.get("https://app.fincart.com/user/login/raADVYqtYt3VthSXDjgavTq-1zjrgFCgtULvkgVy9VvpXxEsGqzsBw==");
	/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshusingh812776@gmail.com");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("81277681");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
}
public void newUserwithKYC() throws InterruptedException {
	Thread.sleep(5000);
	driver.get("https://app.fincart.com/user/login/kQksSFOuTKk6vtc464BQoK6rAhKi4eyV_7q7EdvvE0c=");
	/*driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("anshuweb@gmail.com");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("fincart@123");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();*/
	
}
public void exitingUser() {
	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("fincarttesting@gmail.com");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input")).sendKeys("12345678");
    driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
}
public void logOut() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div/div[2]/ul/li/div/a[3]")).click();
}
public void newlogOut() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div/div[2]/ul/li[4]/a/i")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div/div[2]/ul/li[4]/div/a[3]")).click();
	
}
@Test(dataProviderClass = DataUtil.class, dataProvider="dp")	
public void websiteRegistarion(String email,String name,String mobile,String password) throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/div[2]/ul/li[2]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[1]/div/input")).sendKeys(email);
	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[2]/div/input")).sendKeys(name);
	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[3]/div/input")).sendKeys(mobile);
	driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[4]/div/input")).sendKeys(password);
	driver.findElement(By.xpath("//div[contains(text(),'Get Started')]")).click();
	Thread.sleep(5000);
	
}
public void launchNewTab() throws InterruptedException {
	Thread.sleep(5000);
	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t"); 
	driver.get("https://app.fincart.com/");
}
public void kycLogin() {
	driver.get("https://app.fincart.com/user/login/bi7_S98ABZQ6vtc464BQoHVjXzgCdxBug3jQCmLSyk4%3D");
}
public void insuranceLogin() {
	driver.get("https://app.fincart.com/user/login/CV9g-M66kF_y7VAO0HE7wTq-1zjrgFCgP_CMk9jHV33pXxEsGqzsBw==");
	
}
public void liquiLoanLogin() {
	driver.get("https://app.fincart.com/user/login/I1wr0CJGLNr9lIpZEXDqC1zpzu45Y_SKJg_mdyx9_TzrJ83RA0dv3g==");
	
}
public void pmsLogin() {
	driver.get("https://app.fincart.com/user/login/R7rPsaUJGyEDrFrZ6X4aoQBILPaYQWAX31qEmRBdKoA=");

}

}

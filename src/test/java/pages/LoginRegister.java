package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class LoginRegister extends BaseTest {
	public void dashBoardLogOut() throws InterruptedException {

		Thread.sleep(6000);
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	}

	public void OperationLogin() throws InterruptedException {

		Thread.sleep(6000);
		driver.get("https://workpoint.fincart.com/login?returnUrl=%2F");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
				.sendKeys("shilpi.goyal@fincart.com");
		driver.findElement(
				By.xpath("/html/body/app-root/div[1]/div/app-login/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
				.sendKeys("Shilpi@1234567");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	public void operationLogout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/app-homepage-layout/app-header/header/div/div/div[3]/div/ul/li[3]/a"))
				.click();

	}

	public void editProfileLogin() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://app.fincart.com/user/login/zQBjJ09w02aJS5PZHADvCnTLuQAd4da3yQBuKsZruv0TwrBhniuQGQ==");
	}

	public void newuserLogin() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://app.fincart.com/user/login/F_kn9A6dyCUE0uGvF3JsouAM8hAjbzyYmm1wyajaecaTMkj8HA0O1A%3D%3D");
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input"
		 * )).sendKeys("testautoreff22feb@gmail.com"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input"
		 * )).sendKeys("fincart@123"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click
		 * ();
		 */
	}

	public void additionalPurchaseLogin() {
		driver.get("https://app.fincart.com/user/login/sQRlpAUFmLdYGoKYa0_m79QbjN16iVuxdZegiLstrfnNdkBPKFSbkQ==");
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input"
		 * )).sendKeys("anshusingh812776@gmail.com"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input"
		 * )).sendKeys("81277681"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click
		 * ();
		 */
	}

	public void goalwiseInvestLogin() {
		driver.get("https://app.fincart.com/user/login/Cjn0ncOqtJWe0T1-7HwBxv1Y6GJdCWRKyAaNlawglfU=");
	}

	public void paymentGetway() {
		driver.get("https://app.fincart.com/user/login/raADVYqtYt3VthSXDjgavTq-1zjrgFCgtULvkgVy9VuqPrXLORPc3w==");
	}

	public void newUserwithKYC() throws InterruptedException {
		Thread.sleep(5000);
		driver.get("https://app.fincart.com/user/login/DQn3Kne0iNSgYIgcjYDiRFR-a0ztH281DCptwnNCYKLpXxEsGqzsBw==");

	}

	public void exitingUser() {
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[1]/div/input"))
				.sendKeys("fincarttesting@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/div/input"))
				.sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
	}

	public void logOut() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//i[contains(text(),'person')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	}

	public void newlogOut() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div/div[2]/ul/li[4]/a/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div/div[2]/ul/li[4]/div/a[3]")).click();

	}

	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void websiteRegistarion(String email, String name, String mobile, String password)
			throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[1]/div/input"))
				.sendKeys(email);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[2]/div/input"))
				.sendKeys(name);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[3]/div/input"))
				.sendKeys(mobile);
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[2]/div/div[2]/div[4]/div/input"))
				.sendKeys(password);
		driver.findElement(By.xpath("//div[contains(text(),'Get Started')]")).click();
		Thread.sleep(5000);

	}

	public void launchNewTab() throws InterruptedException {
		Thread.sleep(5000);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, "t");
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

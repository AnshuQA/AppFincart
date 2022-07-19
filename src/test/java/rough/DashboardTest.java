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
//Dashboard
		// driver.get("https://app.fincart.com/user/login/sQRlpAUFmLdYGoKYa0_m79QbjN16iVuxdZegiLstrfnNdkBPKFSbkQ==");
//View Progress In Goals
		driver.get("https://app.fincart.com/user/login/Cjn0ncOqtJWe0T1-7HwBxv1Y6GJdCWRKyAaNlawglfU=");

//Mutual Fund
		/*
		 * // All investments Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,400)");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); //Additional Purchase
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click(); //One
		 * Time
		 * driver.findElement(By.xpath("//span[contains(text(),'OneTime')]")).click();
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("50000"); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]")).click();
		 * //Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click(); //Sell
		 * driver.findElement(By.xpath("//span[contains(text(),'Sell')]")).click();
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("50000"); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"
		 * )) .click(); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]")).click();
		 * //Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click();
		 * //Swith
		 * driver.findElement(By.xpath("//span[contains(text(),'Switch')]")).click();
		 * Thread.sleep(3000); List<WebElement> list1 = driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); list1.get(0).click(); driver.findElement(By.xpath(
		 * "/html/body/div[5]/md-select-menu/md-content/md-option[3]/div")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("1");
		 * 
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"
		 * )) .click(); driver.findElement(By.xpath(
		 * "/html/body/div[4]/md-dialog/md-dialog-actions[2]/button[1]/span")).click();
		 */
//Active investments
		/*
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/md-radio-group[1]/md-radio-button[1]/div[1]/div[1]"
		 * )) .click(); Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,400)");
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); // Additional Purchase
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click(); // One
		 * Time
		 * driver.findElement(By.xpath("//span[contains(text(),'OneTime')]")).click();
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[1]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("50000"); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]")).click(); //
		 * Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click(); //
		 * Sell driver.findElement(By.xpath("//span[contains(text(),'Sell')]")).click();
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("50000"); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"
		 * )) .click(); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]")).click(); //
		 * Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click(); //
		 * Swith
		 * driver.findElement(By.xpath("//span[contains(text(),'Switch')]")).click();
		 * Thread.sleep(3000); List<WebElement> list1 = driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); list1.get(0).click(); driver.findElement(By.xpath(
		 * "/html/body/div[5]/md-select-menu/md-content/md-option[3]/div")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("1");
		 * 
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[2]/div[2]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"
		 * )) .click(); driver.findElement(By.xpath(
		 * "/html/body/div[4]/md-dialog/md-dialog-actions[2]/button[1]/span")).click();
		 * 
		 * // Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click();
		 * //Monthly Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body/div[3]/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("101"); Thread.sleep(3000); List<WebElement> list01 =
		 * driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"
		 * )); list01.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[19]/div[1]"
		 * )) .click(); Thread.sleep(3000); List<WebElement> list02 =
		 * driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); list02.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[2]/div[1]"
		 * )) .click(); Thread.sleep(5000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-actions[2]/button[1]/span[1]"
		 * )) .click(); // Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click();
		 * 
		 * // STP Thread.sleep(5000);
		 * driver.findElement(By.xpath("//span[contains(text(),'STP')]")).click();
		 * 
		 * Thread.sleep(3000); List<WebElement> list4 = driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); list4.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[2]/div[1]"
		 * )) .click(); Thread.sleep(3000); List<WebElement> list5 =
		 * driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); list5.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]"
		 * )) .click(); Thread.sleep(3000); List<WebElement> list6 =
		 * driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); list6.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[1]/div[1]"
		 * )) .click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[3]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("1"); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[2]/div[3]/div[2]/md-input-container[1]/md-checkbox[1]/div[1]"
		 * )) .click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click(); //
		 * Additional Purchase button
		 * driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]")).click();
		 * 
		 * //SWP Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[contains(text(),'SWP')]")).click();
		 * 
		 * Thread.sleep(3000); List<WebElement> list7 = driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); Thread.sleep(3000); list7.get(0).click(); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"
		 * )) .click(); Thread.sleep(3000); List<WebElement> list07 =
		 * driver.findElements(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[1]/div[2]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"
		 * )); Thread.sleep(3000); list07.get(0).click(); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[4]/div[1]"
		 * )) .click();
		 * 
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-content[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[2]/div[2]/div[1]/md-input-container[1]/input[1]"
		 * )) .sendKeys("200"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
		 */
//View MF total investment summary 
		/*
		 * Thread.sleep(5000); JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("window.scrollBy(0,800)"); Thread.sleep(3000);
		 * driver.findElement(By.linkText("View MF total investment summary")).click();
		 * Thread.sleep(3000); driver.navigate().back();
		 * 
		 * //View MF asset allocation summary Thread.sleep(5000);
		 * 
		 * jse.executeScript("window.scrollBy(0,800)"); Thread.sleep(3000);
		 * driver.findElement(By.linkText("View MF asset allocation summary")).click();
		 * Thread.sleep(3000); driver.navigate().back(); //View MF investment details
		 * Thread.sleep(5000); jse.executeScript("window.scrollBy(0,800)");
		 * Thread.sleep(3000);
		 * driver.findElement(By.linkText("View MF investment details")).click();
		 * Thread.sleep(12000); driver.navigate().back();
		 */
//*********************************ULIP**************************************************************

		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[2]/span[1]"
		 * )) .click(); Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,1000)");
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click(); //Transaction details
		 * driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click
		 * (); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[1]/button[1]")).click(); //
		 * Fund details driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Fund Details')]")).click
		 * (); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click(); //
		 * Fund details driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).
		 * click(); Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[1]/button[1]")).click(); //More
		 * details driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[2]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'More Details')]")).click
		 * (); Thread.sleep(3000); driver.navigate().back();
		 */
//********************************OTHER INSURANCE*********************************************
		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[3]/span[1]"
		 * )) .click(); Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,1000)");
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); Thread.sleep(3000);
		 * jse.executeScript("window.scrollBy(0,1000)"); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click
		 * (); driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[3]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).
		 * click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		 */
//********************************LiquiLoan*********************************************	
		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[4]/span[1]"
		 * )) .click(); Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,1000)");
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[4]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); Thread.sleep(3000);
		 * jse.executeScript("window.scrollBy(0,1000)"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/md-content/table/tbody[1]/tr[4]/td/table/tbody/tr[1]/td[10]/a/i"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click
		 * (); driver.findElement(By.xpath(
		 * "/html/body/div[4]/md-dialog/md-dialog-actions/button")).click();
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/md-content/table/tbody[1]/tr[4]/td/table/tbody/tr[1]/td[10]/a/i"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).
		 * click(); if
		 * (driver.findElement(By.xpath("//button[contains(text(),'OK')]")).isDisplayed(
		 * )) { driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		 * } driver.findElement(By.xpath(
		 * "//body/div[4]/md-dialog[1]/md-dialog-actions[1]/button[1]/span[1]")).click()
		 * ; driver.findElement(By.xpath(
		 * "/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/md-tabs/md-tabs-content-wrapper/md-tab-content[4]/div/md-content/table/tbody[1]/tr[4]/td/table/tbody/tr[1]/td[10]/a/i"
		 * )) .click(); driver.findElement(By.xpath(
		 * "//body/div[4]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		 * Thread.sleep(3000); driver.navigate().back();
		 */
//********************************PMS*********************************************		

		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[5]/span[1]"
		 * )) .click(); Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,1000)");
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); Thread.sleep(3000);
		 * jse.executeScript("window.scrollBy(0,1000)"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[5]/div[1]/md-content[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click
		 * (); driver.findElement(By.xpath(
		 * "/html/body/div[4]/md-dialog/md-dialog-actions/button")).click();
		 */
//********************************PROTECTION*********************************************		

		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-wrapper[1]/md-tabs-canvas[1]/md-pagination-wrapper[1]/md-tab-item[6]/span[1]"
		 * )) .click(); Thread.sleep(5000); JavascriptExecutor jse =
		 * (JavascriptExecutor) driver; jse.executeScript("window.scrollBy(0,1000)");
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]/i[1]"
		 * )) .click(); Thread.sleep(3000);
		 * jse.executeScript("window.scrollBy(0,1000)"); Thread.sleep(3000);
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Trxn Details')]")).click
		 * (); driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/md-tabs[1]/md-tabs-content-wrapper[1]/md-tab-content[6]/div[1]/md-content[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]"
		 * )) .click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Nominee Details')]")).
		 * click();
		 * driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		 * 
		 */
//********************************MemberWiseInvestment********************************
		/*
		 * Thread.sleep(5000); List<WebElement> list1 = driver.findElements(By.xpath(
		 * "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"
		 * )); Thread.sleep(3000); list1.get(0).click(); driver.findElement( By.xpath(
		 * "//body/div[@id='select_container_3']/md-select-menu[1]/md-content[1]/md-option[2]/div[1]"
		 * )) .click();
		 */

//****************************************View Progress In Goals******************************************************************************	
//View Progress In Goals
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-radio-group[1]/md-radio-button[2]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/span[1]"))
				.click();

	}

}

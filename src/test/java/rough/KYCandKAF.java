/*
 * package rough;
 * 
 * import java.awt.AWTException; import java.awt.Robot; import java.awt.Toolkit;
 * import java.awt.datatransfer.StringSelection; import java.awt.event.KeyEvent;
 * import java.util.List; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class KYCandKAF { public static void main(String[] args)
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); Robot robot
 * = new Robot(); // New KYC Thread.sleep(12000); driver.findElement(By.xpath(
 * "//div[contains(@class,'col-md-4')]//div[5]//div[2]//a[1]//img[1]")).click();
 * Thread.sleep(3000); if (driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a"
 * )) .isDisplayed()) { Thread.sleep(3000); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/div/a"
 * )) .click();
 * 
 * driver.findElement(By.xpath(
 * "//*[@id=\"dialogContent_186\"]/md-dialog-actions/button[2]")).click();
 * 
 * driver.navigate().back(); Thread.sleep(3000); driver.findElement(By.xpath(
 * "//div[contains(@class,'col-md-4')]//div[5]//div[2]//a[1]//img[1]")).click();
 * 
 * }
 * 
 * // Basic Details
 * 
 * driver.findElement( By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div[3]/div[2]/a"
 * )).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/table/tbody/tr/td/md-input-container/input"
 * )) .sendKeys(pan);
 * driver.findElement(By.xpath("//a[contains(text(),'Check your KYC status')]"))
 * .click();
 * 
 * Thread.sleep(3000); driver.findElement(By.xpath(
 * "/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();
 * 
 * WebElement mobilenumber = driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div/div[2]/table/tbody/tr[2]/td[2]/md-input-container/input"
 * )); mobilenumber.clear(); mobilenumber.sendKeys("8368264851");
 * driver.findElement( By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[3]/div/div/div[3]/div[2]/a[2]"
 * )).click();
 * 
 * // upload Pan
 * 
 * driver.findElement(By.id("panfilediv")).click(); robot.setAutoDelay(3000);
 * StringSelection sel = new
 * StringSelection("E:\\SeleniumCodeFile\\testPan.png");
 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_CONTROL);
 * robot.keyPress(KeyEvent.VK_V);
 * 
 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
 * 
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_ENTER);
 * 
 * robot.keyRelease(KeyEvent.VK_ENTER);
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[4]/div/div/div[3]/div[2]/a"
 * )) .click();
 * 
 * WebElement panName = driver.findElement(By.xpath(
 * "/html/body/div[4]/md-dialog/md-dialog-content/md-content/div[1]/div[2]/md-input-container/input"
 * )); panName.clear(); panName.sendKeys("Test Auto Pan Name");
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();
 * 
 * // Upload Aadhar
 * 
 * driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div[1]/div[1]/img[1]")).
 * click(); robot.setAutoDelay(3000); StringSelection sel02 = new
 * StringSelection("E:\\SeleniumCodeFile\\adharFront.jpeg");
 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel02, null);
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_CONTROL);
 * robot.keyPress(KeyEvent.VK_V);
 * 
 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
 * 
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_ENTER);
 * 
 * robot.keyRelease(KeyEvent.VK_ENTER);
 * driver.findElement(By.xpath("//tbody/tr[3]/td[1]/div[1]/div[1]/img[1]")).
 * click(); robot.setAutoDelay(3000); StringSelection sel01 = new
 * StringSelection("E:\\SeleniumCodeFile\\adharBack.jpeg");
 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel01, null);
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_CONTROL);
 * robot.keyPress(KeyEvent.VK_V);
 * 
 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
 * 
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_ENTER);
 * 
 * robot.keyRelease(KeyEvent.VK_ENTER);
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[5]/div/div/div[3]/div[2]/a"
 * )) .click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[4]/md-dialog/md-dialog-actions/button[2]")).click();
 * 
 * // Personal Details
 * 
 * List<WebElement> list1 = driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[1]/td[1]/md-input-container/md-select"
 * )); list1.get(0).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[4]/md-select-menu/md-content/md-option[1]/div")).click();
 * 
 * List<WebElement> list2 = driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[1]/td[2]/md-input-container/md-select"
 * )); list2.get(0).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[5]/md-select-menu/md-content/md-option[2]/div")).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[2]/td/md-input-container/input"
 * )) .sendKeys("test Mother"); List<WebElement> list3 =
 * driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[3]/td[1]/md-input-container/md-select"
 * )); list3.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
 * "/html/body/div[6]/md-select-menu/md-content/md-option[2]")).click();
 * 
 * List<WebElement> list4 = driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[3]/td[2]/md-input-container/md-select"
 * )); list4.get(0).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[7]/md-select-menu/md-content/md-option[1]/div")).click();
 * 
 * List<WebElement> list5 = driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[4]/td[1]/md-input-container/md-select"
 * )); list5.get(0).click(); Thread.sleep(3000); driver.findElement(By.xpath(
 * "/html/body/div[8]/md-select-menu/md-content/md-option[3]")).click();
 * 
 * List<WebElement> list6 = driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[4]/td[2]/md-input-container/md-select"
 * )); list6.get(0).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[9]/md-select-menu/md-content/md-option[1]/div")).click();
 * 
 * // Nominee driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[5]/td/md-checkbox/div[2]"
 * )) .click(); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[7]/td[1]/md-input-container/input"
 * )) .sendKeys("Test Nominee"); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[7]/td[2]/md-input-container/input"
 * )) .sendKeys("Test Relation"); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[8]/td[1]/md-input-container/input"
 * )) .sendKeys("10/06/1997"); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[2]/table/tbody/tr[8]/td[2]/md-input-container/input"
 * )) .sendKeys("100"); Thread.sleep(5000); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[6]/div/div/div[3]/div[2]/a"
 * )) .click();
 * 
 * // Bank Account
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[1]/td[1]/md-input-container/input"
 * )) .sendKeys("HDFC0001069"); Thread.sleep(3000); driver.findElement(By.
 * xpath("//button[@class='swal-button swal-button--confirm']")).click();
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[1]/td[2]/md-input-container/input"
 * )) .sendKeys("50100370135211");
 * 
 * List<WebElement> lista = driver.findElements(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[2]/td[1]/md-input-container/md-select"
 * )); lista.get(0).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[11]/md-select-menu/md-content/md-option[1]/div")).click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[4]/table/tbody/tr[3]/td[1]/md-input-container/input"
 * )) .sendKeys("Sandeep");
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[5]/div[2]/a"
 * )) .click();
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[12]/md-dialog/md-dialog-actions/button[2]")).click();
 * 
 * Thread.sleep(3000);
 * 
 * double val1 = 1.00;
 * 
 * for (int i = 0; i < 13; i++) { driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[6]/table/tbody/tr/td/md-input-container/input"
 * )) .sendKeys(String.valueOf(val1)); driver.findElement( By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[7]/div[2]/a"
 * )) .click(); Thread.sleep(3000); try { if
 * (driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/button")).
 * isDisplayed())
 * 
 * {
 * driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/button")).click
 * (); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[7]/div/div/div[6]/table/tbody/tr/td/md-input-container/input"
 * )) .clear();
 * 
 * val1 = val1 + 0.01; } else { System.out.print("Mahdev"); break; } } catch
 * (Exception e) { System.out.print("Mahdev"); break;
 * 
 * }
 * 
 * } // Upload Sign driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[9]/div/div/div[2]/table/tbody/tr/td/div/div/img"
 * )) .click(); robot.setAutoDelay(2000); StringSelection sel8 = new
 * StringSelection("E:\\SeleniumCodeFile\\sign.jpg");
 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel8, null);
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_CONTROL);
 * robot.keyPress(KeyEvent.VK_V);
 * 
 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
 * 
 * robot.setAutoDelay(2000); robot.keyPress(KeyEvent.VK_ENTER);
 * 
 * robot.keyRelease(KeyEvent.VK_ENTER);
 * 
 * driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[9]/div/div/div[4]/div[2]/a"
 * )) .click(); Thread.sleep(15000); driver.findElement( By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[10]/div/div/div[3]/div[2]/a[3]"
 * )) .sendKeys(Keys.DOWN); driver.findElement( By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[10]/div/div/div[3]/div[2]/a[3]"
 * )) .click(); Thread.sleep(3000); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div[2]/div/div/div/div/div/div[11]/div/div/div[3]/div[2]/a"
 * )) .click();
 * 
 * }
 * 
 * }
 */
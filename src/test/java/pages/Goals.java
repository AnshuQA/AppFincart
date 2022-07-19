package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;

public class Goals extends BaseTest {
	public void setNewGoalButton() throws InterruptedException {
		Thread.sleep(9000);
		JavascriptExecutor newgoal = (JavascriptExecutor) driver;
		WebElement setgoal = driver.findElement(By.linkText("Set New Goals"));
		newgoal.executeScript("arguments[0].scrollIntoView(true);", setgoal);
		setgoal.click();
	}

	public void goalButton() throws InterruptedException {
		Thread.sleep(15000);
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.linkText("Goals"));
		je1.executeScript("arguments[0].scrollIntoView(true);", element1);
		element1.click();
		driver.navigate().refresh();

	}

	public void addHomeGoal() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("18000000");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[3]/span")).click();

		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

	}

	public void addChildEducationGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(3000);

		List<WebElement> list1 = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table[1]/tbody/tr[2]/td"));
		list1.get(0).click();

		driver.findElement(By.xpath("//*[@id=\"select_option_46\"]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_29\"]")).sendKeys("Chota Tester");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table[1]/tbody/tr[20]/td/md-input-container/md-datepicker/button"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"md-1-year-2023-11-1\"]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[6]/md-dialog/md-dialog-actions/button[3]/span")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addYourEducationGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div/div[2]/a")).click();
		Thread.sleep(3000);
		List<WebElement> list2 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/md-select[1]"));
		list2.get(0).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"select_option_77\"]/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/table[1]/tbody/tr[20]/td/md-input-container/md-datepicker/button"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"md-2-year-2023-10-1\"]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[6]/md-dialog/md-dialog-actions/button[3]/span")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addCargoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[7]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("7500000");
		Thread.sleep(3000);
		WebElement car = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		car.click();
		car.clear();
		car.sendKeys("2030-02-06");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-actions[1]/button[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addTravellPlanGaol() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[5]/div/div[2]/a")).click();
		Thread.sleep(3000);
		List<WebElement> list3 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/md-input-container[1]/md-select[1]"));
		list3.get(0).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[3]/div[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[12]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("8");
		Thread.sleep(5000);
		WebElement travell = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		travell.click();
		travell.clear();
		travell.sendKeys("2030-02-06");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-actions[1]/button[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addChildWeddingGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[6]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("Chota Tester wedding");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("1800000");
		Thread.sleep(3000);
		WebElement childwedding = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		childwedding.click();
		childwedding.clear();
		childwedding.sendKeys("2030-02-06");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-actions[1]/button[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addBikeGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("125000");
		Thread.sleep(5000);
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/button[1]")).click();

		WebElement drop = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		drop.click();
		drop.clear();
		drop.sendKeys("2022-02-06");
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div/div/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]/span")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/button[1]")).click();
	}

	public void addYourWeddingGoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("1300000");
		Thread.sleep(3000);
		WebElement ourwedding = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		ourwedding.click();
		ourwedding.clear();
		ourwedding.sendKeys("2030-02-06");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]/span")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addFamilyPlanningGaol() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[9]/div/div[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("2500000");
		Thread.sleep(3000);
		WebElement family = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		family.click();
		family.clear();
		family.sendKeys("2030-02-06");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-actions[1]/button[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addSabbatialGaol() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[10]/div/div[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20000");
		Thread.sleep(3000);
		WebElement sub = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[18]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		sub.click();
		sub.clear();
		sub.sendKeys("2022-02-06");
		Thread.sleep(3000);
		WebElement sab = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		sab.click();
		sab.clear();
		sab.sendKeys("2030-02-06");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		;
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]/span")).click();

		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addReatirmentgoal() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[11]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("40");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("3000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/md-dialog[1]/md-dialog-actions[1]/button[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

	}

	public void addNewBusiness() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[12]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("10000000");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("500000");
		Thread.sleep(3000);
		WebElement business = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		business.click();
		business.clear();
		business.sendKeys("2022-02-06");
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]/span")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addOtherGaol() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[13]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("Test Other");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("850000");
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement other = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		other.click();
		other.clear();
		other.sendKeys("2022-02-06");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[3]/span")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void addHealthCreation() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[14]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"))
				.sendKeys("1450000");
		Thread.sleep(3000);
		WebElement other = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		other.click();
		other.clear();
		other.sendKeys("2022-02-06");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/md-dialog-actions[1]/button[3]/span[1]"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}

	public void completeProfileButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/a[1]/h4[1]"))
				.click();

	}

	public void investButton() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[2]/a[1]/h4[1]"))
				.click();

//Recomeded scheme	    
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]"))
				.click();
//Search Scheme
		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-select[1]"));
		list.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/md-select-menu[1]/md-content[1]/md-option[14]/div[1]"))
				.click();
		Thread.sleep(3000);

		List<WebElement> list1 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/md-input-container[1]/md-select[1]"));
		list1.get(0).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/md-select-menu[1]/md-content[1]/md-option[2]")).click();
		driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	}

	public void monthlyAddinCart() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[1]"))
				.click();

		Thread.sleep(3000);

		List<WebElement> list3 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-content[1]/div[5]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]"));
		list3.get(0).click();

		driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[3]")).click();

		Thread.sleep(3000);

		List<WebElement> list4 = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-content[1]/div[6]/md-input-container[1]/md-select[1]/md-select-value[1]/span[1]/div[1]"));
		list4.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[8]/md-select-menu[1]/md-content[1]/md-option[9]/div[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-content[1]/div[8]/md-input-container[1]/input[1]"))
				.sendKeys("1200");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-dialog[1]/md-dialog-actions[1]/button[2]/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/div/button")).click();

	}

	public void oneTimeAddincart() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/md-card[1]/md-card-actions[1]/button[2]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"input_116\"]")).sendKeys("1100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[6]/md-dialog/md-dialog-actions[1]/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div/button")).click();
	}

	public void makePaymentBtn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[6]/md-dialog/md-dialog-actions[2]/a")).click();
	}

	public void removeAllGoal() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		for (int i = 0; i < 13; i++) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		}
	}

	public void removeOneGoal() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[5]/div[1]/a/h4"))
				.click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
}

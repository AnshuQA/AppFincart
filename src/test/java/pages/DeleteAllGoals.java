package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class DeleteAllGoals extends BaseTest {
	public void goalButton() throws InterruptedException {
		Thread.sleep(11000);
		driver.findElement(By.linkText("Goals")).click();
	}

//House
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
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[2]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
	}
}

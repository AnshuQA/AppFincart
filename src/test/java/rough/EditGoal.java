package rough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditGoal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.fincart.com/user/login/");
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/input[1]"))
				.sendKeys("testweb16may22@gmail.com");
		driver.findElement(By.xpath(
				"//body/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[1]/input[1]"))
				.sendKeys("12345678");
		driver.findElement(By.xpath("//div[contains(text(),'Lets Go')]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div/div/div[1]/div/div[3]/div")).click();
		Thread.sleep(9000);

		driver.findElement(By.linkText("Goals")).click();
//10.Retirement
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"div.ng-scope div.wrapper.ng-scope div.main-panel div.content div.ng-scope div.container-fluid.ng-scope div.row div.col-md-6.ng-scope:nth-child(1) div.card.card-chart div.card-body:nth-child(1) div.pull-right > a:nth-child(1)"))
				.click();
		Thread.sleep(4000);
		WebElement retairment = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/md-input-container[1]/input[1]"));
		retairment.clear();
		retairment.sendKeys("23");
		Thread.sleep(4000);
		WebElement retairmentY = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[1]/md-input-container[1]/input[1]"));
		retairmentY.clear();
		retairmentY.sendKeys("45");
		Thread.sleep(4000);
		WebElement retairmentA = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"));
		retairmentA.clear();
		retairmentA.sendKeys("3500");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button[4]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("Retairment added sucessfully");
//1.House
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(4000);
		WebElement house = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		house.clear();
		house.sendKeys("1200000");
		Thread.sleep(3000);
		WebElement houseg = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		houseg.click();
		houseg.clear();
		houseg.sendKeys("2023-02-06");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Update & Transact')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("House added sucessfully");

//2.Your Wedding
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"div.ng-scope div.wrapper.ng-scope div.main-panel div.content div.ng-scope div.container-fluid.ng-scope div.row div.col-md-6.ng-scope:nth-child(1) div.card.card-chart div.card-body:nth-child(1) div.pull-right > a:nth-child(1)"))
				.click();
		Thread.sleep(4000);
		WebElement mywed = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		mywed.clear();
		mywed.sendKeys("1500000");
		Thread.sleep(4000);
		WebElement myweding = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		myweding.clear();
		myweding.sendKeys("2024-12-06");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("your wedding added sucessfully");

//3.Bike
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"div.ng-scope div.wrapper.ng-scope div.main-panel div.content div.ng-scope div.container-fluid.ng-scope div.row div.col-md-6.ng-scope:nth-child(9) div.card.card-chart div.card-body:nth-child(1) div.pull-right > a:nth-child(1)"))
				.click();
		Thread.sleep(4000);
		WebElement bike = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		bike.clear();
		bike.sendKeys("1850000");
		Thread.sleep(4000);
		WebElement bikeD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		bikeD.clear();
		bikeD.sendKeys("2028-12-06");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("bike added sucessfully");

//4.Car
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"div.ng-scope div.wrapper.ng-scope div.main-panel div.content div.ng-scope div.container-fluid.ng-scope div.row div.col-md-6.ng-scope:nth-child(5) div.card.card-chart div.card-body:nth-child(1) div.pull-right > a:nth-child(1)"))
				.click();
		Thread.sleep(4000);
		WebElement car = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		car.clear();
		car.sendKeys("975500");
		Thread.sleep(3000);
		WebElement carcal = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		carcal.click();
		carcal.clear();
		carcal.sendKeys("2024-12-06");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("Car added sucessfully");

//5.Child Wedding
		Thread.sleep(3000);
		List<WebElement> childw = driver.findElements(By.linkText("Edit"));
		childw.get(4).click();

		Thread.sleep(5000);
		WebElement wedding = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		wedding.clear();
		wedding.sendKeys("Wedding Goal update");
		Thread.sleep(4000);
		WebElement weddingP = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		weddingP.clear();
		weddingP.sendKeys("1850000");
		Thread.sleep(4000);
		WebElement weddingD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		weddingD.clear();
		weddingD.sendKeys("2040-12-06");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("child wedding added sucessfully");

//6.Business
		Thread.sleep(3000);
		List<WebElement> bus = driver.findElements(By.linkText("Edit"));
		bus.get(5).click();
		Thread.sleep(4000);
		WebElement business = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		business.clear();
		business.sendKeys("20000000");
		Thread.sleep(4000);
		WebElement businessA = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"));
		businessA.clear();
		businessA.sendKeys("780000");
		Thread.sleep(4000);

		WebElement businessD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		businessD.clear();
		businessD.sendKeys("2040-12-06");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("Business added sucessfully");

		// 7.Wealth
		Thread.sleep(3000);
		List<WebElement> wea = driver.findElements(By.linkText("Edit"));
		wea.get(6).click();
		Thread.sleep(4000);
		WebElement wealthA = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		wealthA.clear();
		wealthA.sendKeys("47547544");
		Thread.sleep(4000);
		WebElement wealthD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		wealthD.clear();
		wealthD.sendKeys("2040-12-06");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("wealth  updated sucessfully");

//8.Familyplanning
		Thread.sleep(3000);
		List<WebElement> famiP = driver.findElements(By.linkText("Edit"));
		famiP.get(7).click();
		Thread.sleep(4000);
		WebElement familyP = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		familyP.clear();
		familyP.sendKeys("3500000");
		Thread.sleep(4000);
		WebElement familyPla = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		familyPla.clear();
		familyPla.sendKeys("2040-12-06");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("family plannig added sucessfully");

		// 9.Sabbatical
		Thread.sleep(3000);
		List<WebElement> sab = driver.findElements(By.linkText("Edit"));
		sab.get(8).click();
		Thread.sleep(4000);
		WebElement sabA = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[1]/md-input-container[1]/input[1]"));
		sabA.clear();
		sabA.sendKeys("500");
		Thread.sleep(4000);
		WebElement sabSD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[18]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		sabSD.clear();
		sabSD.sendKeys("2020-12-06");
		Thread.sleep(4000);
		WebElement sabED = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		sabED.clear();
		sabED.sendKeys("2040-12-06");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("subbatical added sucessfully");

		// 11.Child study
		Thread.sleep(3000);
		List<WebElement> chils = driver.findElements(By.linkText("Edit"));
		chils.get(10).click();
		Thread.sleep(4000);
		WebElement childS = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]/md-input-container[1]/input[1]"));
		childS.clear();
		childS.sendKeys("Wedding Goal update");
		Thread.sleep(4000);
		WebElement childD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		childD.clear();
		childD.sendKeys("2034-12-06");

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

//12.Your Study
		Thread.sleep(3000);
		List<WebElement> ystu = driver.findElements(By.linkText("Edit"));
		ystu.get(11).click();
		Thread.sleep(3000);
		WebElement yourStudy = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		yourStudy.clear();
		yourStudy.sendKeys("2033-10-31");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("Your study added sucessfully");

//13.Travel 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"div.ng-scope div.wrapper.ng-scope div.main-panel div.content div.ng-scope div.container-fluid.ng-scope div.row div.col-md-6.ng-scope:nth-child(2) div.card.card-chart div.card-body:nth-child(1) div.pull-right > a:nth-child(1)"))
				.click();
		WebElement travell = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[12]/td[1]/md-input-container[1]/input[1]"));
		travell.clear();
		travell.sendKeys("6");
		WebElement travellD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		travellD.clear();
		travellD.sendKeys("2035-12-06");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		System.out.println("Travell added sucessfully");

		// 14.other Goal
		Thread.sleep(3000);
		List<WebElement> othe = driver.findElements(By.linkText("Edit"));
		othe.get(13).click();
		Thread.sleep(3000);
		WebElement otherN = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/md-input-container[1]/input[1]"));
		otherN.clear();
		otherN.sendKeys("IPHONE 11 Pro");
		Thread.sleep(3000);
		WebElement otherA = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[14]/td[1]/md-input-container[1]/input[1]"));
		otherA.clear();
		otherA.sendKeys("125500");
		Thread.sleep(3000);
		WebElement otherD = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[20]/td[1]/md-input-container[1]/md-datepicker[1]/div[1]/input[1]"));
		otherD.clear();
		otherD.sendKeys("2033-10-31");
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/md-dialog-actions/button[4]/span")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();

	}
}

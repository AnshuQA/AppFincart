package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DbManager;
import utilities.ExcelReader;


public class BaseTest {
	
	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			
			return true;
		} catch (Throwable t) {

			return false;
		}

	}

	
	
	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\excel\\testdata.xlsx");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(BaseTest.class.getName());
	
	public static WebDriverWait wait;
	public static WebElement dropdown;
	
	
	
	
	
	
	
	
	
	
	public void openBrowser(String browserName) {
		
		
		
	}
	
	
	@BeforeSuite
	public void setUp()  {
		
		if(driver == null) {
			
			Date d = new Date();
			 System.setProperty("current.date",d.toString().replace(":","_").replace(" ", "_"));
		
			PropertyConfigurator.configure(".//src//test//resources//properties//log4j.properties");
			
				try {
					fis = new FileInputStream(".//src//test//resources//properties//Config.properties");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			try {
				Config.load(fis);
				log.info("Config properties loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				fis = new FileInputStream(".//src//test//resources//properties//OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				OR.load(fis);
				log.info("OR properties loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(Config.getProperty("browser").equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				log.info("Launching Firefox");
				
			}else if(Config.getProperty("browser").equals("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				log.info("Launching Chrome");
				
			}else if(Config.getProperty("browser").equals("ie")) {
				
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				log.info("Launching IE");
				
			}
		
		else if(Config.getProperty("browser").equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
			
		}
			
			driver.get(Config.getProperty("testsiteurl"));
			log.info("Navigating to : "+Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,Integer.parseInt(Config.getProperty("explicit.wait")));
		
			
		
		}
		
		
		
	}
	
	
	
		
	}
	



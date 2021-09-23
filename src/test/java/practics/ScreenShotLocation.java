package practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShotLocation extends BaseTest {
	@Test
	public void addLocation() {
		
		
		Reporter.log("<a href=\"C:\\Users\\SINGH\\Downloads\\Document\\adharBack.jpg\" target=\"_blank\">Capture Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\SINGH\\Downloads\\Document\\adharBack.jpg\" target=\"_blank\"><img height=200 width=200 src=\"C:\\Users\\SINGH\\Downloads\\Document\\adharBack.jpg\"></a>");
		
	}
}

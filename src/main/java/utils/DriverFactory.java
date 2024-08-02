package utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import cucumber.api.Scenario;

public class DriverFactory {
	public static WebDriver driver = null;
	private static WebDriverWait wait = null;
	private final static int TIME_ELEMENT = 30;
	
	@BeforeClass
	public static WebDriver getChromeDriver() {
		if (driver == null) {
			//System.setProperty("webdriver.chrome.driver","./src\\test\\resources\\drives\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\drivers\\chromedriver.exe");
	
			//driver = new FirefoxDriver();

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(TIME_ELEMENT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TIME_ELEMENT, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	@SuppressWarnings("deprecation")
	public static WebDriverWait getWebDriverWait() {
		wait = new WebDriverWait(getChromeDriver(), TIME_ELEMENT);
		return wait;
	}
  //  @After(order = 0, value = {"@funcionais"})
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
//	@After(order = 1, value = {"@funcionais"})
	public void screenshort(Scenario cenario) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(file, new File("target/screenshort/+cenario+.getid().jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package br.tmf.steps;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
	
	public static WebDriver getChromeDriver() {
		
			System.setProperty("webdriver.chrome.driver","./src\\main\\resources\\drives\\chromedriver.exe");
			// System.setProperty("webdriver.gecko.driver",".\\src\\main\\resources\\drives\\geckodriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			getChromeDriver().navigate().to("https://www.google.com.br");
			return driver;
			

	}
}

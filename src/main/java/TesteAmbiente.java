import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAmbiente {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chromedriver.driver", "/src\\test\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src\\test\\resources\\drivers\\geckodriver.exe");
		

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://jumptreinamentos.com.br");
		//driver.navigate().to("https://srbarriga.herokuapp.com");
	}

}

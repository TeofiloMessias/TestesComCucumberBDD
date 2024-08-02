package pageobjects;

import org.junit.BeforeClass;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	private By inputEmail = By.id("email");
	private By inputPassword = By.id("senha");
	private By botaoEntrar = By.tagName("button");
	private By resetarBanco = By.xpath("//a[@href='/reset']");

	public void toURL() {

		getDriver().navigate().to("https://seubarriga.wcaquino.me/login");
	}

	public void realizaLogin(String email, String senha) {

		
		getDriver().findElement(inputEmail).sendKeys(email);
		getDriver().findElement(inputPassword).sendKeys(senha);
		getDriver().findElement(botaoEntrar).click();

	}
	
		
		@BeforeClass	
		public void reset() {		
		
			getDriver().findElement(resetarBanco).click();
		   }
    }

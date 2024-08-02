package pageobjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	private By resetBanco = By.linkText("reset");
	
	
	public void resetarBanco() {

		getDriver().findElement(resetBanco).click();
	}

}

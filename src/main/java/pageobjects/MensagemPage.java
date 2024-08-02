package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class MensagemPage extends BasePage {
	//private By msn = By.xpath("//span[contains(.,'Bem vindo, zazu!')]");
	private By msn =(By.xpath("//div[@class='alert alert-success']"));
	private By contMNome = (By.xpath("//div[starts-with(@class,alert alert-']"));
		
	
	public void validarMensagemLogin() {		
		String msnLogin = getDriver().findElement(msn).getText();

		Assert.assertEquals(msnLogin, "Bem vindo, zazu!");

	}
	public void contaMesmoNome(String arg1) {
		String msnConta = getDriver().findElement(contMNome).getText();
		Assert.assertEquals(arg1, msnConta);
		
	}

}

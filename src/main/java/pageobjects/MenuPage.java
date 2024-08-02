package pageobjects;

import org.openqa.selenium.By;

public class MenuPage extends BasePage {
	LoginPage loginpage = new LoginPage();
	
	private By home = By.id("email");
	private By adicionarContar = By.id("email");
	private By listarContas = By.id("email");
	private By criarMovimentacao = By.id("email");
	private By resumoMensal = By.id("email");
	private By sair = By.id("email");
	
	
	public void home(){
		getDriver().findElement(home).click();
		
	}
	public void adicionarContar(){
		getDriver().findElement(adicionarContar).click();
		
	}
	public void listarContas() {
		getDriver().findElement(listarContas).click();
	}
	public void criarMovimentacao(){
		getDriver().findElement(criarMovimentacao).click();
		
	}
	public void resumoMensal(){
		getDriver().findElement(resumoMensal).click();
		
	}
	public void sair(){
		getDriver().findElement(sair).click();
		
	}
}

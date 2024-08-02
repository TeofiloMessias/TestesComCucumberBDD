package br.tmf.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageobjects.BasePage;
import pageobjects.LoginPage;
import pageobjects.MensagemPage;
import sun.security.util.PendingException;

public class InserirContasSteps extends BasePage{
	LoginPage loginpage = new LoginPage();
	MensagemPage mensagempage = new MensagemPage();
	
	@Dado("^que estou acessando a aplicação$")
	public void que_estou_acessando_a_aplicação() throws Throwable {
		loginpage.toURL();
	}

	@Quando("^informo a conta Conta de Teste$")
	public void informoAContaContaDeTeste() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^recebo amensagem Conta adicionada com sucesso$")
	public void receboAmensagemContaAdicionadaComSucesso() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^informo a conta $")
	public void informoAConta() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^recebo amensagem Informe o nome da conta$")
	public void receboAmensagemInformeONomeDaConta() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^informo a conta Conta mesmo nome$")
	public void informoAContaContaMesmoNome() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^recebo amensagem Já existe uma conta com esse nome!$")
	public void receboAmensagemJáExisteUmaContaComEsseNome() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



	
	@Então("^recebo amensagem \"([^\"]*)\"$")
	public void receboAmensagem(String arg1) throws Throwable {
		mensagempage.contaMesmoNome(arg1);
	}
	@Quando("^seleciono Contas$")
	public void selecionoContas() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String arg1) throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}





}

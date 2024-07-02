package br.tmf.steps;

import core.LeitorProperties;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.BasePage;
import pageobjects.LoginPage;
import pageobjects.MensagemPage;


public class LoginSteps extends BasePage {
	LoginPage loginpage = new LoginPage();
	LeitorProperties dadosRestritos = new LeitorProperties();
	MensagemPage msn = new MensagemPage(); 
	 
	
	@Dado("^que o usuario esteja na pagina de login$")
	public void que_o_usuario_esteja_na_pagina_de_login() throws Throwable {
		
		loginpage.toURL();
	}

	@Quando("^o usuario preecher as credencias de acesso$")
	public void o_usuario_preecher_as_credencias_de_acesso(DataTable dataTable) throws Throwable {
		loginpage.realizaLogin(dadosRestritos.getProp("login.email"), dadosRestritos.getProp("login.senha"));
	}

	@Entao("^o usuario estara logado com sucesso$")
	public void o_usuario_estara_logado_com_sucesso() throws Throwable {
		msn.validarMensagemLogin();
	}
}

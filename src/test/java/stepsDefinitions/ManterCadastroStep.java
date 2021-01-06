package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.ManterUsuarioPage;
import pageObjects.TelaUsuariosPage;

public class ManterCadastroStep {
	
	BasePage BasePage = new BasePage();
	TelaUsuariosPage tp = new TelaUsuariosPage();
	ManterUsuarioPage mu = new ManterUsuarioPage();
	
	@Quando("acionar a aba Admin")
	public void acionarAAbaAdmin() {
	    BasePage.clicarAbaAdmin();
	}

	@Quando("clicar no usuario {string}")
	public void clicarNoUsuario(String nomeUsuario) {
	    tp.clicarNoUsuario(nomeUsuario);
	}

	@E("^acionar o botao EditSalvar$")
	public void acionarOBotaoEditSalvar() throws Throwable {
		Thread.sleep(2000);
		mu.clicarBotaoEditar();
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String nomeUsuario) {
	    mu.escreverNoCampoUsername(nomeUsuario);
	}

	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String nomeUsuario) throws Throwable {
		tp.validarUsuarioCadastrado(nomeUsuario);
	}


}

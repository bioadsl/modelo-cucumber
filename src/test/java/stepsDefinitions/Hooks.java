package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before(order = 1)
	public void suitUp(){ //logar com usario advogado
		acessarSistema();
	}
	
	@Before(order = 2, value = "@manterCadastro")
	public void fazerLogin(){ 
		LoginPage LoginPage = new LoginPage();
		LoginPage.realizarLogin();
	}
	
	@After()
	public void apagarUsuario() throws Exception {
		driver.quit();
	}

}

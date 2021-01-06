package stepsDefinitions;

import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.PendingException;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.BasePage;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	BasePage basePage = new BasePage();
	
	@Quando("eu informar o usuario {string}")
	public void eu_informar_o_usuario(String string) {
		loginPage.preencherUserName(string);
	}

	@Quando("informar a senha {string}")
	public void informar_a_senha(String string) {
		loginPage.preencherPassword(string);
		
	}

	@Quando("acionar o botao login")
	public void acionar_o_botao_login() {
		loginPage.acionarBotaoLogin();
	}

	@Entao("o sistema apresenta a mensagem {string}")
	public void o_sistema_apresenta_a_mensagem(String string) {
		loginPage.mostrarTextoRecuperado(string);
	}

	@Quando("^eu clicar no forgot$")
	public void euClicarNoForgot() throws Throwable {
		driver.findElement(By.xpath("Forgot your password?")).click();
	}

	@Entao("^o sistema apresenta no campo do usuario logado \"([^\"]*)\"$")
	public void oSistemaApresentaNoCampoDoUsuarioLogado(String string) throws Throwable {
		basePage.validarUsuarioLogado(string);
	}

	@Entao("^o sistema apresenta o logo do sino$")
	public void oSistemaApresentaOLogoDoSino() throws Throwable {
		basePage.validarIconeSino();
	}
	
}

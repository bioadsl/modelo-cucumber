package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManterUsuarioPage {
	
	public ManterUsuarioPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "btnSave")
	private WebElement botaoEditar_Salvar;
	
	@FindBy(name = "systemUser[userName]")
	private WebElement campoUsername;
	
	public void clicarBotaoEditar() {
		botaoEditar_Salvar.click();
	}
	
	public void escreverNoCampoUsername(String nomeUsuario) {
		campoUsername.clear();
		campoUsername.sendKeys(nomeUsuario);
	}
	
}

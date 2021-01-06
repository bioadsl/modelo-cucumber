package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TelaUsuariosPage {
	
	//Construtor
	public TelaUsuariosPage() {
		PageFactory.initElements(driver, this);
	}
	
	//ELMENTOS
//	@FindBy(xpath = "//tr//td//a")
//	private List<WebElement> nomesUsuarios;
	
	//METODOS
	public void clicarNoUsuario(String nomeUsuario) {
		WebElement usuario = driver.findElement(By.xpath("//a[.='" + nomeUsuario + "']"));
		usuario.click();
//		driver.findElement(By.xpath("//a[.='" + nomeUsuario + "']")).click(); tambem e possivel fazer assim
	}
	
	public void validarUsuarioCadastrado(String nomeUsuario) {
		
	assertTrue(driver.findElement(By.xpath("//a[.='" + nomeUsuario + "']")).isDisplayed());

//		
//		for (WebElement usuarioLista : nomesUsuarios) {
//			if(usuarioLista.getText().equals(nomeUsuario)) {
//				assertTrue(true);
//				break;
//			}	
//			
//			
//		}
		

	}

}

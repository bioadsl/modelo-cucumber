package stepsDefinitions;

import static utils.Utils.acessarSistema;

import io.cucumber.java.pt.Dado;

public class BaseSteps {
	
	@Dado("que eu acesse o sistema")
	public void que_eu_acesse_o_sistema() {
	    acessarSistema();
	}

}

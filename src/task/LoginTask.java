package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.LoginPageObject;

public class LoginTask {
	
	private String email;
	private String senha;
	
	private LoginPageObject login;
	
	public LoginTask(String email, String senha){
		this.email = email;
		this.senha = senha;
	}
	
	public void logar(WebDriver driver, WebDriverWait driverWait){
		
		login = new LoginPageObject(driver, driverWait);
		
		login.getUsuarioTextField().sendKeys(email);
		login.getSenhaTextField().sendKeys(senha);
		login.getSubmitButton().click();
		login.getAcessoButton().click();
		
	}

}

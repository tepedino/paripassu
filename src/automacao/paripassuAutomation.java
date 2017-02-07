package automacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import task.AplicacaoTask;
import task.LoginTask;

public class paripassuAutomation {

	private static String email = "augusto.tepedino@gmail.com";
	private static WebDriver driver = new FirefoxDriver();
	private static WebDriverWait driverWait = new WebDriverWait(driver, 15);
	private static LoginTask login = new LoginTask(email, "lnst9487974");
	private static AplicacaoTask aplicacao = new AplicacaoTask("Augusto Boehme Tepedino Martins", email);

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "*\\geckodriver.exe");
		String site = "https://acesso.paripassu.com.br/#/login";

		driver.get(site);

		login.logar(driver,driverWait);

		aplicacao.responderQuestionario(driver, driverWait);
	}

}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObject {
	WebDriver driver;
	WebDriverWait driverWait;

	public LoginPageObject(WebDriver driver, WebDriverWait driverWait) {
		this.driver = driver;
		this.driverWait = driverWait;
	}

	public WebElement getUsuarioTextField() {
		return driver.findElement(By.id("usuario"));
	}

	public WebElement getSenhaTextField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit-login"));
	}

	public WebElement getAcessoButton() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("sistemaComAcesso_54")));
	}

}

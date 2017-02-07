package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AplicacaoPageObject {
	WebDriver driver;
	WebDriverWait driverWait;

	public AplicacaoPageObject(WebDriver driver, WebDriverWait driverWait) {
		this.driver = driver;
		this.driverWait = driverWait;
	}

	public WebElement getListaQuestionarioButton() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='dropdown-toggle ng-binding' and contains(text(),'o de question')]")));
	}

	public WebElement getNovoQuestionarioButton() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'escolha-questionario')]")));
	}

	public WebElement getTesteButton() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(text(), 'Teste QA 2017 - 1')]")));
	}

	public WebElement getOpcaoTeste() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(text(),'Analista de Qualidade')]")));
	}

	public WebElement getNomeTextField() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Nome')]/../textarea[@placeholder='Digite o texto aqui']")));
	}

	public WebElement getEmailTextField() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'E-mail')]/../textarea[@placeholder='Digite o texto aqui']")));
	}

	public WebElement getProximoButton() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@ng-click='next()'][1]"))) ;
	}

	public WebElement getInteresseEmpresaTextField() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'interessado em trabalhar para esta empresa')]/../textarea")));
	}

	public WebElement getMotivoTrabalharQualidadeTextField() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'rea de qualidade de software')]/../textarea")));
	}

	public WebElement getComoLidaProblemasTextFiewld() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(), 'Como você lida com problemas')]/../textarea")));
	}

	public WebElement getSalvarButton() {
		return driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(), 'Salvar') and not(contains(text(), 'Salvar e finalizar'))][1]")));
	}
}

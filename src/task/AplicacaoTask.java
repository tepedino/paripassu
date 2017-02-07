package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.AplicacaoPageObject;

public class AplicacaoTask {

	private AplicacaoPageObject aplicacao;
	private String nomeCompleto;
	private String email;

	public AplicacaoTask(String nomeCompleto, String email) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}

	public void responderQuestionario(WebDriver driver, WebDriverWait driverWait) {
		aplicacao = new AplicacaoPageObject(driver, driverWait);

		aplicacao.getListaQuestionarioButton().click();
		aplicacao.getNovoQuestionarioButton().click();

		aplicacao.getTesteButton().click();
		aplicacao.getOpcaoTeste().click();

		aplicacao.getNomeTextField().sendKeys(nomeCompleto);
		aplicacao.getEmailTextField().sendKeys(email);
		aplicacao.getProximoButton().click();

		aplicacao.getInteresseEmpresaTextField().sendKeys("Para ampliar meus horizontes. Tenho trabalhado com qualidade de software em softwares de hospitais (e-SUS), bancos (Sicredi), empresas terceirizadas (DELL), e empresas de tecnologia (SPECTO Tecnologia). Uma empresa do ramo de alimentos seria interessante, mais desafios e aprendizado. Ouvi falar bem da empresa pelo meu amigo que trabalha nela.");
		aplicacao.getMotivoTrabalharQualidadeTextField().sendKeys("meu TCC foi baseado em testes automatizados. Antes dos semestres finais da faculdade, eu nao sabia o que queria, e consegui ume stagio como testador. a forma de trabalhar, a dieia de como trabalhar com testes me animou muito, re-ascendeu a chama de cientista da computacao, juntamente com a curiosidade sobre o que aconteceria se algo diferente fosse feito no sistema.");
		aplicacao.getComoLidaProblemasTextFiewld().sendKeys("Calma e analise. Um problema pode ser simples de encontrar, mas encontrar sua solucao pode nao ser trivial quanto se imagina. A todo problema existem varias formas de se resolver, basta analisarmos as opcoes e decidir a melhor.");

		aplicacao.getSalvarButton().click();

		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(), 'Salvar') and not(contains(text(), 'Salvar e finalizar'))][1]"))).click();
		//driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""))).click();

	}

}

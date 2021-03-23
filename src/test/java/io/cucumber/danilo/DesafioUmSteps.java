package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class DesafioUmSteps {
	
	public DesafioUmSteps() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		browser = new ChromeDriver();
	}
	
	public WebDriver browser;

	@Quando("eu acesso o site torne se um programador")
	public void eu_acesso_o_site_torne_se_um_programador() {
		browser.get("https://www.torneseumprogramador.com.br/");
	}

	@Quando("digito no campo de busca a palavra {string}")
	public void digito_no_campo_de_busca_a_palavra(String string) {
		WebElement input = browser.findElement( By.cssSelector("input[name='q']") );
		input.sendKeys(string);
	}

	@Quando("clico no botao buscar")
	public void clico_no_botao_buscar() {
		WebElement input = browser.findElement( By.cssSelector("ion-icon[name='search']") );
		input.click();
	}

	@Entao("devo ver o resultado na busca {string}")
	public void devo_ver_o_resultado_na_busca(String string) {
		String source = browser.getPageSource();
		source.contains("https://www.torneseumprogramador.com.br/busca?q="+string);
		
		/*assertEquals(true , browser.findElements( By.cssSelector(".div-card-aulas") ).size() > 0);*/	
				
		browser.quit();
	}
	
}

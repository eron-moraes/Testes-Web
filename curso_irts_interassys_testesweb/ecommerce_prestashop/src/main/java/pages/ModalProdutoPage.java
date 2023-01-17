package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ModalProdutoPage {

	private WebDriver driver;
	
	private By mansagemProdutoAdicionado = By.id("myModalLabel");
	

	public ModalProdutoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String obterMensagemProdutoAdicionado() {
		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
					.pollingEvery(Duration.ofSeconds(1))
					.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(mansagemProdutoAdicionado));

			return driver.findElement(mansagemProdutoAdicionado).getText();
	}
	
	
	
}

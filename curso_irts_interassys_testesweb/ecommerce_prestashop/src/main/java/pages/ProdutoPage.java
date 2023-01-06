package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {
	
	private WebDriver driver;
	
	private By nomeProduto = By.className("h1");
	private By precoProduto = By.cssSelector(".current-price span:nth-child(1)");
	
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String obterNomeProduto() {
		return driver.findElement(nomeProduto).getText();
	}
	
	public String obterPrecoProduto() {
		return driver.findElement(precoProduto).getText();
	}
}

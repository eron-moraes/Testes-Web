package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	List<WebElement> listaProdutos = new ArreyList();
	
	private By textoProdutosNoCarrinho = By.className("cart-products-count");
	private By produtos = By.className("product-description");
	private By descricoesDosProdutos = By.cssSelector(".product-description a");
	private By precoDosProdutos = By.className("price");
	private By botaoSignIn = By.cssSelector("#_desktop_user_info_sapn.hidden-sm-down");
	private By usuarioLogado = By.cssSelector("#_desktop_user_info_sapn.hidden-sm-down");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public int contarProdutos() {
		carregarListaProdutos();
		return listaProdutos.size();
	}
	
	private void carregarListaProdutos() {
		listaProdutos = driver.findElements(produtos);
	}
	
	public int obterQuantidadeProdutosNoCarrinho() {
		String quantidadeProdutosNoCarrinho = driver.findElement(textoProdutosNoCarrinho).getText();
		quantidadeProdutosNoCarrinho = quantidadeProdutosNoCarrinho.replace("(","");
		quantidadeProdutosNoCarrinho = quantidadeProdutosNoCarrinho.replace(")","");
		
		int qtdProdutosNoCarrinho = Integer.parseInt(quantidadeProdutosNoCarrinho);
		return qtdProdutosNoCarrinho;
	}
	
	public String obterNomeProduto(int indice) {
		return driver.findElements(descricoesDosProdutos).get(indice).getText();	
	}
	
	public String obterPrecoProduto(int indice) {
		return driver.findElements(precoDosProdutos).get(indice).getText();
	}
	
	public ProdutoPage clicarProduto(int indice) {
		driver.findElements(descricoesDosProdutos).get(indice).click();
		return new ProdutoPage(driver);
	}
	
	public LoginPage clicarBotaoSignIn() {
		driver.findElement(botaoSignIn).click();
		return new LoginPage(driver);
	}
	
	public boolean estaLogado(String texto) {
		driver.findElement(usuarioLogado).getText();
		return texto.contentEquals(driver.findElement(usuarioLogado).getText());
		}
	
}

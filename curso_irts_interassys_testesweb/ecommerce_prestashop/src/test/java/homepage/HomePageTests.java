package homepage;

import static org.hamcrest.Matcher.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import base.BaseTests;

public class HomePageTests extends BaseTests {

	@Test
	public void testContarProdutos_oitoProdutosDiferentes() {
		carregarPaginaInicial();
		assertThat(homePage.contarProdutos(), is(8));
	}

}

@Test 
public void testValidarCarrinhoZerado_ZeroItensNoCarrinho() {
	int produtosNoCarrinho = homePage.obterQuantidadeProdutosNoCarrinho();
	System.out.println(produtosNoCarrinho);
	assertThat(produtosNoCarrinho, is(0));
}
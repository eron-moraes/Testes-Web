package homepage;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import base.BaseTests;

public class HomePageTests extends BaseTests {

	@Test
	public void testContarProdutos_oitoProdutosDiferentes() {
		carregarPaginaInicial();
		assertThat(homePage.contarProdutos(), is(8));
	}



private Matcher is(int i) {
		// TODO Auto-generated method stub
		return null;
	}



@Test 
public void testValidarCarrinhoZerado_ZeroItensNoCarrinho() {
	int produtosNoCarrinho = homePage.obterQuantidadeProdutosNoCarrinho();
	System.out.println(produtosNoCarrinho);
	assertThat(produtosNoCarrinho, is(0));
}
}
	
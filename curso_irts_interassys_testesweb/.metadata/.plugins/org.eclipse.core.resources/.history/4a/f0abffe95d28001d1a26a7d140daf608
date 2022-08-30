package homepage;

import static org.hamcrest.MatherAssert.assertThat;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
public class HomePageTests extends BaseTests {

	@Test
	public void testContarProdutos_oitoProdutosDiferentes () {
		carregarPaginaInicial();
		assertThat(homePage.contarProdutos(), is(8));
	}
}

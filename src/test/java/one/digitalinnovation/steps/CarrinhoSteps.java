package one.digitalinnovation.steps;

import io.cucumber.java.pt.Então;
import one.digitalinnovation.pages.CarrinhoPage;
import one.digitalinnovation.util.Driver;
import io.cucumber.java.After;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class CarrinhoSteps {
    CarrinhoPage carrinhoPage;

    @After
    public void fecharNavegador(){
        Driver.getDriver().quit();
    }

    @Entao("o produto {string} deve estar presente no carrinho")
    public void oProdutoDeveEstarPresenteNoCarrinho(String nomeProduto) {
        carrinhoPage = new CarrinhoPage();
        String descricaoRetornada =  carrinhoPage.retornarDescricaoProduto();
        Assert.assertEquals(nomeProduto,descricaoRetornada);
    }

    @Então("o produto {string} deve possuir a quantidade {int}")
    public void oProdutoDevePossuirAQuantidade(String nomeProduto, int quantidade) {
        String quantidadeProduto = Integer.toString(quantidade);
        carrinhoPage = new CarrinhoPage();
        Assert.assertTrue("Não trouxe a quantidade ou produto esperado",
                carrinhoPage.produtoApresentouQuantidadeEsperada(nomeProduto,quantidadeProduto));
    }
}

package com.everis.steps;

import com.everis.pages.CarrinhoPage;
import com.everis.util.Driver;
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
    public void oProdutoDeveEstarPresenteNoCarrinho(String produto) {
        carrinhoPage = new CarrinhoPage();
        String descricaoRetornada =  carrinhoPage.retornarDescricaoProduto();
        Assert.assertEquals(produto,descricaoRetornada);
    }

}

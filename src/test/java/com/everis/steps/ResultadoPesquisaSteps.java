package com.everis.steps;

import com.everis.pages.ResultadoPesquisaPage;
import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {
    ResultadoPesquisaPage resultadoPesquisaPage;

    @Quando("adiciona o produto {string} ao carrinho")
    public void adicionaOProdutoAoCarrinho(String produto) {
        resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.adicionarAoCarrinho(produto);
    }

}

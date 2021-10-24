package com.digitalinnovation.steps;

import com.digitalinnovation.pages.ResultadoPesquisaPage;
import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {
    ResultadoPesquisaPage resultadoPesquisaPage;

    @Quando("adiciona o produto {string} ao carrinho")
    public void adicionaOProdutoAoCarrinho(String produto) {
        resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.adicionarAoCarrinho(produto);
    }

}

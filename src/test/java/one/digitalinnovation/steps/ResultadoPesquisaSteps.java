package one.digitalinnovation.steps;

import io.cucumber.java.pt.E;
import one.digitalinnovation.pages.ResultadoPesquisaPage;
import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {
    ResultadoPesquisaPage resultadoPesquisaPage;

    @Quando("adiciona o produto {string} ao carrinho")
    public void adicionaOProdutoAoCarrinho(String nomeProduto) {
        resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.adicionarAoCarrinho(nomeProduto);
    }

    @E("acessa o produto {string}")
    public void acessaOProduto(String nomeProduto) {
        resultadoPesquisaPage = new ResultadoPesquisaPage();
        resultadoPesquisaPage.acessarProduto(nomeProduto);
    }
}

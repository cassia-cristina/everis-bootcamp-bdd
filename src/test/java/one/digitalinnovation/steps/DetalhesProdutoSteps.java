package one.digitalinnovation.steps;

import io.cucumber.java.pt.E;
import one.digitalinnovation.pages.DetalhesProdutoPage;

public class DetalhesProdutoSteps {
    private DetalhesProdutoPage detalhesProdutoPage;

    @E("aumenta a quantidade")
    public void aumentaAQuantidade() {
        detalhesProdutoPage = new DetalhesProdutoPage();
        detalhesProdutoPage.aumentarQuantidadeProduto();
    }
}

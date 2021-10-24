package com.digitalinnovation.steps;

import com.digitalinnovation.pages.HomePage;
import com.digitalinnovation.util.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class HomeSteps {
    HomePage homePage;

    @Before
    public void inicializarDrive(){
        new Driver();
    }

    @Dado("que um usuario acessa o site {string}")
    public void queUmUsuarioAcessaOSite(String url) {
        Driver.getDriver().get(url);
    }

    @E("pesquisa pelo produto {string}")
    public void pesquisaPeloProduto(String produto) {
        homePage = new HomePage();
        homePage.pesquisarProduto(produto);
    }

}

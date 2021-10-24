package one.digitalinnovation.pages;

import one.digitalinnovation.maps.DetalhesProdutoMap;
import one.digitalinnovation.util.Driver;
import one.digitalinnovation.util.Screenshot;
import org.openqa.selenium.support.PageFactory;

public class DetalhesProdutoPage {
    DetalhesProdutoMap detalhesProdutoMap;

    public DetalhesProdutoPage() {
        detalhesProdutoMap = new DetalhesProdutoMap();
        PageFactory.initElements(Driver.getDriver(),detalhesProdutoMap);
    }

    public void aumentarQuantidadeProduto(){
        detalhesProdutoMap.btnAdicionar.click();
        Screenshot.gerarLog(Driver.getDriver(),"adiciona_mais_uma_quantidade");
    }



}

package one.digitalinnovation.pages;

import one.digitalinnovation.maps.HomeMap;
import one.digitalinnovation.util.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    HomeMap homeMap;

    public HomePage() {
        homeMap = new HomeMap();
        PageFactory.initElements(Driver.getDriver(),homeMap);
    }

    public void pesquisarProduto(String nomeProduto){
        homeMap.inputBusca.sendKeys(nomeProduto);
        homeMap.btnLupaBuscar.click();
    }

}

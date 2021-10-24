package com.digitalinnovation.pages;

import com.digitalinnovation.maps.HomeMap;
import com.digitalinnovation.util.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    HomeMap homeMap;

    public HomePage() {
        homeMap = new HomeMap();
        PageFactory.initElements(Driver.getDriver(),homeMap);
    }

    public void pesquisarProduto(String produto){
        homeMap.inputBusca.sendKeys(produto);
        homeMap.btnLupaBuscar.click();
    }

}

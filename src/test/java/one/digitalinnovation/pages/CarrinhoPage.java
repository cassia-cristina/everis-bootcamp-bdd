package com.digitalinnovation.pages;

import com.digitalinnovation.maps.CarrinhoMap;
import com.digitalinnovation.util.Driver;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPage {
    CarrinhoMap carrinhoMap;

    public CarrinhoPage() {
        carrinhoMap = new CarrinhoMap();
        PageFactory.initElements(Driver.getDriver(),carrinhoMap);
    }

    public String retornarDescricaoProduto(){
        return carrinhoMap.descricaoProduto.getText();
    }

}

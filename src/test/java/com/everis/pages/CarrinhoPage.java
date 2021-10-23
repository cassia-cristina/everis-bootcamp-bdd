package com.everis.pages;

import com.everis.maps.CarrinhoMap;
import com.everis.util.Driver;
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

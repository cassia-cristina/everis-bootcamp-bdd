package com.everis.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoMap {

    @FindBy(css = ".cart_description .product-name a")
    public WebElement descricaoProduto;

}

package com.everis.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultadoPesquisaMap {

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement btnAddCarrinho;

    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement btnProceedCheckout;

}

package com.digitalinnovation.pages;


import com.digitalinnovation.maps.ResultadoPesquisaMap;
import com.digitalinnovation.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResultadoPesquisaPage {
    ResultadoPesquisaMap resultadoPesquisaMap;

    public ResultadoPesquisaPage() {
        resultadoPesquisaMap = new ResultadoPesquisaMap();
        PageFactory.initElements(Driver.getDriver(),resultadoPesquisaMap);
    }

    public void adicionarAoCarrinho(String produto){
        WebElement nomeProd = Driver.getDriver().findElement(By.xpath("//*[@itemprop='name']/*[contains(text(), '" + produto + "')]"));
        Driver.moverParaElemento(nomeProd);
        resultadoPesquisaMap.btnAddCarrinho.click();
        Driver.visibilityOf(resultadoPesquisaMap.btnProceedCheckout);
        resultadoPesquisaMap.btnProceedCheckout.click();
    }


}

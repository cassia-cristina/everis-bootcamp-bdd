package one.digitalinnovation.pages;


import one.digitalinnovation.maps.ResultadoPesquisaMap;
import one.digitalinnovation.util.Driver;
import one.digitalinnovation.util.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResultadoPesquisaPage {
    ResultadoPesquisaMap resultadoPesquisaMap;

    public ResultadoPesquisaPage() {
        resultadoPesquisaMap = new ResultadoPesquisaMap();
        PageFactory.initElements(Driver.getDriver(), resultadoPesquisaMap);
    }

    public void adicionarAoCarrinho(String nomeProduto) {
        WebElement nomeProd = Driver.getDriver().findElement(By.xpath(".//*[@itemprop='name']/*[contains(text(), '" + nomeProduto + "')] | .//*[@itemprop='name'][text()='" + nomeProduto + "']"));
        Driver.moverParaElemento(nomeProd);
        resultadoPesquisaMap.btnAddCarrinho.click();
        Driver.visibilityOf(resultadoPesquisaMap.btnProceedCheckout);
        resultadoPesquisaMap.btnProceedCheckout.click();
        Screenshot.gerarLog(Driver.getDriver(),"adicionando_produto_no_carrinho");
    }

    public void acessarProduto(String nomeProduto) {
        WebElement nomeProd = Driver.getDriver().findElement(By.xpath("//a[@class='product-name'][@title='" + nomeProduto + "']"));
        nomeProd.click();
        Screenshot.gerarLog(Driver.getDriver(),"clica_no_produto");
    }
}

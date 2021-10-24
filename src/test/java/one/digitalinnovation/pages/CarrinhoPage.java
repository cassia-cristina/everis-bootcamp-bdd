package one.digitalinnovation.pages;

import one.digitalinnovation.maps.CarrinhoMap;
import one.digitalinnovation.util.Driver;
import one.digitalinnovation.util.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPage {
    CarrinhoMap carrinhoMap;

    public CarrinhoPage() {
        carrinhoMap = new CarrinhoMap();
        PageFactory.initElements(Driver.getDriver(),carrinhoMap);
    }

    public String retornarDescricaoProduto(){
        Screenshot.gerarLog(Driver.getDriver(),"produto_esta_no_carrinho");
        return carrinhoMap.descricaoProduto.getText();
    }

    public boolean produtoApresentouQuantidadeEsperada(String nomeProduto, String quantidadeEsperada){
        WebElement quantidadeRetornada = Driver.getDriver().findElement(
                By.xpath("//*[text()='" + nomeProduto + "']//ancestor::*[contains(@class, 'cart_item')]//*[contains(@class, 'cart_quantity_input')]")
        );
        boolean apresentouQuantidadeEsperada = quantidadeEsperada.equals(quantidadeRetornada.getAttribute("value"));

        if(apresentouQuantidadeEsperada){
            Screenshot.gerarLog(Driver.getDriver(),"apresentou_quantidade_esperada");
            return true;
        }
        return false;
    }

}

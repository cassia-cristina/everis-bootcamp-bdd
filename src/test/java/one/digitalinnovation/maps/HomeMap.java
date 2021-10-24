package one.digitalinnovation.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMap {

    @FindBy(id = "search_query_top")
    public WebElement inputBusca;

    @FindBy(name = "submit_search")
    public WebElement btnLupaBuscar;

}

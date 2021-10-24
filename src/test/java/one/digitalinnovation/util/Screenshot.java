package one.digitalinnovation.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.*;

public class Screenshot {

    public static void gerarLog(WebDriver driver, String descricaoTeste){
        String caminho = String.format("target/screenshots/%s_%s.png", descricaoTeste,Generator.dataHoraParaArquivo());
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(screenshot, new File(caminho));
        } catch (Exception e){
            System.out.println("Ocorreu um problema ao copiar o arquivo para a pasta destino: " + e.getMessage());
        }
    }
}

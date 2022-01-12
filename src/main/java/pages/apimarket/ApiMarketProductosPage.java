package pages.apimarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApiMarketProductosPage {
    private WebDriver webDriver;
    public ApiMarketProductosPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By transferenciasButton = By.xpath("//strong[contains(text(),'Transferencias')]");
    private By consultaSaldosButton = By.xpath("//strong[contains(text(),'Consulta de Saldos')]");

    public void clickOnTransferenciasButton(){
        WebElement element = webDriver.findElement(transferenciasButton);
        element.click();
    }

    public void clickOnConsultaSaldosButton() {
        WebElement element = webDriver.findElement(consultaSaldosButton);
        element.click();
    }




}

package pages.productoslinea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductosLineaPage {
    private WebDriver webDriver;

    public ProductosLineaPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By aperturaCuentaCard = By.xpath("//h2[contains(text(),'Apertura de Cuentas Online')]");
    private By solicitudCreditosCard = By.xpath("//h2[contains(text(),'Solicitud de Créditos')]");

    public void clickOnAperturaCuentaCardCard() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(aperturaCuentaCard));
        element.click();
    }
    public void clickOnSolicitudCreditosCardCardCard() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(solicitudCreditosCard));
        element.click();
    }
}

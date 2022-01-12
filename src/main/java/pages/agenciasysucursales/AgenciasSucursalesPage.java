package pages.agenciasysucursales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgenciasSucursalesPage {

    private WebDriver webDriver;
    public AgenciasSucursalesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By cityTitleText = By.xpath("//span[@id='titPagina']");

    private By pandoTextButton = By.xpath("//span[contains(text(),'PANDO')]");
    private By cochabambaTextButton = By.xpath("//span[contains(text(),'COCHABAMBA')]");
    private By laPazTextButton = By.xpath("//span[contains(text(),'LA PAZ')]");
    private By oruroTextButton = By.xpath("//span[contains(text(),'ORURO')]");
    private By potosiTextButton = By.xpath("//span[contains(text(),'POTOSI')]");
    private By santaCruzTextButton = By.xpath("//span[contains(text(),'SANTA CRUZ')]");

    public void clickOnPandoTextButton() {
        WebElement element = webDriver.findElement(pandoTextButton);
        element.click();
    }
    public void clickOnCochabambaTextButton() {
        WebElement element = webDriver.findElement(cochabambaTextButton);
        element.click();
    }
    public void clickOnLaPazTextButton() {
        WebElement element = webDriver.findElement(laPazTextButton);
        element.click();
    }
    public void clickOnOruroTextButton() {
        WebElement element = webDriver.findElement(oruroTextButton);
        element.click();
    }
    public void clickOnPotosiTextButton() {
        WebElement element = webDriver.findElement(potosiTextButton);
        element.click();
    }
    public void clickOnSantaCruzTextButton() {
        WebElement element = webDriver.findElement(santaCruzTextButton);
        element.click();
    }

    public String getCityTitleText(){
        WebElement element = webDriver.findElement(cityTitleText);
        return element.getText();
    }

}

package pages.productoslinea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreditoHipotecarioPage {
    private WebDriver webDriver;

    public CreditoHipotecarioPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By creditoHipotecarioCard=By.xpath("//div[contains(text(),'Hipotecario')]");
    private By ingresoLiquidoTextField=By.xpath("//input[@id='PreAprobacionViviendaSocial_IngresoNeto']");
    private By ciudadSolicitudDropdown=By.xpath("//select[@id='PreAprobacionViviendaSocial_OficinaBNB']");
    private By valorInmuebleTextField=By.xpath("//input[@id='PreAprobacionViviendaSocial_MontoPropiedad']");
    private By tipoPropiedadDropdown=By.xpath("//select[@id='PreAprobacionViviendaSocial_TipoDePropiedad']");
    private By calcularButton=By.xpath("//button[contains(text(),'Calcular')]");
    private By aprobarText=By.xpath("//body/div[@id='bodyContainer']/form[@id='Formulario_Form']/div[3]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[2]/div[1]/h3[1]");


    public void clickOnCreditoHipotecarioCard() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(creditoHipotecarioCard));
        element.click();
    }
    public void enterOnIngresoLiquidoTextField(String ingreso) {
        WebElement element = webDriver.findElement(ingresoLiquidoTextField);
        element.sendKeys(ingreso);
    }
    public void enterOnValorInmuebleTextField(String valor) {
        WebElement element = webDriver.findElement(valorInmuebleTextField);
        element.sendKeys(valor);
    }

    public void selectCityElement(String cityText){
        WebElement element = webDriver.findElement(ciudadSolicitudDropdown);
        Select city=new Select(element);
        city.selectByVisibleText(cityText);
    }
    public void selectTipoPropiedadElement(String tipoPropiedad){
        WebElement element = webDriver.findElement(tipoPropiedadDropdown);
        Select propiedad=new Select(element);
        propiedad.selectByVisibleText(tipoPropiedad);
    }
    public void clickOnCalcularButton() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(calcularButton));
        element.click();
    }
    public String getAprobarText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(aprobarText));
        return element.getText();
    }




}

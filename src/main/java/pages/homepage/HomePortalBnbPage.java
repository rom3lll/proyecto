package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePortalBnbPage {
    private WebDriver webDriver;
    public HomePortalBnbPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By apiMarketButton = By.xpath("//a[@href='/PortalBNB/Api/ApiMarket']");
    private By solicitaTusProductosEnLineaButton = By.xpath("//div[@class='navbarbtn']//div//span[@class='solProdOnline'][normalize-space()='Solicita tus productos en línea']");
    private By bancaPersonasButton= By.xpath("//a[@id='1']");
    private By bancaEmpresaButton= By.xpath("//a[@id='2']");
    private By bancaGrupoButton= By.xpath("//a[@id='3']");
    private By agenciasSucursalesButton = By.xpath("//body/div[@id='header']/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]");


    public void clickOnApiMarketButton() {
        WebElement element = webDriver.findElement(apiMarketButton);
        element.click();
    }


    public void clickOnSolicitaTusProductosEnLineaButton() {
        WebElement element = webDriver.findElement(solicitaTusProductosEnLineaButton);
        element.click();
    }


    public void clickOnBancaPersonasButton() {
        WebElement element = webDriver.findElement(bancaPersonasButton);
        element.click();
    }


    public void clickOnBancaEmpresaButton() {
        WebElement element = webDriver.findElement(bancaEmpresaButton);
        element.click();
    }

    public void clickOnBancaGrupoButton() {
        WebElement element = webDriver.findElement(bancaGrupoButton);
        element.click();
    }

    public void clickOnAgenciasSucursalesButton() {
        WebElement element = webDriver.findElement(agenciasSucursalesButton);
        element.click();
    }




}

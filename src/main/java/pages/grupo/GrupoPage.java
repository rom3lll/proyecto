package pages.grupo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GrupoPage {

    private WebDriver webDriver;
    public GrupoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Grupo Card
    private By grupoCardTitleText = By.xpath("//div[contains(text(),'Grupo')]");
    private By grupoTextTitle = By.xpath("//*[contains(text(),'BANCO NACIONAL')]");
    public void clickOnGrupoCardTitleText() {
        WebElement element = webDriver.findElement(grupoCardTitleText);
        element.click();
    }
    public String getTextBnbGrupo(){
        WebElement element = webDriver.findElement(grupoTextTitle);
        return element.getText();
    }

    //Leasing Card
    private By leasingCardTitleText = By.xpath("//div[contains(text(),'Leasing')]");
    private By grupoleasingTextTitle = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnLeasingCardTitleText() {
        WebElement element = webDriver.findElement(leasingCardTitleText);
        element.click();
    }
    public String getTextLeasingGrupo(){
        WebElement element = webDriver.findElement(grupoleasingTextTitle);
        return element.getText().trim();
    }
    //Valores Card
    private By valoresCardTitleText = By.xpath("//div[contains(text(),'Valores')]");
    private By grupoQuienesSomosButton = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]");
    private By quienesSomosText = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[3]");

    private By grupoServiciosButton = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[3]/div[1]/div[1]/div[1]/label[1]");
    private By serviciosText = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[3]");

    private By grupoNuestrosClientesButton = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[4]/div[1]/div[1]/div[1]/label[1]");
    private By nuestroClientesText = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[3]");

    private By grupoContactanosButton = By.xpath("//body/div[@id='bodyContainer']/div[4]/div[2]/div[1]/div[1]/div[1]/label[1]");
    private By contactateText = By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/span[3]");

    public void clickOnValoresCardTitleText() {
        WebElement element = webDriver.findElement(valoresCardTitleText);
        element.click();
    }
    public void clickOnQuienesSomosCardTitleText() {
        WebElement element = webDriver.findElement(grupoQuienesSomosButton);
        element.click();
    }
    public String getTextQuienesSomos(){
        WebElement element = webDriver.findElement(quienesSomosText);
        return element.getText().trim();
    }

    public void clickOnServiciosCardTitleText() {
        WebElement element = webDriver.findElement(grupoServiciosButton);
        element.click();
    }
    public String getTextServiciosSomos(){
        WebElement element = webDriver.findElement(serviciosText);
        return element.getText().trim();
    }

    public void clickOnNuestrosClientesCardTitleText() {
        WebElement element = webDriver.findElement(grupoNuestrosClientesButton);
        element.click();
    }
    public String getTextNuestrosClientes(){
        WebElement element = webDriver.findElement(nuestroClientesText);
        return element.getText().trim();
    }

    public void clickOnContactanosCardTitleText() {
        WebElement element = webDriver.findElement(grupoContactanosButton);
        element.click();
    }
    public String getTextContactate(){
        WebElement element = webDriver.findElement(contactateText);
        return element.getText().trim();
    }










}

package pages.empresas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmpresasPage {
    private WebDriver webDriver;
    public EmpresasPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Corporativa Card
    private By corporativaCard=By.xpath("//div[contains(text(),'Corporativa')]");
    private By corporativaText=By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnCorporativaTitleText() {
        WebElement element = webDriver.findElement(corporativaCard);
        element.click();
    }
    public String getTextCorporativa(){
        WebElement element = webDriver.findElement(corporativaText);
        return element.getText();
    }
    //Mype Card
    private By mypeCard=By.xpath("//div[contains(text(),'BNB Mype')]");
    private By mypeText=By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnMypeTitleText() {
        WebElement element = webDriver.findElement(mypeCard);
        element.click();
    }
    public String getTextMype(){
        WebElement element = webDriver.findElement(mypeText);
        return element.getText();
    }
    //Pyme Card
    private By pymeCard=By.xpath("//div[contains(text(),'BNB Pyme')]");
    private By pymeText=By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnPymeTitleText() {
        WebElement element = webDriver.findElement(pymeCard);
        element.click();
    }
    public String getTextPyme(){
        WebElement element = webDriver.findElement(pymeText);
        return element.getText();
    }
    //Servicios Card
    private By serviciosCard=By.xpath("//div[contains(text(),'Servicios')]");
    private By serviciosText=By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnServiciosTitleText() {
        WebElement element = webDriver.findElement(serviciosCard);
        element.click();
    }
    public String getTextServicios(){
        WebElement element = webDriver.findElement(serviciosText);
        return element.getText();
    }

    private By transferenciasButton=By.xpath("//body/div[@id='bodyContainer']/div[4]/div[1]/div[1]/div[1]/div[3]/a[1]");
    private By transferenciasText=By.xpath("//span[contains(text(),'.TRANSFERENCIAS AL EXTERIOR')]");
    public void clickOnTransferenciasTitleText() {
        WebElement element = webDriver.findElement(transferenciasButton);
        element.click();
    }
    public String getTextTransferencias(){
        WebElement element = webDriver.findElement(transferenciasText);
        return element.getText();
    }

    private By cobranzasButton=By.xpath("//body/div[@id='bodyContainer']/div[4]/div[1]/div[2]/div[1]/div[3]/a[1]");
    private By cobranzasText=By.xpath("//span[contains(text(),'.COBRANZAS DOCUMENTARIAS')]");
    public void clickOnCobranzasTitleText() {
        WebElement element = webDriver.findElement(cobranzasButton);
        element.click();
    }
    public String getTextCobranzas(){
        WebElement element = webDriver.findElement(cobranzasText);
        return element.getText();
    }
}

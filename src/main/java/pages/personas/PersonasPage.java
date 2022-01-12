package pages.personas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonasPage {
    private WebDriver webDriver;

    public PersonasPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By clickCerrarModal = By.xpath("//body/div[@id='ModalGenerico']/div[1]/div[1]/fieldset[1]/div[1]/div[1]/img[1]");
    public void clickOnCerrarModal() {
        WebElement element = webDriver.findElement(clickCerrarModal);
        element.click();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    //Creditos Card
    private By creditosCardTitleText = By.xpath("//div[contains(text(),'Créditos')]");
    private By creditosTextTitle = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnCreditosCardTitleText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(creditosCardTitleText));
        element.click();

    }
    public String getTextCredito(){
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(creditosTextTitle));
        return element.getText();
    }
    //Tarjetas credito Card
    private By tarjetasCreditoCardTitleText = By.xpath("//div[contains(text(),'Tarjetas de crédito')]");
    private By tarjetasCreditoTextTitle = By.xpath("//span[contains(text(),'Classic')]");
    public void clickOnTarjetasCreditoCardTitleText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(tarjetasCreditoCardTitleText));
        element.click();
    }
    public String getTextTarjetasCredito(){
        WebElement element = webDriver.findElement(tarjetasCreditoTextTitle);
        return element.getText();
    }
    //Ahorro Inversion Card
    private By ahorroInversionCardTitleText = By.xpath("//div[contains(text(),'Ahorro e inversión')]");
    private By ahorroInversionTextTitle = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnAhorroInversionCardTitleText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(ahorroInversionCardTitleText));
        element.click();
    }
    public String getTextAhorroInversion(){
        WebElement element = webDriver.findElement(ahorroInversionTextTitle);
        return element.getText();
    }
    //Servicios Card
    private By serviciosCardTitleText = By.xpath("//body/div[@id='bodyContainer']/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    private By serviciosTextTitle = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnServiciosCardTitleText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(serviciosCardTitleText));
        element.click();
    }
    public String getTextServicios(){
        WebElement element = webDriver.findElement(serviciosTextTitle);
        return element.getText();
    }
    //Seguros Card
    private By segurosCardTitleText = By.xpath("//div[contains(text(),'Seguros')]");
    private By segurosTextTitle = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[2]");
    public void clickOnSegurosCardTitleText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(segurosCardTitleText));
        element.click();
    }
    public String getTextSeguros(){
        WebElement element = webDriver.findElement(segurosTextTitle);
        return element.getText();
    }
    //Seguros Card
    private By serviciosDigitalesCardTitleText = By.xpath("//div[contains(text(),'Servicios digitales')]");
    private By serviciosDigitalesTextTitle = By.xpath("//body/div[@id='bodyContainer']/div[3]/div[1]/div[1]/span[3]");
    public void clickOnServiciosDigitalesCardTitleText() {
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(serviciosDigitalesCardTitleText));
        element.click();
    }
    public String getTextServiciosDigitales(){
        WebElement element = webDriver.findElement(serviciosDigitalesTextTitle);
        return element.getText();
    }
}

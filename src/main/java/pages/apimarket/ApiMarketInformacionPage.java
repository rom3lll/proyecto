package pages.apimarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApiMarketInformacionPage {
    private WebDriver webDriver;
    public ApiMarketInformacionPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By abrirConsolaTransferButton = By.xpath("//a[@id='btnAbrirConsolaTransfer']");
    private By abrirConsolaBankStatementButton = By.xpath("//a[@id='btnAbrirConsolaBankStatement']");
    private By abrirConsolaBalanceButton = By.xpath("//a[@id='btnAbrirConsolaTransfer']");
    private By abrirConsolaAccountBalancesButton = By.xpath("//a[@id='btnAbrirConsolaAccountBalances']");
    private By abrirConsolaRegisterGuaranteeBillButton = By.xpath("//a[@id='btnAbrirConsolaRegisterGuaranteeBill']");
    private By abrirConsolaTokenButton = By.xpath("//a[@id='btnAbrirConsolaToken']");



    private By enviarConsolaButton = By.cssSelector("div.container-fluid:nth-child(9) div.row:nth-child(7) div.col-md-10 div.row:nth-child(3) div.col-md-5.consola div.container:nth-child(1) div.textoblanco div.row:nth-child(10) div.col-xs-2.col-sm-2:nth-child(1) > a.btnGreen.btn-lg");

    private By enviarConsolaAccountBalancesButton = By.xpath("//a[@href='#respuestaAccountBalances']");

    private By status200Text = By.xpath("//p[contains(text(),'200')]");

    private By statusBodyText = By.cssSelector("div:nth-child(1) div:nth-child(1) h2:nth-child(1)");


    private By statusRequestText = By.xpath("");
    //div[normalize-space()='REQUEST']



    public void clickOnAbrirConsolaTransferButton() {
        WebElement element = webDriver.findElement(abrirConsolaTransferButton);
        element.click();
    }
    public void clickOnAbrirConsolaBankStatementButton() {
        WebElement element = webDriver.findElement(abrirConsolaBankStatementButton);
        element.click();
    }

    public void clickOnAbrirConsolaBalanceButton() {
        WebElement element = webDriver.findElement(abrirConsolaBalanceButton);
        element.click();
    }

    public void clickOnAbrirConsolaAccountBalancesButton() {
        WebElement element = webDriver.findElement(abrirConsolaAccountBalancesButton);
        element.click();
    }

    public void clickOnAbrirConsolaRegisterGuaranteeBillButton() {
        WebElement element = webDriver.findElement(abrirConsolaRegisterGuaranteeBillButton);
        element.click();
    }
    public void clickOnAbrirConsolaTokenButton() {
        WebElement element = webDriver.findElement(abrirConsolaTokenButton);
        element.click();
    }






    public void clickOnEnviarConsolaButton(){
        WebDriverWait wait=new WebDriverWait(webDriver,10);
       WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(enviarConsolaButton));

        //WebElement element = webDriver.findElement(enviarConsolaButton);
        element.click();
    }

    public void clickOnEnviarAccountBalancesButton(){
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(enviarConsolaAccountBalancesButton));

        //WebElement element = webDriver.findElement(enviarConsolaButton);
        element.click();
    }



    public String getConsoleStatusResult(){
        WebDriverWait wait=new WebDriverWait(webDriver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(status200Text));
        return element.getText();
    }

    public String getConsoleStatusBodyResult(){
//        WebDriverWait wait=new WebDriverWait(webDriver,10);
//        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(statusBodyText));
//        return element.getText();

        WebElement element = webDriver.findElement(statusBodyText);
        return element.getText();
        //element.click();
    }




}

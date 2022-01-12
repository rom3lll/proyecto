package apimarket;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.apimarket.ApiMarketInformacionPage;
import pages.apimarket.ApiMarketProductosPage;
import pages.homepage.HomePortalBnbPage;

public class ApiMarketTest extends BaseTest {


    //pass
    @Test
    public void enviarTransferenciaRequestCuandoLaConsolaEstaAbierta() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ApiMarketInformacionPage apiMarketInformacionPage=new ApiMarketInformacionPage(webDriver);
        ApiMarketProductosPage apiMarketProductosPage=new ApiMarketProductosPage(webDriver);

        homePagePortalBnb.clickOnApiMarketButton();
        apiMarketProductosPage.clickOnTransferenciasButton();
        apiMarketInformacionPage.clickOnAbrirConsolaTransferButton();
        apiMarketInformacionPage.clickOnEnviarConsolaButton();

        String actualResult = apiMarketInformacionPage.getConsoleStatusResult();
        String expectedResult = "200";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //fail
    @Test
    public void enviarBankStatementRequestCuandoLaConsolaEstaAbierta() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ApiMarketInformacionPage apiMarketInformacionPage=new ApiMarketInformacionPage(webDriver);
        ApiMarketProductosPage apiMarketProductosPage=new ApiMarketProductosPage(webDriver);

        homePagePortalBnb.clickOnApiMarketButton();
        apiMarketProductosPage.clickOnTransferenciasButton();
        apiMarketInformacionPage.clickOnAbrirConsolaBankStatementButton();
        apiMarketInformacionPage.clickOnEnviarConsolaButton();

        String actualResult = apiMarketInformacionPage.getConsoleStatusResult();
        String expectedResult = "200";
        Assert.assertEquals(actualResult, expectedResult);
    }

    //pass
    @Test
    public void enviarBalanceRequestCuandoLaConsolaEstaAbierta() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ApiMarketInformacionPage apiMarketInformacionPage=new ApiMarketInformacionPage(webDriver);
        ApiMarketProductosPage apiMarketProductosPage=new ApiMarketProductosPage(webDriver);

        homePagePortalBnb.clickOnApiMarketButton();
        apiMarketProductosPage.clickOnTransferenciasButton();
        apiMarketInformacionPage.clickOnAbrirConsolaBalanceButton();
        apiMarketInformacionPage.clickOnEnviarConsolaButton();

        String actualResult = apiMarketInformacionPage.getConsoleStatusResult();
        String expectedResult = "200";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //IN PROGRESS
    @Test
    public void enviarAccountBalancesRequestCuandoLaConsolaEstaAbierta() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ApiMarketInformacionPage apiMarketInformacionPage=new ApiMarketInformacionPage(webDriver);
        ApiMarketProductosPage apiMarketProductosPage=new ApiMarketProductosPage(webDriver);

        homePagePortalBnb.clickOnApiMarketButton();
        apiMarketProductosPage.clickOnTransferenciasButton();
        apiMarketInformacionPage.clickOnAbrirConsolaAccountBalancesButton();
        apiMarketInformacionPage.clickOnEnviarAccountBalancesButton();

        String actualResult = apiMarketInformacionPage.getConsoleStatusBodyResult();
        String expectedResult = "REQUEST";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void enviarRegisterGuaranteeBillRequestCuandoLaConsolaEstaAbierta() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ApiMarketInformacionPage apiMarketInformacionPage=new ApiMarketInformacionPage(webDriver);
        ApiMarketProductosPage apiMarketProductosPage=new ApiMarketProductosPage(webDriver);

        homePagePortalBnb.clickOnApiMarketButton();
        apiMarketProductosPage.clickOnTransferenciasButton();
        apiMarketInformacionPage.clickOnAbrirConsolaRegisterGuaranteeBillButton();
        apiMarketInformacionPage.clickOnEnviarConsolaButton();

        String actualResult = apiMarketInformacionPage.getConsoleStatusResult();
        String expectedResult = "200";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void enviarTokeRequestCuandoLaConsolaEstaAbierta() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ApiMarketInformacionPage apiMarketInformacionPage=new ApiMarketInformacionPage(webDriver);
        ApiMarketProductosPage apiMarketProductosPage=new ApiMarketProductosPage(webDriver);

        homePagePortalBnb.clickOnApiMarketButton();
        apiMarketProductosPage.clickOnTransferenciasButton();
        apiMarketInformacionPage.clickOnAbrirConsolaTokenButton();
        apiMarketInformacionPage.clickOnEnviarConsolaButton();

        String actualResult = apiMarketInformacionPage.getConsoleStatusResult();
        String expectedResult = "200";
        Assert.assertEquals(actualResult, expectedResult);
    }



}

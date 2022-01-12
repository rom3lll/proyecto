package productoslinea;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage.HomePortalBnbPage;
import pages.personas.PersonasPage;
import pages.productoslinea.CreditoHipotecarioPage;
import pages.productoslinea.ProductosLineaPage;

public class ProductosLineaTest extends BaseTest {
    //7
    @Test
    public void ObtenerMensajeCodigoQROnPc() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ProductosLineaPage productosLineaPage =new ProductosLineaPage(webDriver);
        homePagePortalBnb.clickOnSolicitaTusProductosEnLineaButton();
        productosLineaPage.clickOnAperturaCuentaCardCard();

//        String actualResult = creditoHipotecarioPage.getAprobarText();
//        String expectedResult = "Felicidades puedes pre-aprobar este Crédito de Vivienda";
//        Assert.assertEquals(actualResult, expectedResult);
    }
    //8
    @Test
    public void enviarformSolicitaTuCréditoDeVivienda() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        ProductosLineaPage productosLineaPage =new ProductosLineaPage(webDriver);
        CreditoHipotecarioPage creditoHipotecarioPage=new CreditoHipotecarioPage(webDriver);

        homePagePortalBnb.clickOnSolicitaTusProductosEnLineaButton();
        productosLineaPage.clickOnSolicitudCreditosCardCardCard();
        creditoHipotecarioPage.clickOnCreditoHipotecarioCard();

        creditoHipotecarioPage.enterOnIngresoLiquidoTextField("5000");

        creditoHipotecarioPage.selectCityElement("LA PAZ");

        creditoHipotecarioPage.enterOnValorInmuebleTextField("10000");

        creditoHipotecarioPage.selectTipoPropiedadElement("CASA");
        Thread.sleep(2000);
        creditoHipotecarioPage.clickOnCalcularButton();


        String actualResult = creditoHipotecarioPage.getAprobarText();
        String expectedResult = "Felicidades puedes pre-aprobar este Crédito de Vivienda";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //9
    @Test
    public void enviarFormCreditoVehicular() throws InterruptedException {

    }
    //10
    @Test
    public void enviarformCreditoConsumo() throws InterruptedException {

    }
    //11
    @Test
    public void enviarFormTarjetaDeCredito() throws InterruptedException {

    }
    //12
    @Test
    public void ObtenerAperturaSolicitud() throws InterruptedException {

    }
}

package agenciassucursales;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.agenciasysucursales.AgenciasSucursalesPage;
import pages.homepage.HomePortalBnbPage;

public class AgenciasSucursalesTest extends BaseTest {

    @Test
    public void obtenerSucursalesPando() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        AgenciasSucursalesPage agenciasSucursalesPage =new AgenciasSucursalesPage(webDriver);

        homePagePortalBnb.clickOnAgenciasSucursalesButton();
        agenciasSucursalesPage.clickOnPandoTextButton();

        String actualResult = agenciasSucursalesPage.getCityTitleText();
        String expectedResult = "PANDO";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void obtenerSucursalesCochabamba() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        AgenciasSucursalesPage agenciasSucursalesPage =new AgenciasSucursalesPage(webDriver);

        homePagePortalBnb.clickOnAgenciasSucursalesButton();
        agenciasSucursalesPage.clickOnCochabambaTextButton();

        String actualResult = agenciasSucursalesPage.getCityTitleText();
        String expectedResult = "COCHABAMBA";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void obtenerSucursalesLaPaz() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        AgenciasSucursalesPage agenciasSucursalesPage =new AgenciasSucursalesPage(webDriver);

        homePagePortalBnb.clickOnAgenciasSucursalesButton();
        agenciasSucursalesPage.clickOnLaPazTextButton();

        String actualResult = agenciasSucursalesPage.getCityTitleText();
        String expectedResult = "LA PAZ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void obtenerSucursalesOruro() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        AgenciasSucursalesPage agenciasSucursalesPage =new AgenciasSucursalesPage(webDriver);

        homePagePortalBnb.clickOnAgenciasSucursalesButton();
        agenciasSucursalesPage.clickOnOruroTextButton();

        String actualResult = agenciasSucursalesPage.getCityTitleText();
        String expectedResult = "ORURO";
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void obtenerSucursalesPotosi() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        AgenciasSucursalesPage agenciasSucursalesPage =new AgenciasSucursalesPage(webDriver);

        homePagePortalBnb.clickOnAgenciasSucursalesButton();
        agenciasSucursalesPage.clickOnPotosiTextButton();

        String actualResult = agenciasSucursalesPage.getCityTitleText();
        String expectedResult = "POTOSI";
        Assert.assertEquals(actualResult, expectedResult);
    }    @Test
    public void obtenerSucursalesSantaCruz() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        AgenciasSucursalesPage agenciasSucursalesPage =new AgenciasSucursalesPage(webDriver);

        homePagePortalBnb.clickOnAgenciasSucursalesButton();
        agenciasSucursalesPage.clickOnSantaCruzTextButton();

        String actualResult = agenciasSucursalesPage.getCityTitleText();
        String expectedResult = "SANTA CRUZ";
        Assert.assertEquals(actualResult, expectedResult);
    }



}

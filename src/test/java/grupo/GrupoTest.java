package grupo;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.grupo.GrupoPage;
import pages.homepage.HomePortalBnbPage;

public class GrupoTest extends BaseTest {
    //25
    @Test
    public void obtenerGrupo() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        GrupoPage grupoPage =new GrupoPage(webDriver);

        homePagePortalBnb.clickOnBancaGrupoButton();
        grupoPage.clickOnGrupoCardTitleText();

        String actualResult = grupoPage.getTextBnbGrupo();
        String expectedResult = "BANCO NACIONAL";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //26
    @Test
    public void obtenerLeasingGrupo() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        GrupoPage grupoPage =new GrupoPage(webDriver);

        homePagePortalBnb.clickOnBancaGrupoButton();
        grupoPage.clickOnLeasingCardTitleText();

        String actualResult = grupoPage.getTextLeasingGrupo();
        String expectedResult = "Leasing";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //27
    @Test
    public void obtenerQuienesSomosGrupo() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        GrupoPage grupoPage =new GrupoPage(webDriver);

        homePagePortalBnb.clickOnBancaGrupoButton();
        grupoPage.clickOnValoresCardTitleText();
        grupoPage.clickOnQuienesSomosCardTitleText();

        String actualResult = grupoPage.getTextQuienesSomos();
        String expectedResult = "Quiénes Somos";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //28
    @Test
    public void obtenerContactateGrupo() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        GrupoPage grupoPage =new GrupoPage(webDriver);

        homePagePortalBnb.clickOnBancaGrupoButton();
        grupoPage.clickOnValoresCardTitleText();
        grupoPage.clickOnContactanosCardTitleText();

        String actualResult = grupoPage.getTextContactate();
        String expectedResult = "Contáctate";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //29
    @Test
    public void obtenerServiciosGrupo() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        GrupoPage grupoPage =new GrupoPage(webDriver);

        homePagePortalBnb.clickOnBancaGrupoButton();
        grupoPage.clickOnValoresCardTitleText();
        grupoPage.clickOnServiciosCardTitleText();

        String actualResult = grupoPage.getTextContactate();
        String expectedResult = "Servicios";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //30
    @Test
    public void obtenerNuestrosClientesGrupo() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        GrupoPage grupoPage =new GrupoPage(webDriver);

        homePagePortalBnb.clickOnBancaGrupoButton();
        grupoPage.clickOnValoresCardTitleText();
        grupoPage.clickOnNuestrosClientesCardTitleText();

        String actualResult = grupoPage.getTextContactate();
        String expectedResult = "Nuestros Clientes";
        Assert.assertEquals(actualResult, expectedResult);
    }
}

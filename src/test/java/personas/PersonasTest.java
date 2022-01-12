package personas;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.empresas.EmpresasPage;
import pages.homepage.HomePortalBnbPage;
import pages.personas.PersonasPage;

public class PersonasTest extends BaseTest {
    //13
    @Test
    public void obtenerCreditos() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        PersonasPage personasPage =new PersonasPage(webDriver);

        homePagePortalBnb.clickOnBancaPersonasButton();
        personasPage.clickOnCerrarModal();
        personasPage.clickOnCreditosCardTitleText();

        String actualResult = personasPage.getTextCredito();
        String expectedResult = "Créditos ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //14
    @Test
    public void ObtenerTarjetasCreditoPersona() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        PersonasPage personasPage =new PersonasPage(webDriver);

        homePagePortalBnb.clickOnBancaPersonasButton();
        personasPage.clickOnCerrarModal();
        personasPage.clickOnTarjetasCreditoCardTitleText();

        String actualResult = personasPage.getTextTarjetasCredito();
        String expectedResult = "Classic";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //15
    @Test
    public void ObtenerAhorroInversionPersona() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        PersonasPage personasPage =new PersonasPage(webDriver);

        homePagePortalBnb.clickOnBancaPersonasButton();
        personasPage.clickOnCerrarModal();
        personasPage.clickOnAhorroInversionCardTitleText();

        String actualResult = personasPage.getTextAhorroInversion();
        String expectedResult = "Ahorro e Inversión ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //16
    @Test
    public void ObtenerServiciosPersona() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        PersonasPage personasPage =new PersonasPage(webDriver);

        homePagePortalBnb.clickOnBancaPersonasButton();
        personasPage.clickOnCerrarModal();
        personasPage.clickOnServiciosCardTitleText();

        String actualResult = personasPage.getTextServicios();
        String expectedResult = "Servicios ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //17
    @Test
    public void ObtenerSegurosPersona() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        PersonasPage personasPage =new PersonasPage(webDriver);

        homePagePortalBnb.clickOnBancaPersonasButton();
        personasPage.clickOnCerrarModal();
        personasPage.clickOnSegurosCardTitleText();

        String actualResult = personasPage.getTextSeguros();
        String expectedResult = "Seguros ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //18
    @Test
    public void ObtenerServiciosDigitalesPersona() throws InterruptedException {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        PersonasPage personasPage =new PersonasPage(webDriver);

        homePagePortalBnb.clickOnBancaPersonasButton();
        personasPage.clickOnCerrarModal();
        personasPage.clickOnServiciosDigitalesCardTitleText();

        String actualResult = personasPage.getTextServiciosDigitales();
        String expectedResult = "Servicios Digitales ";
        Assert.assertEquals(actualResult, expectedResult);
    }



}

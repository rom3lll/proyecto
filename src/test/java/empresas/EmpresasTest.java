package empresas;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.empresas.EmpresasPage;
import pages.grupo.GrupoPage;
import pages.homepage.HomePortalBnbPage;

public class EmpresasTest extends BaseTest {
    //19
    @Test
    public void obtenerCorporativaEmpresas() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        EmpresasPage empresasPage =new EmpresasPage(webDriver);

        homePagePortalBnb.clickOnBancaEmpresaButton();
        empresasPage.clickOnCorporativaTitleText();

        String actualResult = empresasPage.getTextCorporativa();
        String expectedResult = "Corporativa ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //20
    @Test
    public void obtenerMypeEmpresas() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        EmpresasPage empresasPage =new EmpresasPage(webDriver);

        homePagePortalBnb.clickOnBancaEmpresaButton();
        empresasPage.clickOnMypeTitleText();

        String actualResult = empresasPage.getTextMype();
        String expectedResult = "Mype ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //21
    @Test
    public void obtenerPymeEmpresas() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        EmpresasPage empresasPage =new EmpresasPage(webDriver);

        homePagePortalBnb.clickOnBancaEmpresaButton();
        empresasPage.clickOnPymeTitleText();

        String actualResult = empresasPage.getTextPyme();
        String expectedResult = "Pyme ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //22
    @Test
    public void obtenerServiciosEmpresas() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        EmpresasPage empresasPage =new EmpresasPage(webDriver);

        homePagePortalBnb.clickOnBancaEmpresaButton();
        empresasPage.clickOnServiciosTitleText();

        String actualResult = empresasPage.getTextServicios();
        String expectedResult = "Servicios ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //23
    @Test
    public void obtenerTransferenciasEmpresas() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        EmpresasPage empresasPage =new EmpresasPage(webDriver);

        homePagePortalBnb.clickOnBancaEmpresaButton();
        empresasPage.clickOnServiciosTitleText();
        empresasPage.clickOnTransferenciasTitleText();

        String actualResult = empresasPage.getTextTransferencias();
        String expectedResult = ".TRANSFERENCIAS AL EXTERIOR ";
        Assert.assertEquals(actualResult, expectedResult);
    }
    //24
    @Test
    public void obtenerCobranzasEmpresas() {
        HomePortalBnbPage homePagePortalBnb = new HomePortalBnbPage(webDriver);
        EmpresasPage empresasPage =new EmpresasPage(webDriver);

        homePagePortalBnb.clickOnBancaEmpresaButton();
        empresasPage.clickOnServiciosTitleText();
        empresasPage.clickOnCobranzasTitleText();

        String actualResult = empresasPage.getTextCobranzas();
        String expectedResult = ".COBRANZAS DOCUMENTARIAS ";
        Assert.assertEquals(actualResult, expectedResult);
    }

}

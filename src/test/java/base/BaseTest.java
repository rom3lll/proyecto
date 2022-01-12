package base;

import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import report.ReportManager;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver webDriver;
    private String url = "https://www.bnb.com.bo/PortalBNB/Principal/BancaPersonas";
    private By closeHomePageModal= By.xpath("//img[@class='close-derecha']");

    @BeforeSuite
    public static void setUpSuite() throws Exception {
        ReportManager.init("C:\\Reports\\Report", "Reporte de pruebas");
    }

//    @BeforeMethod
//    @Parameters(value={"browser"})
//    public void setUp(ITestResult iTestResult,String browser) {
//        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
//        switch (browser){
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver","resources/drivers/chrome/chromedriver.exe");
//                webDriver=new ChromeDriver();
//                break;
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver","resources/drivers/firefox/geckodriver.exe");
//                webDriver=new FirefoxDriver();
//
//                break;
//        }
//        webDriver.get(url);
//        webDriver.manage().window().maximize();
//        clickCloseHomePageModal();
//    }

    @BeforeMethod
//    @Parameters(value={"browser"})
    public void setUp(ITestResult iTestResult) {
        ReportManager.getInstance().startTest(iTestResult.getMethod().getMethodName());
//        switch (browser){
//            case "chrome":
                System.setProperty("webdriver.chrome.driver","resources/drivers/chrome/chromedriver.exe");
                webDriver=new ChromeDriver();
//                break;
//            case "firefox":
//                System.setProperty("webdriver.gecko.driver","resources/drivers/firefox/geckodriver.exe");
//                webDriver=new FirefoxDriver();
//
//                break;
//        }
        webDriver.get(url);
        webDriver.manage().window().maximize();
        clickCloseHomePageModal();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) {
        try {
            switch (iTestResult.getStatus()) {
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test failed");
                    break;
                case ITestResult.SKIP:
                    ReportManager.getInstance().getTest().log(Status.SKIP, "Test skipped");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS, "Test passed");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test incomplete");
            }
            if (iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null) {
                ReportManager.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.FAIL, "Failure Image");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (webDriver != null)
                webDriver.quit();
        }
    }
    public void clickCloseHomePageModal(){
        WebElement element = webDriver.findElement(closeHomePageModal);
        element.click();
    }

    @AfterSuite
    public static void tearDownSuite() {
        ReportManager.getInstance().flush();
    }
}

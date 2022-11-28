package test;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.*;
import utils.GetDataFromJson;

public class BaseTest {
    private static Browser browser;
    @BeforeMethod
    public static void beforeTest() {
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(GetDataFromJson.getSettingData("url"));
    }
    @AfterMethod
    public static void afterTest() {
        browser.quit();
    }
}
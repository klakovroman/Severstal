package test;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.LogUtil;

import java.io.IOException;

public class TestCaseOne extends BaseTest {
/*    private String os;
    private String productName;

    @Factory(dataProvider = "products", dataProviderClass = DataProviderClass.class)
    public TestCaseOne(String os, String productName) {
        this.os = os;
        this.productName = productName;
    }*/

    @Test(description = "OLOLOLOL")
    @Description("2olol")
    public void testOne() throws IOException, InterruptedException {
        LogUtil.getLog().info("Step 1");
        LogInPage logInPage = new LogInPage();
        Assert.assertTrue(logInPage.state().waitForDisplayed(), "Main page wasn't load");
        Thread.sleep(1000);
      /*  logInPage.loginOnSite(GetDataFromJson.getTestData("username"), GetDataFromJson.getTestData("password"));
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Failed authorization or it isn't main page");
        LogUtil.getLog().info("Step 2");
        mainPage.clickDownloadButton();
        ProductForm productForm = new ProductForm();
        Assert.assertTrue(productForm.state().waitForDisplayed(), "Product page doesn't open");
        LogUtil.getLog().info("Step 3");
        productForm.clickOsButton(os);
        productForm.clickDwnlBtn(productName);
        DownloadForm downloadForm = new DownloadForm();
        Assert.assertTrue(downloadForm.state().waitForDisplayed(), "Download form doesn't open");
        LogUtil.getLog().info("Step 3.1");
        downloadForm.clickOtherDownloadBtn();
        OtherDownloadForm otherDownloadForm = new OtherDownloadForm();
        Assert.assertTrue(otherDownloadForm.state().waitForDisplayed(), "Other download form doesn't open");
        LogUtil.getLog().info("Step 3.2");
        otherDownloadForm.clickSendBtn();
        SendEmailForm sendEmailForm = new SendEmailForm();
        Assert.assertTrue(sendEmailForm.state().waitForDisplayed(), "Send email form doesn't open");
        LogUtil.getLog().info("Step 3.3");
        Assert.assertEquals(sendEmailForm.getEmailValue(), GetDataFromJson.getTestData("usernameEmail"), "Fail email");
        sendEmailForm.clickSendEmailButton();
        LogUtil.getLog().info("Step 4");
        Assert.assertTrue(GetMail.compareLetterAndTestText("Download"), "Text on Message not equals example text");*/
    }
}
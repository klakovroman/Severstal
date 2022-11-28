package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.GetDataFromJson;

import java.time.Duration;

public class SendEmailForm extends Form {
    private IButton sendEmailButton = getElementFactory().getButton(By.xpath("//button [@data-at-selector='installerSendSelfBtn']//span [@class='u-button__text']"), "Send Btn");
    private ITextBox captcha = getElementFactory().getTextBox(By.xpath("//kl-input"), "captcha");
    private ITextBox emailBox = getElementFactory().getTextBox(By.xpath("//input [@data-at-selector='emailInput']"), "Email box");

    public SendEmailForm() {
        super(By.xpath("//kl-modal-body[@class='ng-star-inserted']"), "Download product form");
    }

    public void clickSendEmailButton() {
        if (!captcha.state().isDisplayed()) {
            sendEmailButton.click();
        }
        else {
            try {
                AqualityServices.getConditionalWait().waitForTrue(() -> !emailBox.state().waitForNotDisplayed(),
                        Duration.ofSeconds(Integer.parseInt(GetDataFromJson.getSettingData("timeoutOnSec"))),
                        Duration.ofMillis(Integer.parseInt(GetDataFromJson.getSettingData("pollingTimeOnMlsc"))));
            }
            catch (java.util.concurrent.TimeoutException e) {
            }
            sendEmailButton.click();
        }
    }

    public String getEmailValue() {
        return emailBox.getValue();
    }
}
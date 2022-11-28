package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class OtherDownloadForm extends Form {
    private IButton sendBtn = getElementFactory().getButton(By.xpath("//button [@data-at-selector='sendToMe']"),
            "Send Email Button");

    public OtherDownloadForm() {
        super(By.xpath("//button [@data-at-selector='backButton']"), "Other Download Form");
    }

    public void clickSendBtn () {
        sendBtn.click();
    }
}

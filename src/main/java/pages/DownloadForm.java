package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DownloadForm extends Form {
    private IButton OtherDwnldBtn = getElementFactory().getButton(By.xpath("//button [@data-at-selector='otherDownloads']"),
            "Other Download Button");

    public DownloadForm() {
        super(By.xpath("//div [@data-at-selector='downloadDialog']"), "Download Form");
    }

    public void clickOtherDownloadBtn () {
        OtherDwnldBtn.click();
    }
}

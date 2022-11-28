package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private IButton downloadButton = getElementFactory().getButton(By.xpath("//a [@data-at-menu='Downloads']"), "Download Button");

    public MainPage() {
        super(By.xpath("//input [@data-at-selector='activationCodeField']"), "Main page");
    }

    public void  clickDownloadButton () {
        downloadButton.click();
    }
}
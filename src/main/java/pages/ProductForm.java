package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ProductForm extends Form {
    private IButton selectOsButton;
    private IButton dwnlBtn;

    public ProductForm() {
        super(By.xpath("//h2 [@data-at-selector='downloadBlockTrialAppsTitle']"), "Product Page");
    }

    public void clickOsButton (String os)  {
        selectOsButton = getElementFactory().getButton(By.xpath("//div [@data-at-selector='osName' and contains (text(), '" +
                os + "')]"), "OS Button");
        selectOsButton.click();
    }

    public void clickDwnlBtn (String productName) {
        dwnlBtn = getElementFactory().getButton(By.xpath("//div [contains (text(),'"+
                productName +
                "')]/ancestor::div [@data-at-selector='downloadApplicationCard']//button [@data-at-selector='appInfoDownload']"), "self Button");
        dwnlBtn.click();
    }
}
package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.GetDataFromJson;

public class LogInPage extends Form {
    private ITextBox loginFiled = getElementFactory().getTextBox(By.xpath("//input [@type = 'email']"), "Username");
    private ITextBox passwordFied = getElementFactory().getTextBox(By.xpath("//input [@type = 'password']"), "password");
    private IButton enterButton = getElementFactory().getButton(By.xpath("//button [@data-at-selector='welcomeSignInBtn']"), "Submit Button");

    public LogInPage() {
        super(By.xpath("//div [@data-at-selector='welcomeSignUpTab']"), "It's Login Page");
    }

    public void loginOnSite(String username, String password) {
        loginFiled.sendKeys(username);
        passwordFied.sendKeys(password);
        enterButton.click();
    }
}
package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[2]/div[3]/div[1]/input")
    public WebElement signInEmail;
    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[2]/div[3]/div[2]/input")
    public WebElement signInPassword;
    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[2]/div[3]/div[5]/input")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"menu\"]/div")
    public WebElement scrollDownMenu;
    @FindBy(xpath = "//*[@id=\"search-input-field\"]")
    public WebElement searchBox;

    public void clickSubmitButton() {
        submitButton.click();

    }
    public void cnnSignIn(String email,String password) {
        signInEmail.sendKeys(email);
        signInPassword.sendKeys(password);

    }
    public void clickScrollDownMenu() {
        scrollDownMenu.click();
    }
    public void clearSearchBox() {
        searchBox.clear();
    }

}

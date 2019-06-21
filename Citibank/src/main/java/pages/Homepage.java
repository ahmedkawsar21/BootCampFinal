package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement emailOrUserId;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement signOnpassword;
    @FindBy (xpath = "//*[@id=\"signInBtn\"]")
    public WebElement signOnButton;
    @FindBy(xpath = "//*[@id=\"banking\"]")
    public WebElement banking;
    @FindBy(xpath = "//*[@id=\"personetics-citi-menu\"]")
    public WebElement search;

    public void citiSignOn(String eamil, String password) {
        emailOrUserId.sendKeys(eamil);
        signOnpassword.sendKeys(password);
    }

    public void clickSignOnButton() {
        signOnButton.click();
    }
    public WebElement getEmailOrUserId(){

        return emailOrUserId;
    }
    public WebElement getSignOnPassword() {

        return signOnpassword;
    }
    public void clickBanking() {
        banking.click();
    }
    public void clickSearh() {
        search.click();
    }

}

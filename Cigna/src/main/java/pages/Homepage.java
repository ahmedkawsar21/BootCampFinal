package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    public WebElement logInToMyCigma;
    @FindBy(xpath = "//*[@id=\"adBlock\"]/div[2]/div[1]/a/div")
    public WebElement healthInsurance;


    public void clickLogInCigma() {
        logInToMyCigma.click();
    }
    public void clickHealthInsurance() {
        healthInsurance.click();
    }

}

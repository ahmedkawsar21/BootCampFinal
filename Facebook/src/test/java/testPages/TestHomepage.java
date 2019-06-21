package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepage;

public class TestHomepage extends CommonAPI {
    Homepage homepage;
    @BeforeMethod
    public void init() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    public void facebookLogin() {
        homepage.emailOrPhone.sendKeys("ahmedkawsar21@yahoo.com");
        sleepFor(1);
        homepage.logInPassword.sendKeys("password");
        sleepFor(1);
        homepage.clickLoginButton();
        sleepFor(1);
        getScreenshot(driver);
    }

    public void searchName() {
        homepage.emailOrPhone.sendKeys("ahmedkawsar21@yahoo.com");
        sleepFor(1);
        homepage.logInPassword.sendKeys("password");
        sleepFor(1);
        homepage.clickLoginButton();
        sleepFor(2);
        driver.findElement(By.className("_1frb")).sendKeys(" Sakil Ahmod ", Keys.ENTER);
        sleepFor(5);
        getScreenshot(driver);
    }

    public void commentFriend() {
        homepage.emailOrPhone.sendKeys("ahmedkawsar21@yahoo.com");
        sleepFor(1);
        homepage.logInPassword.sendKeys("password");
        sleepFor(1);
        homepage.clickLoginButton();
        sleepFor(3);
        driver.findElement(By.className("_1frb")).sendKeys(" Mitun Das ", Keys.ENTER);
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"xt_uniq_3\"]/div/div/div[1]/div[1]/div[1]/a")).isEnabled();
        sleepFor(1);
        getScreenshot(driver);
    }


}

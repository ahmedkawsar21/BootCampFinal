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
        homepage= PageFactory.initElements(driver, Homepage.class);
    }

    public void citiBankSignOn() {
        homepage.getEmailOrUserId().sendKeys("ahmedkawsar21");
        sleepFor(1);
        homepage.getSignOnPassword().sendKeys("password");
        sleepFor(1);
        homepage.clickSignOnButton();
        sleepFor(2);
    }

    public void checkigAccount() {
        homepage.clickBanking();
        sleepFor(1);
        driver.findElement(By.id("checkingBanking_Link")).click();
        sleepFor(2);
        getScreenshot(driver);
    }

    public void specialOffers() {
        driver.findElement(By.cssSelector("#whyCiti > ul > li:nth-child(7) > a")).click();
        sleepFor(2);
        getScreenshot(driver);
    }

    @Test
    public void serchProducts() {
        homepage.clickSearh();
        driver.findElement(By.className("citi-autocomplete-content-searchbox")).sendKeys("saving accounts");
        sleepFor(1);
        driver.findElement(By.className("citi-autocomplete-content-searchbox-go")).click();
        sleepFor(2);
        getScreenshot(driver);
    }



}

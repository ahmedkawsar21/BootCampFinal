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

    public void signInCnn() {
        driver.navigate().to("https://edition.cnn.com/login.html\n");
        sleepFor(1);
        homepage.signInEmail.sendKeys("ahmedkawsar21@yahoo.com");
        sleepFor(1);
        homepage.signInPassword.sendKeys("kawsar1989");
        sleepFor(1);
        homepage.clickSubmitButton();
        sleepFor(5);
        getScreenshot(driver);
    }

    public void checkNavTab() {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[2]")).click();
        sleepFor(1);
        getScreenshot(driver);

    }

    public void searchNews() {
        homepage.clickScrollDownMenu();
        sleepFor(1);
        homepage.clearSearchBox();
        sleepFor(1);
        driver.findElement(By.id("search-input-field")).sendKeys("breaking news", Keys.ENTER);
        sleepFor(1);
        getScreenshot(driver);


    }


}

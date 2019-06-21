package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
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

    public void signIn() {
        homepage.clickLogInCigma();
    }

    public void NavTab() {
        homepage.clickHealthInsurance();
        sleepFor(1);
        driver.findElement(By.className("mc_ si27")).isSelected();
        sleepFor(1);

    }

    public void findDoctor() {
        driver.findElement(By.cssSelector("#adBlock > div.da_ > div:nth-child(4)")).click();
    }
    @Test
    public void searchBox() {
        driver.findElement(By.className("sbi")).clear();
        sleepFor(1);
        driver.findElement(By.className("sbi")).sendKeys("plans");
        sleepFor(1);
        driver.findElement(By.className("sbb")).click();
        sleepFor(1);
    }
}

package testPages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomepage extends CommonAPI {
    HomePage homePage;


    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    public void signInButtonTest(){
        homePage.clickAccount();
        sleepFor(1);
        homePage.signIn("myemail@gmail.com", "password");
        sleepFor(1);
        WebElement errorLoginFail = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
        if (errorLoginFail.isDisplayed()){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        }
        else{
            System.out.println("Failed");
            getScreenshot(driver);
        }

    }
    
    public void searchBoxTest(){
        homePage.clearSearchBox();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("anything you want");
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        sleepFor(1);
        System.out.println("success. new page opened");
        getScreenshot(driver);
    }

    public void checkOut() {
        homePage.clearSearchBox();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("lg 4k tv 43rd inch", Keys.ENTER);
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        sleepFor(1);
        driver.findElement(By.id("buy-now-button")).click();
        getScreenshot(driver);

    }

    public void NavProducts() {
        homePage.ClickShopDealsOfTheDay();
        sleepFor(1);
        if(driver.findElement(By.xpath("//*[@id=\"gbox-item-0.0.0\"]/div/div/div[1]/h1/div[1]")).getText().indexOf("Today's Deals")!=-1){
            System.out.println("Success. Message was shown up");
            getScreenshot(driver);
        } else {
            System.out.println("Failed");
            getScreenshot(driver);
        }
    }

    @Test
    public void signOut() {
        homePage.clickScrollDownMenu();
        sleepFor(1);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[35]/li[45]/a")).click();
        sleepFor(1);
        getScreenshot(driver);

    }



}

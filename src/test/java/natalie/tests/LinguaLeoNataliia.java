package natalie.tests;

import natalie.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LinguaLeoNataliia {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/nataliasocinskaa/Documents/SampleUITests/drivers/geckodriver-18.0-mac");
        driver = new FirefoxDriver();
        driver.navigate().to("https://lingualeo.com/ru");
        driver.manage().window().maximize();
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {

        LandingPageNata landingPageNata = new LandingPageNata(driver);
        assertEquals(true, landingPageNata.atThisPage());
        landingPageNata.clickEnterButton();


        LoginPageNata loginPageNata = new LoginPageNata(driver);
        loginPageNata.atThisPage();
        loginPageNata.enterLoginEmail();
        loginPageNata.enterPassword();
        loginPageNata.clickLogin();

        Thread.sleep(3000);

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        assertEquals(true, dashBoardPage.atThisPage());
        dashBoardPage.clickMyProgress();

        Thread.sleep(3000);

        ProgressPage progressPage = new ProgressPage(driver);
        progressPage.atThisPage();

    }

    @Test
    public void addWord() throws InterruptedException {
        // login in
        LandingPageNata landingPageNata = new LandingPageNata(driver);
        assertEquals(true, landingPageNata.atThisPage());
        landingPageNata.clickEnterButton();


        LoginPageNata loginPageNata = new LoginPageNata(driver);
        loginPageNata.atThisPage();
        loginPageNata.enterLoginEmail();
        loginPageNata.enterPassword();
        loginPageNata.clickLogin();


        Thread.sleep(3000);

        //adword test (steps)

        HeaderMenu headerMenu = new HeaderMenu(driver);
        headerMenu.clickDictionaryButton();

        Thread.sleep(3000);


    }

    @AfterTest
    public void close() {
        driver.close();
    }

}

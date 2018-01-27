package alexander.Tests;

import alexander.pages.Dashboard_Page_Alex;
import alexander.pages.Landing_Page_Alex;
import alexander.pages.Login_Page_Alex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test_LoginAlex {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {

    }

    @Test(groups = "UI")
    public void successfulLoginTest() throws InterruptedException {
        Landing_Page_Alex landingPage = new Landing_Page_Alex();
        landingPage.open();
        landingPage.clickEnterButton();

        Login_Page_Alex loginPage = new Login_Page_Alex();
        loginPage.enterLoginEmail();
        loginPage.enterPassword();
        loginPage.clickLogin();

        Dashboard_Page_Alex dashboardPage = new Dashboard_Page_Alex();
        assertTrue(dashboardPage.atDashboardPage());

    }


    @AfterTest
    public void close() {
        driver.close();
    }

}
package alexander.Tests;

import alexander.pages.Dashboard_Page_Alex;
import alexander.pages.Dictionary_Page_Alex;
import alexander.pages.Landing_Page_Alex;
import alexander.pages.Login_Page_Alex;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Test_Dictionary_Alex {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {

    }

    @Test
    public void dictionaryTest() throws InterruptedException {

        Landing_Page_Alex landingPage = new Landing_Page_Alex();
        landingPage.clickEnterButton();

      //  Thread.sleep(3000);

        Login_Page_Alex loginPage = new Login_Page_Alex();
        loginPage.enterLoginEmail();
        loginPage.enterPassword();
        loginPage.clickLogin();

        Thread.sleep(3000);

        Dashboard_Page_Alex dashboard = new Dashboard_Page_Alex();
        assertTrue(dashboard.atDashboardPage());

        dashboard.dictionaryClick();

        Thread.sleep(3000);

        Dictionary_Page_Alex dictionaryPage = new Dictionary_Page_Alex();
        dictionaryPage.enterText();
        Thread.sleep(3000);
        dictionaryPage.addButtonClick();
        Thread.sleep(3000);


        assertEquals(dictionaryPage.dogTextCheck(), "собака");
        dictionaryPage.addDogText();
        Thread.sleep(3000);

        dictionaryPage.deletingWord();
        Thread.sleep(4000);

    }


    @AfterTest
    public void close() {
        driver.close();
    }

}
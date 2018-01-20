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

        Thread.sleep(3000); //поменять на вейт

        // TODO move to atThisPage() check
        String currentTitle = driver.getTitle();
        String expectedTitle = "Мои задания";
        assertEquals(currentTitle, expectedTitle);

        Dashboard_Page_Alex dashboard = new Dashboard_Page_Alex();
        //TODO add atThisPage()
        dashboard.myProgressClick();

        Thread.sleep(3000); //поменять на вейт

        assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/div")).isDisplayed());

    }


    @AfterTest
    public void close() {
        driver.close();
    }

}
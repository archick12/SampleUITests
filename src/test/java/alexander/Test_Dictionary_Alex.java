package alexander;

import alexander.Landing_Page_Alex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        System.setProperty("webdriver.gecko.driver", "/Users/alexanderpustovoy/Documents/SampleUITests/drivers/geckodriver-18.0-mac");
        driver = new FirefoxDriver();
        driver.navigate().to("https://lingualeo.com/ru");
        driver.manage().window().maximize();
    }

    @Test
    public void dictionaryTest() throws InterruptedException {

        Landing_Page_Alex landingPage = new Landing_Page_Alex(driver);
        landingPage.clickEnterButton();

        Thread.sleep(3000);

        Login_Page_Alex loginPage = new Login_Page_Alex(driver);
        loginPage.enterLoginEmail();
        loginPage.enterPassword();
        loginPage.clickLogin();

        Thread.sleep(3000);

        Dashboard_Page_Alex dashboard = new Dashboard_Page_Alex(driver);
        assertTrue(dashboard.atDashboardPage());

        dashboard.dictionaryClick();

        Thread.sleep(3000);

        Dictionary_Page_Alex dictionaryPage = new Dictionary_Page_Alex(driver);
        dictionaryPage.enterText();
        Thread.sleep(3000);
        dictionaryPage.addButtonClick();


    }


    @AfterTest
    public void close() {
        driver.close();
    }

}

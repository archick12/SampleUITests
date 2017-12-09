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

public class Login_Alex {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/alexanderpustovoy/Documents/SampleUITests/drivers/geckodriver-18.0-mac");
        driver = new FirefoxDriver();
        driver.navigate().to("https://lingualeo.com/ru");
        driver.manage().window().maximize();
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        Landing_Page_Alex landingPage = new Landing_Page_Alex(driver);
        landingPage.clickEnterButton();

        Thread.sleep(3000);

        Login_Page_Alex loginPage = new Login_Page_Alex(driver);
        loginPage.enterLoginEmail();
        loginPage.enterPassword();
        loginPage.clickLogin();

        Thread.sleep(3000);

        String currentTitle = driver.getTitle();
        String expectedTitle = "Мои задания";
        assertEquals(currentTitle, expectedTitle);

        WebElement myProgress = driver.findElement(By.xpath("//*[@id=\"tabsControl\"]/li[2]/a"));
        myProgress.click();

        Thread.sleep(3000);

        assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/div")).isDisplayed());

    }

    @AfterTest
    public void close() {
        driver.close();
    }

}
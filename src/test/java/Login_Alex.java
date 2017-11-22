import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Login_Alex {

    WebDriver driver = null;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/alexanderpustovoy/Documents/SampleUITests/drivers/geckodriver-18.0-mac");
        driver = new FirefoxDriver();
    }

    @Test
    public void successfulLoginTest() throws InterruptedException {
        driver.navigate().to("https://lingualeo.com/ru");
        WebElement enterbtn = driver.findElement(By.id("headEnterBtn"));
        enterbtn.click();

        Thread.sleep(3000);

        WebElement loginEmail = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/input"));
        loginEmail.sendKeys("pustovoyalexander@gmail.com");
        WebElement loginPassword = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/input"));
        loginPassword.sendKeys("Qwerty12!");
        WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button"));
        loginbtn.click();

        Thread.sleep(3000);

        String currentTitle = driver.getTitle();
        String expectedTitle = "Мои задания";
        assertEquals(currentTitle, expectedTitle);

        WebElement myProgress = driver.findElement(By.xpath("//*[@id=\"tabsControl\"]/li[2]/a"));
        myProgress.click();

        Thread.sleep(3000);

        assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[1]/div")).isDisplayed());

        driver.close();
    }

}

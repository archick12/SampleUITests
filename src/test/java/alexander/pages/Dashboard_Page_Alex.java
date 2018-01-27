package alexander.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public class Dashboard_Page_Alex {

    public Dashboard_Page_Alex() {
        this.driver = RemoteDriverManager.getDriver();
    }

    WebDriver driver = null;
    String dictionaryBtn_xpath = "//*[contains(@class, 'b-dict-link b-header__dict')]";
    String leoText_class = "dash-intro__title";

    public void dictionaryClick() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dictionaryBtn_xpath)));

        WebElement dictionaryBtn = driver.findElement(By.xpath(dictionaryBtn_xpath));
        dictionaryBtn.click();
    }

    public boolean atDashboardPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className(leoText_class)));
        return driver.findElement(By.className(leoText_class)).isDisplayed();
    }

}
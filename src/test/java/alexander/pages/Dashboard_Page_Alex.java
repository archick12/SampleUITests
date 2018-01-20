package alexander.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard_Page_Alex {

    public Dashboard_Page_Alex() {
        this.driver = RemoteDriverManager.getDriver();
    }

    WebDriver driver = null;
    String dictionaryBtn_class = "//*[contains(@class, 'b-dict-link b-header__dict')]";
    String myProgress_xpath = "//*[@id=\"tabsControl\"]/li[2]/a";
    String leoText_class = "dash-intro__title";


    public void dictionaryClick() {
        WebElement dictionaryBtn = driver.findElement(By.xpath(dictionaryBtn_class));
        dictionaryBtn.click();
    }

    public void myProgressClick() {
        WebElement myProgress = driver.findElement(By.xpath(myProgress_xpath));
        myProgress.click();
    }

    public boolean atDashboardPage() {
        WebElement leoText = driver.findElement(By.className(leoText_class));
        return (leoText.isDisplayed());
    }

}
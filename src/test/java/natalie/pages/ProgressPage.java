package natalie.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressPage {

    // selectors

    private WebDriver driver;
    private String myProgressTitle = "//*[contains(text(),'Мой прогресс') and @class='journal-page__title' ]";


    // constructor for driver initialization

    public ProgressPage() {
        this.driver = RemoteDriverManager.getDriver();
    }

    // action methods


    public boolean atThisPage() {
        return driver.findElement(By.xpath(myProgressTitle)).isDisplayed();
    }

}

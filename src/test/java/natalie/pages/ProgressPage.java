package natalie.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProgressPage {

    // selectors

    private WebDriver driver;
    private String myProgressTitle = "//*[contains(text(),'Мой прогресс') and @class='journal-page__title' ]";


    // constructor for driver initialization

    public ProgressPage(WebDriver driver) {
        this.driver = driver;
    }

    // action methods


    public boolean atThisPage() {
        return driver.findElement(By.xpath(myProgressTitle)).isDisplayed();
    }

}

package natalie.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderMenu {
    // selectors
    private WebDriver driver;
    private String dictionaryBtnXpath = "//*[contains(@class,'-dict-link b-header__dict')]";


    // constructor for driver initialization

    public HeaderMenu() {

        this.driver = RemoteDriverManager.getDriver();
    }

    // action methods

    public void clickDictionaryButton(){

        WebElement dictionaryBtn = driver.findElement(By.xpath(dictionaryBtnXpath));
        dictionaryBtn.click();

    }

}

package natalie.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderMenu {
    // selectors
    private WebDriver driver;
    private String dictionaryBtnXpath = "//*[contains(@class,'-dict-link b-header__dict')]";


    // constructor for driver initialization

    public HeaderMenu(WebDriver driver) {
        this.driver = driver;
    }

    // action methods

    public void clickDictionaryButton(){

        WebElement dictionaryBtn = driver.findElement(By.xpath(dictionaryBtnXpath));
        dictionaryBtn.click();

    }

}

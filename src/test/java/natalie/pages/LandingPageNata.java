package natalie.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageNata {

    private WebDriver driver;
    private String enterbtn_id = "headEnterBtn";
    private String welcomeText = "//*[contains(@class,'head-simple__logo')]";


    public LandingPageNata(WebDriver driver) {
        this.driver = driver;
    }


    public void clickEnterButton() {  /// метод взаимодействия с вебэелеме
        WebElement enterbtn = driver.findElement(By.id(enterbtn_id));
        enterbtn.click();
    }

    public boolean atThisPage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath(welcomeText)).isDisplayed();

    }
}
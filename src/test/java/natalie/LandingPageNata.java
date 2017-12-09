package natalie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageNata {

    private WebDriver driver;
    private String enterbtn_id = "headEnterBtn";


    private WebElement welcomeText = driver.findElement(By.xpath("//*[@class='welcome__content']"));


    public LandingPageNata(WebDriver driver) {
        this.driver = driver;
    }


    public void clickEnterButton() {  /// метод взаимодействия с вебэелеме
        WebElement enterbtn = driver.findElement(By.id(enterbtn_id));
        enterbtn.click();
    }

    public boolean atThisPage() {
        return welcomeText.isDisplayed();

    }
}
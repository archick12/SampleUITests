package alexander.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Landing_Page_Alex {

    WebDriver driver = null;
    String enterbtn_id = "headEnterBtn";
    String popupLoginButton_xpath = "/html/body/div[8]/div[2]/div/div[2]/div/div[2]/button[2]";

    public Landing_Page_Alex() {
        this.driver = RemoteDriverManager.getDriver();
    }

    public void clickEnterButton() {
        WebElement enterbtn = driver.findElement(By.id(enterbtn_id));
        enterbtn.click();
    }

    public boolean atLoginPage() {
        WebElement popupLoginButton = driver.findElement(By.xpath(popupLoginButton_xpath));
        return (popupLoginButton.isDisplayed());
    }

}
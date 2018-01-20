package alexander.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Landing_Page_Alex {

    public Landing_Page_Alex() {
        this.driver = RemoteDriverManager.getDriver();
    }

    WebDriver driver = null;
    String enterbtn_id = "headEnterBtn";
    String popupLoginButton_xpath = "/html/body/div[8]/div[2]/div/div[2]/div/div[2]/button[2]";

    public void clickEnterButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(enterbtn_id)));
        WebElement enterbtn = driver.findElement(By.id(enterbtn_id));
        enterbtn.click();
    }

    public void open(){
        driver.navigate().to("https://lingualeo.com/ru");
    }

    public boolean atLoginPage() {
        WebElement popupLoginButton = driver.findElement(By.xpath(popupLoginButton_xpath));
        return (popupLoginButton.isDisplayed());
    }

}
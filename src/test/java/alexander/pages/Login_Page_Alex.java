package alexander.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_Page_Alex {

    WebDriver driver = null;
    String loginEmail_xpath = "//*[@id=\"loginForm\"]/div/div[1]/input";
    String loginPassword_xpath = "//*[@id=\"loginForm\"]/div/div[2]/input";
    String loginbtn_xpath = "//*[@id=\"loginForm\"]/button";

    public Login_Page_Alex() {
        this.driver = RemoteDriverManager.getDriver();
    }

    public void enterLoginEmail() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(loginEmail_xpath)));

        WebElement loginEmail = driver.findElement(By.xpath(loginEmail_xpath));
        loginEmail.sendKeys("pustovoyalexander@gmail.com");
    }

    public void enterPassword() {
        WebElement loginPassword = driver.findElement(By.xpath(loginPassword_xpath));
        loginPassword.sendKeys("Qwerty12!");
    }

    public void clickLogin() {
        WebElement loginbtn = driver.findElement(By.xpath(loginbtn_xpath));
        loginbtn.click();
    }

}
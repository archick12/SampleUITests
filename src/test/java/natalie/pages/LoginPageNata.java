package natalie.pages;

import alexander.Utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNata {


    WebDriver driver = null;
    String loginEmail_xpath = "//*[@id=\"loginForm\"]/div/div[1]/input";
    String loginPassword_xpath = "//*[@id=\"loginForm\"]/div/div[2]/input";
    String loginbtn_xpath = "//*[@id=\"loginForm\"]/button";

    public LoginPageNata() {
        this.driver = RemoteDriverManager.getDriver();

    }


    public LoginPageNata enterLoginEmail() {
        WebElement loginEmail = driver.findElement(By.xpath(loginEmail_xpath));
        loginEmail.sendKeys("nataly333k@gmail.com");
        return this;
    }

    public LoginPageNata enterPassword() {
        WebElement loginPassword = driver.findElement(By.xpath(loginPassword_xpath));
        loginPassword.sendKeys("Vqw92x");
        return this;
    }

    public LoginPageNata clickLogin() {
        WebElement loginbtn = driver.findElement(By.xpath(loginbtn_xpath));
        loginbtn.click();
        return this;
    }

    public boolean atThisPage() {
        return driver.findElement(By.xpath(loginEmail_xpath)).isDisplayed();

    }


}

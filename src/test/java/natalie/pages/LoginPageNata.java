package natalie.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNata {


    WebDriver driver = null;
    String loginEmail_xpath = "//*[@id=\"loginForm\"]/div/div[1]/input";
    String loginPassword_xpath = "//*[@id=\"loginForm\"]/div/div[2]/input";
    String loginbtn_xpath = "//*[@id=\"loginForm\"]/button";

    public LoginPageNata(WebDriver driver) {
        this.driver = driver;
    }


    public void enterLoginEmail() {
        WebElement loginEmail = driver.findElement(By.xpath(loginEmail_xpath));
        loginEmail.sendKeys("nataly333k@gmail.com");
    }

    public void enterPassword() {
        WebElement loginPassword = driver.findElement(By.xpath(loginPassword_xpath));
        loginPassword.sendKeys("Vqw92x");
    }

    public void clickLogin() {
        WebElement loginbtn = driver.findElement(By.xpath(loginbtn_xpath));
        loginbtn.click();
    }

    public boolean atThisPage() {
        return driver.findElement(By.xpath(loginEmail_xpath)).isDisplayed();

    }


}

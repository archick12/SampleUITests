package natalie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNata {


    private WebDriver driver = null;

    private WebElement loginbtn = driver.findElement(By.xpath("//*[@id='loginForm']/button"));
    private WebElement loginPassword = driver.findElement(By.xpath("//*[@id='loginForm']/div/div[2]/input"));
    private WebElement loginEmail = driver.findElement(By.xpath("//*[@id='loginForm']/div/div[1]/input"));
    private WebElement forgotPasswordButton = driver.findElement(By.xpath("//*[@class='uauth-email__forget']"));

    public LoginPageNata(WebDriver driver) {
        this.driver = driver;
    }


    public void enterLoginEmail(String email) {
        loginEmail.sendKeys(email);
    }

    public void enterPassword(String pass) {
        loginPassword.sendKeys(pass);
    }

    public void loginBtn() {
        loginbtn.click();

    }

    public boolean atThisPage() {
        return forgotPasswordButton.isDisplayed();

    }


}

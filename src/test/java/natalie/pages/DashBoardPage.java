package natalie.pages;

import natalie.utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {

    // selectors

    private WebDriver driver;
    private String myProgresButton = "//*[contains(text(),'Мой прогресс')]";
    private String myProgressTitle = "//*[contains(text(),'Мой прогресс') and @class='journal-page__title' ]";


    // constructor for driver initialization

    public DashBoardPage() {

        RemoteDriverManager.getDriver(); }

    // action methods

    public void clickMyProgress() {
        WebElement myProgressBtn = driver.findElement(By.xpath(myProgresButton));
        myProgressBtn.click();

    }

    public boolean atThisPage() {
        String currentTitle = driver.getTitle();
        String expectedTitle = "Мои задания";
        return expectedTitle.equals(currentTitle);
    }

}

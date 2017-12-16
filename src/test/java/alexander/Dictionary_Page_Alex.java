package alexander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dictionary_Page_Alex {

    public Dictionary_Page_Alex(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver = null;
    String findField_xpath = "//*[contains(@class, 'input-text f-left placeholder-light')]";
    String addButton_xpath = "//*[@id=\"glossaryPage\"]/div[3]/div[2]/div[1]/div[2]/div/div/form/button";


    public void enterText() {
        WebElement findField = driver.findElement(By.xpath(findField_xpath));
        findField.sendKeys("dog");
    }

    public void addButtonClick() {
        WebElement addButton = driver.findElement(By.xpath(addButton_xpath));
        addButton.click();
    }
}
package alexander.pages;

import com.sun.xml.internal.ws.model.WrapperBeanGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;


public class Dictionary_Page_Alex {

    public Dictionary_Page_Alex(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver = null;
    String findField_xpath = "//*[contains(@class, 'input-text f-left placeholder-light')]";
    String addButton_xpath = "//*[@id=\"glossaryPage\"]/div[3]/div[2]/div[1]/div[2]/div/div/form/button";
    String dogText_xpath = "/html/body/div[12]/div[3]/div/div[1]/a[1]/span";
    String newWord_xpath = "//*[@id=\"glossaryPage\"]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[6]";
    String deletingWord_xpath = "//*[@id=\"glossaryPage\"]/div[6]/div[2]/div[1]/a[1]";


    public void enterText() {
        WebElement findField = driver.findElement(By.xpath(findField_xpath));
        findField.sendKeys("dog");
    }

    public void addButtonClick() {
        WebElement addButton = driver.findElement(By.xpath(addButton_xpath));
        addButton.click();
    }

    public String dogTextCheck() {
        WebElement dogText = driver.findElement(By.xpath(dogText_xpath));
        return dogText.getText();
    }

    public void addDogText() {
        WebElement dogText = driver.findElement(By.xpath(dogText_xpath));
        dogText.click();
    }

    public void deletingWord() {
        WebElement newWord = driver.findElement(By.xpath(newWord_xpath));
        newWord.click();
        WebElement deleteWord = driver.findElement(By.xpath(deletingWord_xpath));
        deleteWord.click();
    }
}
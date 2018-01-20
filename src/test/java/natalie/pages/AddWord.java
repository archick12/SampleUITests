package natalie.pages;

import natalie.utils.RemoteDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddWord {

    WebDriver driver = null;

    String searchField = "input-text";
    String buttonAdd = "@class=btn find-word inactive";
    String dictionary = "b-dict-link";

    String deleteButton = "@class=item-word-delete";

    //addWord.enterNewWord();
    //addWord.clickButtonAdd();
    //addWord.clickAddedWord();
    //addWord.DeleteAddedWord();

    public AddWord() {

        this.driver = RemoteDriverManager.getDriver();
    }


    public void enterNewWord() {
        WebElement enterdictionary = driver.findElement(By.className(dictionary));
        enterdictionary.click();

        WebElement enterInSearch = driver.findElement(By.className(searchField));
        enterInSearch.sendKeys("Ollla");
        enterInSearch.click();
    }

    //public void deleteNewbutton(){
     //   WebElement enterDeleteWord = driver.findElement(By.className(deleteButton));

   // }

}

   // public void clickButtonAdd() {
    //    WebElement enterInSearch = driver.findElement(By.class(buttonAdd));
     //   enterInSearch.sendKeys("Ollla");

//}

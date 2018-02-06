package natalie.tests;

import natalie.pages.*;
import natalie.utils.RemoteWebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LinguaLeoNataliia {

  @BeforeTest
  public void setUp() {

  }

  @Test(groups = "UI")
  public void successfulLoginTest() throws InterruptedException {

    LandingPageNata landingPageNata = new LandingPageNata();
    landingPageNata.open();
    assertEquals(true, landingPageNata.atThisPage());
    landingPageNata.clickEnterButton();

    LoginPageNata loginPageNata = new LoginPageNata();
    loginPageNata.atThisPage();
    loginPageNata.enterLoginEmail();
    loginPageNata.enterPassword();
    loginPageNata.clickLogin();

    Thread.sleep(3000);

    DashBoardPage dashBoardPage = new DashBoardPage();
    assertEquals(true, dashBoardPage.atThisPage());
    dashBoardPage.clickMyProgress();

    Thread.sleep(3000);
    ProgressPage progressPage = new ProgressPage();
    progressPage.atThisPage();

  }

  @Test(groups = "UI, SKIP")
  public void addWord() throws InterruptedException {
    // login in
    LandingPageNata landingPageNata = new LandingPageNata();
    assertEquals(true, landingPageNata.atThisPage());
    landingPageNata.clickEnterButton();
    LoginPageNata loginPageNata = new LoginPageNata();
    loginPageNata.atThisPage();
    loginPageNata.enterLoginEmail().enterPassword().clickLogin();
    Thread.sleep(4000);
    AddWord addWord = new AddWord();
    addWord.enterNewWord();
    //addWord.clickButtonAdd();
    //addWord.clickAddedWord();
    //addWord.DeleteAddedWord();
    HeaderMenu headerMenu = new HeaderMenu();
    Thread.sleep(3000);
  }

  @AfterTest
  public void close() {

  }

}

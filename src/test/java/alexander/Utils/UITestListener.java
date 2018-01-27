package alexander.Utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UITestListener implements ITestListener{


    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext result) {

        String browserName = result.getCurrentXmlTest().getParameter("browserName");
        WebDriver driver = RemoteWebDriverFactory.createInstance(browserName);
        RemoteDriverManager.setWebDriver(driver);

    }

    public void onFinish(ITestContext context) {

        RemoteDriverManager.closeDriver();

    }
}
package GuiTestCases;

import Google.Home;
import Google.SearchResults;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTestCase {
    private WebDriver driver;
    private JSONFileManager testData = new JSONFileManager("src/test/resources/TestDataFiles/googleSearch.json");

    @Description("Given the browser is open, And I navigate to Google.com, When I search for 'Selenium WebDriver', Then The third result text contains \"What is Selenium WebDriver?\" ")
    @Test(description = "Check That the Third Search Result Contains 'What is Selenium Web Driver?")
    public void searchForSeleniumWebDriverAndCheckThatTheResultStatsContainsWhatIsSeleniumWebDriver() {

        new Home(driver).navigate()
                .search( testData.getTestData("searchQuery"));

        Validations.assertThat()
                .element(driver, SearchResults.getResultStats_label())
                .text()
                .contains("What is Selenium Web Driver?")
                .withCustomReportMessage("Assert That The Third Result Contains 'What is Selenium Web Driver?' ")
                .perform();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }

}



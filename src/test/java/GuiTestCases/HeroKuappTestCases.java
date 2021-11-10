package GuiTestCases;


import HeroKuapp.Example2Page;
import HeroKuapp.HeroKuappHome;
import HeroKuapp.UploadedFilePage;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Validations;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeroKuappTestCases {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
    }

    @Description("Given the browser is open, And I navigate to 'the-internet.herokuapp.com', When I Navigate to Upload File and upload picture, Then The Upload Message should Be 'File Uploaded'")
    @Test(description = "Check That The File is Uploaded")
    public void uploadFileOnHeroKappaAndValidatedTheUploadIsDone() {
        new HeroKuappHome(driver).navigate().
                navigateToUploadPage().uploadFile();

        Validations.assertThat().
                element(driver, UploadedFilePage.getUpload_Message())
                .text().contains("File Uploaded")
                .withCustomReportMessage("Assert That The File is Uploaded")
                .perform();
    }

    @Description("Given the browser is open, And I navigate to 'the-internet.herokuapp.com', When I Navigate to Dynamic Loading and Go to Example 2 and Click on Start, Then After Loading Hello World! Message Appears")
    @Test(description = "Check That Hello World Message Appears After Loading")
    public void dynamicLoadingOnHeroKappaAndValidatedHelloWorldMessageAfterLoading() {
        new HeroKuappHome(driver).navigate()
                .navigateToDynamicLoadingPage()
                .NavigateToExample2Page();

        Validations.assertThat()
                .element(driver, new Example2Page(driver)
                     .startDynamicLoading())
                .text().contains("Hello World!")
                .withCustomReportMessage("Assert That Hello World Message Appears After Loading")
                .perform();
    }

    @AfterMethod
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }

}

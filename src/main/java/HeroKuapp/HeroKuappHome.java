package HeroKuapp;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HeroKuappHome {
    //variables
    private final WebDriver driver;
    private final String url = System.getProperty("herokuappURL");


    //locators
    private static final By upload_FilePage = By.xpath("//a[contains(.,'File Upload')]");
    private static final By dynamic_LoadingPage = By.xpath("//a[contains(.,'Dynamic Loading')]");

    //constructor
    public HeroKuappHome(WebDriver driver) {
        this.driver = driver;
    }

    //keywords / actions
    /**
     * Navigates to HeroKuapp home
     * @return self-reference
     * Navigation Link available in Environment Properties File
     */
    public HeroKuappHome navigate() {
        BrowserActions.navigateToURL(driver, url);
        return this;
    }
    /**
     *Navigates to File Upload Page
     *@return File Upload Page
     */

    public FileUploadPage navigateToUploadPage(){
        ElementActions.click(this.driver,upload_FilePage);
        return new FileUploadPage(driver);

   }
    /**
     *Navigates to Dynamic Example Page
     * @return Dynamic Example Page
     */
    public DynamicExamplePage navigateToDynamicLoadingPage(){
        ElementActions.click(this.driver,dynamic_LoadingPage);
        return new DynamicExamplePage(driver);
    }

}

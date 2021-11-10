package HeroKuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadedFilePage {

    //variables
    private WebDriver driver;

    //locators
    final static By upload_Message = By.xpath("//h3[contains(.,'File Upload')]");

    //constructor
    public UploadedFilePage(WebDriver driver) {
        this.driver = driver;
    }

    //keywords / actions
    /**
     *  @return Locator to be used in Assertions
     */
    public static By getUpload_Message() {
        return upload_Message;
    }



}
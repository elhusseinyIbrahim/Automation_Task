package HeroKuapp;

import com.shaft.gui.element.ElementActions;
import com.shaft.tools.io.JSONFileManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {



    //variables
    private final WebDriver driver;

    private JSONFileManager testData1 = new JSONFileManager("src/test/resources/TestDataFiles/UploadsPath.json");

    //locators
    private final By upload_Button = By.id("file-submit");

    private static final By chose_File = By.name("file");

    //constructor
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    //keywords / actions

    /**
     * takes action to type  file path to be uploaded and click upload Button
     * Upload Path is Available in UploadsPath Json File
     */
    public void uploadFile() {
        ElementActions.typeFileLocationForUpload(driver, chose_File,
                System.getProperty("user.dir") + testData1.getTestData("shaftPicture"));
        ElementActions.click(driver, upload_Button);
    }

}

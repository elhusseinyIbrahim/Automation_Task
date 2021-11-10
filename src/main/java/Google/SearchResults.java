package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults {
    //variables
    final WebDriver driver;

    //locators
    /** locator for 5th search Result which will make the case pass
    * h3[contains(.,'What is Selenium Web Driver?')]
    */
    final static By resultStats_label = By.xpath("//h3[contains(.,'selenium-webdriver - npm')]");
    public static By getResultStats_label() {
        return resultStats_label;
    }


    //constructor
    public SearchResults(WebDriver driver) {
        this.driver = driver;
    }

    //keywords
}
package Google;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {
    //variables
    private WebDriver driver;
    private String url = System.getProperty("googleURL");

    //locators
        private static By search_textBox = By.name("q"); // *[@name='q']

    //constructor
    public Home(WebDriver driver) {
        this.driver = driver;
    }

    //keywords / actions
    /**
     * Navigates to google home
     * @return self-reference
     */
    public Home navigate() {
        BrowserActions.navigateToURL(driver, url);
        return this;
    }
    public SearchResults search(String query) {
        /**
         * Searches for a given string and presses enter
         * @param query the string that you want to search for
         * @return self-reference
         */
        ElementActions.type(driver, search_textBox, query);
        ElementActions.keyPress(driver, search_textBox, Keys.ENTER);
        return new SearchResults(driver);
    }

}

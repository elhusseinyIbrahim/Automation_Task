package HeroKuapp;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicExamplePage {

    //variables
    private final WebDriver driver;

    //locators
    private static final By dynamic_Example2 = By.xpath("//a[contains(.,'Element rendered')]");

    //constructor
    public DynamicExamplePage(WebDriver driver) {
        this.driver = driver;
    }

    //keywords / actions
    /**
     * Navigates to Navigate To Example 2 Page
     */
    public void NavigateToExample2Page() {
        ElementActions.click(this.driver, dynamic_Example2);
    }


}

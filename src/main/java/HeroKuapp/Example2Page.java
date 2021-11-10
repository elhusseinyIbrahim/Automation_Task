package HeroKuapp;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Example2Page {

    //variables
    private final WebDriver driver;

    //locators
    private static final By start_Button = By.xpath("//*[@id=\"start\"]/button");
    private static final By hello_Text = By.xpath("//*[@id=\"finish\"]/h4");

    //constructor
    public Example2Page(WebDriver driver) {
        this.driver = driver;
    }

    //keywords / actions
    /**
     *takes action to start the Dynamic Loading
     * then wait for the Text to Appear
     *  @return The Text Value
     */
    public By startDynamicLoading(){
        new ElementActions(driver)
                .click(start_Button)
                .waitForElementToBePresent(hello_Text,2,true)
                .getText(hello_Text);
        return hello_Text;
    }
}

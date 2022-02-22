package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    //Locators
    //SignIn Button
    @FindBy(css = "")
    private WebElement insights;
    //UserAvatar
    @FindBy(xpath = "")
    private WebElement webinars;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

}

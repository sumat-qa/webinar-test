package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.HomePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    private static WebDriver driver;
    private HomePage homePage;

    @BeforeAll
    public static void setUp() {
        String chromedriverPath = SystemUtils.IS_OS_WINDOWS ? "/bin/chromedriver.exe":"/bin/chromedriver";
        File chromedriverFile = new File(HomePageSteps.class.getResource(chromedriverPath).getFile());
        System.setProperty("webdriver.chrome.driver", chromedriverFile.getAbsolutePath());

        //Use Chrome driver
        driver = new ChromeDriver();
        //full screen window
        driver.manage().window().maximize();
        // wait for the element to appear before the exception occurs
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("I load the homepage")
    public void loadHomePage(String url) throws Exception {
        
    }

    @When("I hover over Insights Button")
    public void clickInsightsButton() throws Exception {
  
    }

    @Then("I click on Webinars drop down")
    public void clickOnWebinarsDropDown() throws Exception {

    }

    @And("I validate the number of webinars")
    public void validateCountOfWebinars() throws Exception {
	//Obtain count of webinars
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}

package stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeLoginSteps {
    WebDriver driver;

    @Given("I lunch chrome browser")
    public void chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @When("I open orange homepage")
    public void orange_homepage() {
    driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo is displayed on the page")
    public void verify_logo() {
    boolean status=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Then("Close the browser")
    public void close_browser() {
       driver.close();
    }
}

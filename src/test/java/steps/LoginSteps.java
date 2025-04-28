package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonMethods {

    //public WebDriver driver;

    @Given("user is able to access the HRMS application")
    public void user_is_able_to_access_the_hrms_application() {
        openBrowserAndLaunchApplication();
        // Write code here that turns the phrase above into concrete actions
        //driver = new ChromeDriver();
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().window().maximize();

    }

    @When("user enters valid user name and password")
    public void user_enters_valid_user_name_and_password() {

        // Write code here that turns the phrase above into concrete actions
        WebElement usernameFeild = driver.findElement(By.id("txtUsername"));
        //usernameFeild.sendKeys("admin");
        sendText(ConfigReader.read("userName"),usernameFeild);
        WebElement passwordFeild = driver.findElement(By.id("txtPassword"));
        //passwordFeild.sendKeys("Hum@nhrm123");
        sendText(ConfigReader.read("password"),passwordFeild);

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        // Write code here that turns the phrase above into concrete actions
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        click(loginButton);
        //loginButton.click();


    }

    @Then("user has is able to see the dashboard page")
    public void user_has_is_able_to_see_the_dashboard_page() {

        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test has passed");

    }

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        // Write code here that turns the phrase above into concrete actions
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        click(pimOption);
        //pimOption.click();
    }


}

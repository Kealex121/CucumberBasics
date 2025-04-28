package steps;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.time.Duration;

public class Hooks extends CommonMethods {
    @Before
    public void start(){
        openBrowserAndLaunchApplication();
        //driver=new ChromeDriver();
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().window().maximize();
    }

    @After
    public void end(){
        closeBrowser();
        //driver.quit();
    }






}

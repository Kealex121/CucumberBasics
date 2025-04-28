package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("when user clicks on Add employee option")
    public void when_user_clicks_on_add_employee_option() {
        WebElement addEmpoption = driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmpoption.click();
        click(addEmpoption);
    }

        @When("user enters first name and last name")
    public void user_enters_first_name_and_last_name() {
        // Write code here that turns the phrase above into concrete actions
        WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        WebElement lastNameLocator = driver.findElement(By.id("lastName"));
        sendText("mark",firstNameLocator);
        sendText("jacob",lastNameLocator);
        //firstNameLocator.sendKeys("mark");
        //lastNameLocator.sendKeys("jacob");
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        click(saveButton);
        //saveButton.click();
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Steps will be implemented later");
    }

    @When("user adds firstname middlename and lastname")
    public void user_adds_firstname_middlename_and_lastname() {
        // Write code here that turns the phrase above into concrete actions
        WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        WebElement lastNameLocator = driver.findElement(By.id("lastName"));
        WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        sendText("mark",firstNameLocator);
        sendText("kiram",middleNameLocator);
        sendText("jacob",lastNameLocator);
        //firstNameLocator.sendKeys("mark");
        //lastNameLocator.sendKeys("jacob");
        //middleNameLocator.sendKeys("karim");
    }

    @Given("user is unable to access HRMS application")
    public void user_is_unable_to_access_hrms_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Steps will be implemented later");
    }

    @When("user enters invalid name and password")
    public void user_enters_invalid_name_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Steps will be implemented later");
    }

    @Then("user can see error message")
    public void user_can_see_error_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Steps will be implemented later");
    }

    @When("user enters {string} and {string} and {string} the application")
    public void user_enters_and_and_the_application(String firstName, String middleName, String lastName) {
        // Write code here that turns the phrase above into concrete actions
        WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        WebElement lastNameLocator = driver.findElement(By.id("lastName"));
        WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        sendText("firstName",firstNameLocator);
        sendText("middleName",middleNameLocator);
        sendText("lastName",lastNameLocator);
        //firstNameLocator.sendKeys(firstName);
        //middleNameLocator.sendKeys(middleName);
        //lastNameLocator.sendKeys(lastName);
    }

    @When("user adds {string}, {string}, and {string}")
    public void user_adds_and(String fn, String mn, String ln) {
        // Write code here that turns the phrase above into concrete actions
        WebElement firstNameLocator = driver.findElement(By.id("firstName"));
        WebElement lastNameLocator = driver.findElement(By.id("lastName"));
        WebElement middleNameLocator = driver.findElement(By.id("middleName"));
        sendText("fn",firstNameLocator);
        sendText("mn",middleNameLocator);
        sendText("ln",lastNameLocator);
        //firstNameLocator.sendKeys(fn);
        //middleNameLocator.sendKeys(mn);
        //lastNameLocator.sendKeys(ln);

    }

    @When("user adds multiple employees using data table and save them")
    public void user_adds_multiple_employees_using_data_table_and_save_them(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> employeeNames = dataTable.asMaps();

        for (Map<String, String> employee : employeeNames) {
            WebElement firstNameLocator = driver.findElement(By.id("firstName"));
            WebElement middleNameLocator = driver.findElement(By.id("middleName"));
            WebElement lastNameLocator = driver.findElement(By.id("lastName"));

            sendText(employee.get("firstName"),firstNameLocator);
            sendText(employee.get("middleName"),middleNameLocator);
            sendText(employee.get("lastName"),lastNameLocator);
            //firstNameLocator.sendKeys(employee.get("firstName"));
            //middleNameLocator.sendKeys(employee.get("middleName"));
            //lastNameLocator.sendKeys(employee.get("lastName"));

            WebElement saveButton = driver.findElement(By.id("btnSave"));
            click(saveButton);
            //saveButton.click();

            WebElement addEmpoption = driver.findElement(By.id("menu_pim_addEmployee"));
            click(addEmpoption);
            //addEmpoption.click();
        }
    }

    @When("user adds multiple employees from excel file")
    public void user_adds_multiple_employees_from_excel_file() throws IOException {
        List<Map<String, String>> newEmployees = ExcelReader.read();
        for (Map<String, String> employee : newEmployees) {

            WebElement firstNameLocator = driver.findElement(By.id("firstName"));
            WebElement middleNameLocator = driver.findElement(By.id("middleName"));
            WebElement lastNameLocator = driver.findElement(By.id("lastName"));

            sendText(employee.get("firstName"),firstNameLocator);
            sendText(employee.get("middleName"),middleNameLocator);
            sendText(employee.get("lastName"),lastNameLocator);
            //firstNameLocator.sendKeys(employee.get("firstName"));
            //middleNameLocator.sendKeys(employee.get("middleName"));
            //lastNameLocator.sendKeys(employee.get("lastName"));

            WebElement saveButton = driver.findElement(By.id("btnSave"));
            click(saveButton);
            //saveButton.click();

            WebElement addEmpoption = driver.findElement(By.id("menu_pim_addEmployee"));
            click(addEmpoption);
            //addEmpoption.click();

        }


    }
}



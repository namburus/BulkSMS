package StepDefinitions;

import PageObjects.loginPage;
import factory.driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class loginSteps {
    WebDriver driver;
    loginPage lp;

    public loginSteps() throws IOException {
        driver = driverfactory.getDriver();
        lp = new loginPage(driver);
    }

    @Given("i am on the log in page")
    public void i_am_on_the_log_in_page() {
        System.out.println("1st step");
        lp.click_admin_login();

    }

    @When("i enter the username and password")
    public void i_enter_the_username_and_password() {
        System.out.println("2nd step");
        lp.enter_username("sn42116991@gmail.com");
        lp.enter_password("Shivaji@namburu");
    }

    @When("click on the login")
    public void click_on_the_login() {
        System.out.println("3rd step");
        lp.click_login();

    }

    @Then("i should log into the application")
    public void i_should_log_into_the_application() {
        System.out.println("4th step");
        lp.check_login();

    }
}

package com.WebDriverUniversity.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


public class LoginPageTest extends FunctionalTest {
	@Given("^user opens login\\-portal page$")
    public void user_opens_loginportal_page() throws Throwable {
    	driver.get("http://webdriveruniversity.com/Login-Portal/index.html");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginPortal("user", "pass");
    }

    @When("^user inputs valid for \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_inputs_valid_for_something_and_something(String username, String password, String strArg1, String strArg2) throws Throwable {
       
    }

    @Then("^user is redirected to a verification page$")
    public void user_is_redirected_to_a_verification_page() throws Throwable {
        
    }

    @And("^user clicks Login button$")
    public void user_clicks_login_button() throws Throwable {
        
    }

}